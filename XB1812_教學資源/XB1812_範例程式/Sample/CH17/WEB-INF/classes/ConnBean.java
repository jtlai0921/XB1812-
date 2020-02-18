package myBean;
import java.io.*;
import java.sql.*;
public class ConnBean
  {
  private Connection conn = null;
  private boolean inuse = false;
  public ConnBean(){ }
  public ConnBean(Connection con){
    if (con!=null) conn = con;
  }
  public Connection getConnection(){
    return conn;
  }
  public void setConnection(Connection con){
    conn = con;
  }
 	public void setConnection(String strConn){
		try{
   		 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   		 conn =DriverManager.getConnection(strConn);
		}catch(Exception e){	System.out.println(e.toString());	}
	}
  public void setInuse(boolean inuse){
    this.inuse = inuse;
  }
  public boolean getInuse(){
    return inuse;
  }
  public boolean inUse(){
    return inuse;
  }
  public void close(){
    try{
      conn.close();
    }catch (SQLException sqle){
    	System.err.println(sqle.getMessage());
    }
  }
}