import java.util.*;
class CalendarSet_1{
	public static void main(String args[]){
		Calendar now=Calendar.getInstance();
		now.set(Calendar.YEAR,2020);
		System.out.println("現在年度："+now.get(Calendar.YEAR));
		System.out.println("現在月份："+ (now.get(Calendar.MONTH)+1) );

    }
}
