import java.util.*;
public class CalendarGet{
	public static void main(String args[]) {
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));		//取得年度
		System.out.println(now.get(Calendar.MONTH));		//取得月份
		System.out.println(now.get(Calendar.DAY_OF_MONTH));//取得今天是當月的第幾日
		System.out.println(now.get(Calendar.ERA));			//1:西元後；0:西元前 
	}
}
