import java.util.*;
class Trigonometric{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("�ФJ���׭�:");
		double angle= sc.nextDouble();
		//�D��J���פ�����
		double arc=Math.toRadians(angle);
		System.out.println("����="+ arc);
		//�p���J���פ�sin��
		System.out.println("sin="+ Math.sin(arc) );
		//�p���J���פ�cos��
		System.out.println("cos="+ Math.cos(arc) );
		//�p���J���פ�tan��
		System.out.println("tan="+ Math.tan(arc) );
	}
}
