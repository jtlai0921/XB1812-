import java.util.*;
class CalendarAdd{
	public static void main(String args[]){
		Calendar cal = Calendar.getInstance();
		cal.set(2018, 01, 20);  //�N����]�w��2018�~2��1��
		Date dt1 =cal.getTime();
		System.out.println("�̪�]�w�ɶ��G"+dt1.toString());

		cal.add(Calendar.YEAR,3);  //�~�׼W�[3����2021
		cal.add(Calendar.MONTH, -5);  //�����5�����E��
		Date dt2 =cal.getTime();		
		System.out.println("�ק蠟��ɶ��G"+dt2.toString());
    }
}
