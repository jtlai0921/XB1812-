import java.util.*;
public class DateCompare {
   public static void main(String args[]) {
      // 建構兩個日期物件: date1 與 date2
      Date date1 = new Date();
      Date date2 = new Date();
      date2.setTime(1000);  //將date2時間增加1000毫秒
      
      // 比較
      int c1 = date1.compareTo(date2);
      int c2 = date2.compareTo(date1);
      int c3 = date1.compareTo(date1);
      // 顯示結果
      System.out.println("date1："+date1.toString() );
      System.out.println("date2："+date2.toString() );

      System.out.println("date1比較date2結果：" + c1);
      System.out.println("date1比較date2結果：" + c2);
      System.out.println("date1比較date2自己：" + c3);
   }
}
