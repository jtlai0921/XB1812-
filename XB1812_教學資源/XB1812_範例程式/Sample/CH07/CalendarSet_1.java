import java.util.*;
class CalendarSet_1{
	public static void main(String args[]){
		Calendar now=Calendar.getInstance();
		now.set(Calendar.YEAR,2020);
		System.out.println("�{�b�~�סG"+now.get(Calendar.YEAR));
		System.out.println("�{�b����G"+ (now.get(Calendar.MONTH)+1) );

    }
}
