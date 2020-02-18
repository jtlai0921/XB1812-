import java.util.*;
class CalendarSet_2{
	public static void main(String args[]){
		Calendar cal = Calendar.getInstance();
		cal.set(2018, 1, 1);  //將日期設定為2018年2月1日
		Date dt1 =cal.getTime();
		System.out.println("最初設定時間："+dt1.toString());
		cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) + 3);  //將月份增加三個月
		Date dt2 =cal.getTime();
		System.out.println("修改之後時間："+dt2.toString());
    }
}
