public class TypeConv_2{
	public static void main(String args[]){
		int i=5, k=12;
		double j=i;
		System.out.println("�B�I j ���Ȭ��G"+j);
		
		j=(k/i);
		System.out.println(k+"���H"+i+"�����G��"+j);
		
		j=(double)k/(double)i;
 		System.out.println(k+"���H"+i+"�����G��"+j);

	}
}
