import java.util.*;
class IfSample_3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J���Z:");
		int score = sc.nextInt();
		if (score>=60){ 
			System.out.println("���ߤή�F");
			System.out.println("���Z�O:"+score);
		}else{
			System.out.println("��p�S���ή�");
			System.out.println("�����ٮt:"+(60-score));
		}                
		System.out.println("�X�{������--");
	}
}
