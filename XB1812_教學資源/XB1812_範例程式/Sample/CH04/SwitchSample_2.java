import java.util.Scanner;
public class SwitchSample_2{
	public static void main(String[] args){
		int year,month, numDays=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J�~�סG");
		year = scanner.nextInt();
		System.out.print("�п�J����G");
		month= scanner.nextInt();
		
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				numDays=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				numDays=30;
				break;
			case 2:
				if (((year%4==0)&& !(year%100==0)) || (year%400==0))
					numDays=29;
				else
					numDays=28;
		}
		System.out.println
			(year+"�~"+month+"�몺����Ƭ��G"+numDays);
	}
}
