public class StringMethod_2{
	public static void main(String[] args){
		String str="�оǥؼСA�H�Ʀ�зs�B���Ѻ޲z�P�H���Ǽ����ؼ�";
		String subStr1=str.substring(10);
		String subStr2=str.substring(4,9);
		System.out.println("����r�ꤺ�e�G"+str);
		System.out.println("�l�r��1="+subStr1);
		System.out.println("�l�r��2="+subStr2);
		
		System.out.println("\"�Ǽ�\"�̥��X�{����}�G"+str.indexOf("�Ǽ�"));
		System.out.println("\"�Ǽ�\"�̫�X�{����}�G"+str.lastIndexOf("�Ǽ�"));
		System.out.println("���N�r�ꪺ���G�G"+str.replace("�޲z","�[��"));		}
}
