import java.util.*;
class CalendarSet_2{
	public static void main(String args[]){
		Calendar cal = Calendar.getInstance();
		cal.set(2018, 1, 1);  //�N����]�w��2018�~2��1��
		Date dt1 =cal.getTime();
		System.out.println("�̪�]�w�ɶ��G"+dt1.toString());
		cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) + 3);  //�N����W�[�T�Ӥ�
		Date dt2 =cal.getTime();
		System.out.println("�ק蠟��ɶ��G"+dt2.toString());
    }
}
