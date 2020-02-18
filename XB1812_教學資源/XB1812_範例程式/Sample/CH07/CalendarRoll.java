import java.util.*;
class CalendarRoll{
	public static void main(String args[]){
		Calendar cal = Calendar.getInstance();
		cal.set(2018, Calendar.FEBRUARY, 1);
		System.out.println("最初設定時間："+cal.getTime());
		
		
		cal.add(Calendar.MONTH, 13);  //增加13個月，年度會累進
		System.out.println("使用add()方法："+cal.getTime());

 		cal.roll(Calendar.MONTH, 13);  //再增加13個月，但年度不會累進
		System.out.println("使用roll()方法："+cal.getTime());
    }
}
