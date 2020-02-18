import java.util.*;
public class DateSet{
    public static void main(String args[]){
          Date dt = new Date();
          System.out.println("現在時間:"+dt.toString() );
          dt.setTime(50000);
          System.out.println("變更後時間:"+dt.toString() );
    }
}
