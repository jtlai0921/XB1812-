import java.util.*;
class GuessGame{
	public static void main(String args[]){
		//�H�����@��0~100���������
		int answer=(int)(Math.random()*100);
		 answer=96;
		//�غc��J����0
		Scanner sc=new Scanner(System.in);
		//�ŧi�ϥΪ��ܼƻP�`��
		final int limit=7;	//���ƤW��
		boolean flag=false;	//�P�_�X���Atrue��ܲq��
		int guess; 			//�ϥΪ̲q����
		int cnt=0;			//�q���֭p����
		//����:�P�_�������Otrue�Bcnt�p��W���h�~�����j��
		while ( !flag && cnt<limit){
			cnt++;
			System.out.print("�п�J�q����:");
			guess=sc.nextInt();
			if (guess==answer)
				flag=true; //�q���F
			else if (guess>answer)
				System.out.println("�Ӥj");
			else
				System.out.println("�Ӥp");
		}
		//�j�鵲���A�P�_�O�q���٬O��F�W���~����?
		if (flag)
			System.out.println("���߲q���A�q�����ơG"+cnt);
		else
			System.out.println("�w��F�W�����ơA���׬O:"+answer);	 	  
	 }
}
