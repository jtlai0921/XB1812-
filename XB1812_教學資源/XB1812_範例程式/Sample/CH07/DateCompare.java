import java.util.*;
public class DateCompare {
   public static void main(String args[]) {
      // �غc��Ӥ������: date1 �P date2
      Date date1 = new Date();
      Date date2 = new Date();
      date2.setTime(1000);  //�Ndate2�ɶ��W�[1000�@��
      
      // ���
      int c1 = date1.compareTo(date2);
      int c2 = date2.compareTo(date1);
      int c3 = date1.compareTo(date1);
      // ��ܵ��G
      System.out.println("date1�G"+date1.toString() );
      System.out.println("date2�G"+date2.toString() );

      System.out.println("date1���date2���G�G" + c1);
      System.out.println("date1���date2���G�G" + c2);
      System.out.println("date1���date2�ۤv�G" + c3);
   }
}
