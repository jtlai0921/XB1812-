import java.text.SimpleDateFormat; 
import java.util.*; //Date與Calendar類別均在此套件內
class DateFormat_2 {
	public static void main(String args[]){
		//準備輸出的格式：星期 年/月/日 小時:分鐘
		SimpleDateFormat df = new SimpleDateFormat("E yyyy/MM/dd HH:mm");

		//直接格式化輸出現在時間的方法
		Date today = new Date();
		System.out.println(df.format(today));


        //使用Calendar類別處理日期
 		Calendar now = Calendar.getInstance();
		now.setTime(today);
		System.out.println(df.format(now.getTime()));
 
 		//利用set方法輸入指定的日期
		now.set(2018, Calendar.FEBRUARY, 1);
		System.out.println(df.format(now.getTime()));
     }
 }
