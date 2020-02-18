import java.util.*;
public class ArrayListSample{
  public static void main(String args[]){
    //物件宣告
    ArrayList<Object> aList = new ArrayList<Object>();
    StringBuffer sData = new StringBuffer("Java");
    //新增資料
    aList.add(10);
    aList.add(true);
    aList.add(sData);
    
    //陣列方法應用
    System.out.println( "陣列內是否含有sData物件?"+(aList.contains( sData )?"有":"沒有") );
    for (int i=0; i<aList.size(); i++)
      System.out.println("索引"+i+"的內容為:"+aList.get(i) );
  }
}
