import java.util.*;
public class CalendarGet{
	public static void main(String args[]) {
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));		//���o�~��
		System.out.println(now.get(Calendar.MONTH));		//���o���
		System.out.println(now.get(Calendar.DAY_OF_MONTH));//���o���ѬO��몺�ĴX��
		System.out.println(now.get(Calendar.ERA));			//1:�褸��F0:�褸�e 
	}
}
