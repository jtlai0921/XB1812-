import java.util.*;
class CalendarRoll{
	public static void main(String args[]){
		Calendar cal = Calendar.getInstance();
		cal.set(2018, Calendar.FEBRUARY, 1);
		System.out.println("�̪�]�w�ɶ��G"+cal.getTime());
		
		
		cal.add(Calendar.MONTH, 13);  //�W�[13�Ӥ�A�~�׷|�ֶi
		System.out.println("�ϥ�add()��k�G"+cal.getTime());

 		cal.roll(Calendar.MONTH, 13);  //�A�W�[13�Ӥ�A���~�פ��|�ֶi
		System.out.println("�ϥ�roll()��k�G"+cal.getTime());
    }
}
