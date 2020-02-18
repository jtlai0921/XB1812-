import java.util.*;
public class StringSort{
  public static void main(String args[]){
    //1. 數字資料的排序
    int[] intData = { 4, 1, 3, -23 };
    Arrays.sort(intData); //結果： [-23, 1, 3, 4]
    System.out.print("\n1. 預設排序 intData陣列的內容:");
    for(int i=0; i<intData.length; i++)
      System.out.print("\t"+intData[i]);

    //2. 字串資料排序－預設:區分大小寫，依字母順序排
    String[] strData = { "m", "a", "C","Z" };
    Arrays.sort(strData); //結果： [C, Z, a, m]
    System.out.print("\n2. 預設排序 strData陣列的內容:");
    for(int i=0; i<strData.length; i++)
      System.out.print("\t"+strData[i]);

    //3. 字串資料排序－不分大小寫，依字母順序排
    Arrays.sort(strData, String.CASE_INSENSITIVE_ORDER); //結果： [a, C, m, Z]
    System.out.print("\n3. 不分大小寫、正向排序的結果:");
    for(int i=0; i<strData.length; i++)
      System.out.print("\t"+strData[i]);

    //4. 字串資料排序－區分大小寫，依字母反向順序排
    Arrays.sort(strData, Collections.reverseOrder()); //結果：[m, a, Z, C]
    
    System.out.print("\n4. 區分大小寫、反向排序的結果:");
    for(int i=0; i<strData.length; i++)
      System.out.print("\t"+strData[i]);

    //5. 字串資料排序－不分大小寫，依字母反向順序排
    Arrays.sort(strData, String.CASE_INSENSITIVE_ORDER);
    Collections.reverse(Arrays.asList(strData)); //結果： [Z, m, C, a]
    System.out.print("\n5. 不分大小寫、反向排序的結果:");
    for(int i=0; i<strData.length; i++)
      System.out.print("\t"+strData[i]);
  }
}
