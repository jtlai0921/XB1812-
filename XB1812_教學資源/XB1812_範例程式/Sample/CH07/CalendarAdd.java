import java.util.*;
class CalendarAdd{
	public static void main(String args[]){
		Calendar cal = Calendar.getInstance();
		cal.set(2018, 01, 20);  //將日期設定為2018年2月1日
		Date dt1 =cal.getTime();
		System.out.println("最初設定時間："+dt1.toString());

		cal.add(Calendar.YEAR,3);  //年度增加3成為2021
		cal.add(Calendar.MONTH, -5);  //月份減5成為九月
		Date dt2 =cal.getTime();		
		System.out.println("修改之後時間："+dt2.toString());
    }
}
