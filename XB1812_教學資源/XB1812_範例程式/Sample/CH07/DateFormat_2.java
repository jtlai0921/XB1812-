import java.text.SimpleDateFormat; 
import java.util.*; //Date�PCalendar���O���b���M��
class DateFormat_2 {
	public static void main(String args[]){
		//�ǳƿ�X���榡�G�P�� �~/��/�� �p��:����
		SimpleDateFormat df = new SimpleDateFormat("E yyyy/MM/dd HH:mm");

		//�����榡�ƿ�X�{�b�ɶ�����k
		Date today = new Date();
		System.out.println(df.format(today));


        //�ϥ�Calendar���O�B�z���
 		Calendar now = Calendar.getInstance();
		now.setTime(today);
		System.out.println(df.format(now.getTime()));
 
 		//�Q��set��k��J���w�����
		now.set(2018, Calendar.FEBRUARY, 1);
		System.out.println(df.format(now.getTime()));
     }
 }
