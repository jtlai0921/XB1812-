public class StrBuffer{
	public static void main(String[] args){
		//�ŧiStringBuffer����A�ë��w���e
		StringBuffer sb = new StringBuffer("Java�{���m��");

		System.out.println("sb�����e���G" + sb);
		System.out.println("sb���x�s�Ŷ����G" + sb.capacity());
		System.out.println("sb�����e�����׶q���G" + sb.length());

		sb.append("-StringBuffer���O���d�ҽm��");    //���[sb�����e
		System.out.println("�ܧ��Asb�����e���G" + sb);
		System.out.println("�ܧ��Asb���x�s�Ŷ����G�G" + sb. capacity());
		System.out.println("�ܧ��Asb�����e�����׶q���G" + sb.length());
		String str = sb.toString();  //�NStringBuffer�����ഫ���r��
	 	System.out.println("str�r�ꪫ�󤺮e���G"+str);

	}
}
