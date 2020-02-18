import java.util.*;
import java.text.*;
class DateFormat{
	public static void main(String args[]){
		SimpleDateFormat df=new SimpleDateFormat("yyyy/mm/dd");
		Date dt = new Date();
		
		System.out.println("dt日期物件的內容"+ dt );
		System.out.println("dt日期物件格式後的內容："+ df.format(dt) );
    }
}
