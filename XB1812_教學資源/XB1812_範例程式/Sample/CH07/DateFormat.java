import java.util.*;
import java.text.*;
class DateFormat{
	public static void main(String args[]){
		SimpleDateFormat df=new SimpleDateFormat("yyyy/mm/dd");
		Date dt = new Date();
		
		System.out.println("dt������󪺤��e"+ dt );
		System.out.println("dt�������榡�᪺���e�G"+ df.format(dt) );
    }
}
