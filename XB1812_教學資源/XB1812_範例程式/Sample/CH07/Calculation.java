import java.util.*;
class Calculation{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("�ФJa����:");
		int a= sc.nextInt();
		System.out.print("�ФJb����:");
		int b= sc.nextInt();
		
		//���a, b���j�p
		System.out.println("�j���ƬO:"+Math.max(a,b)+", �p���ƬO:"+Math.min(a,b) );
		//�p��a��b����
		System.out.println(a+"��"+b+"����="+Math.pow(a,b) );
		//�p��a,b���ڸ�
		System.out.println(a+"�}�ڸ�="+Math.sqrt(a) );
		System.out.println(b+"�}�ڸ�="+Math.sqrt(b) );
	}
}
