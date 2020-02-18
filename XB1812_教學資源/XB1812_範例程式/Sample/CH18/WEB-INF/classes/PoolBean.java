//==================== PoolBean.java ======================
package myBean;
import java.io.*;
import java.sql.*;
import java.util.*;
public class PoolBean
  {
  private String driver = null;
  private String url = null;
  private int size = 0;
  private String username = "";
  private String password = "";
  private ConnBean connBean=null;
  private Vector pool = null;
  public PoolBean(){ }
  public void setDriver(String d){
    if (d!=null) driver=d;
  }
  public String getDriver(){
    return driver;
  }
  public void setURL(String u){
    if (u!=null) url=u;
  }
  public String getURL(){
    return url;
  }
  public void setSize(int s){
    if (s>1) size=s;
  }
  public int getSize(){
    return size;
  }
  public void setUserName(String un){
    if (un!=null) username=un;
  }
  public String getUserName(){
    return username;
  }
  public void setPassword(String pw){
    if (pw!=null) password=pw;
  }
  public String getPassword(){
    return password;
  }
  public void setConnBean(ConnBean cb){
    if (cb!=null) connBean=cb;
  }
  public ConnBean getConnBean() throws Exception{
    Connection con = getConnection();
    ConnBean cb = new ConnBean(con);
    cb.setInuse(true);
    return cb;
  }
  private Connection createConnection() throws Exception{
    Connection con = null;
    con = DriverManager.getConnection(url,username,password);
    return con;
  }
  public synchronized void initializePool() throws Exception{
    if (driver==null)
      throw new Exception("沒提供驅動程式名稱!");
    if (url==null)
      throw new Exception("沒提供URL!");
    if (size<1)
      throw new Exception("連結池大小小於一!");
    try{
      Class.forName(driver);
      System.out.println("建立連線池：");
      System.out.println("驅動程式名稱="+driver);
      System.out.println("url="+url);
      for (int i=0; i<size; i++){
        System.out.println("建立第 "+i+" 個Connection 物件");
        Connection con = createConnection();
        if (con!=null){
          ConnBean connBean = new ConnBean(con);
          addConnection(connBean);
        }
      }
    }catch(Exception e){
      System.err.println(e.getMessage());
      throw new Exception(e.getMessage());
    }
  }
  private void addConnection(ConnBean connBean){
    if (pool==null) pool=new Vector(size);
    pool.addElement(connBean);
  }
  public synchronized void releaseConnection(Connection con){
    for (int i=0; i<pool.size(); i++){
      ConnBean connBean = (ConnBean)pool.elementAt(i);
      if (connBean.getConnection()==con){
        System.out.println("\t釋放第 " + i + " 個Connection物件");
        connBean.setInuse(false);
        break;
      }
    }
  }
  public synchronized Connection getConnection()
  throws Exception{
    ConnBean connBean = null;
    for (int i=0; i<pool.size(); i++){
	      System.out.println("\t取得第 "+i+" 個Connection 物件");
      connBean = (ConnBean)pool.elementAt(i);
      if (connBean.getInuse()==false){
        connBean.setInuse(true);
        Connection con = connBean.getConnection();
        return con;
      }
    }try{
      Connection con = createConnection();
      connBean = new ConnBean(con);
      connBean.setInuse(true);
      pool.addElement(connBean);
    }catch(Exception e){
      System.err.println(e.getMessage());
      throw new Exception(e.getMessage());
    }
    return connBean.getConnection();
  }
  public synchronized void emptyPool(){
    for (int i=0; i<pool.size(); i++){
      System.out.println("關閉第 " + i + " JDBC 連結");
      ConnBean connBean = (ConnBean)pool.elementAt(i);
      if (connBean.getInuse()==false)
        connBean.close();
      else{
        try{
          java.lang.Thread.sleep(20000);
          connBean.close();
        }catch(InterruptedException ie){
          System.err.println(ie.getMessage());
        }
      }
    }
  }
}