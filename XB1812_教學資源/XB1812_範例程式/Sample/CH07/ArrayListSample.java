import java.util.*;
public class ArrayListSample{
  public static void main(String args[]){
    //����ŧi
    ArrayList<Object> aList = new ArrayList<Object>();
    StringBuffer sData = new StringBuffer("Java");
    //�s�W���
    aList.add(10);
    aList.add(true);
    aList.add(sData);
    
    //�}�C��k����
    System.out.println( "�}�C���O�_�t��sData����?"+(aList.contains( sData )?"��":"�S��") );
    for (int i=0; i<aList.size(); i++)
      System.out.println("����"+i+"�����e��:"+aList.get(i) );
  }
}
