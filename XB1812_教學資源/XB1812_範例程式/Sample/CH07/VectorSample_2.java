import java.util.*;

class VectorSample_2{
	public static void main(String args[]) {
		Vector v = new Vector();
		System.out.println("�w�]���}�C�j�p�G"+v.size());
		System.out.println("�w�]���}�C�e�q�G"+v.capacity());
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		System.out.println("�W�[�|��Integer����᪺�e�q�G"+v.capacity());

		v.addElement(new Double(5.15));
		System.out.println("�A�W�[�@��Double����᪺�e�q�G"+v.capacity());

		v.addElement(new Float(9.6));
		v.addElement(new String("Java Program"));
		System.out.println("�Ĥ@�Ӥ����G"+(Integer)v.firstElement());
		System.out.println("�̫�@�Ӥ����G"+(String)v.lastElement());
		System.out.println("Vector���}�C�j�p�G"+v.size());

		if(v.contains(new Float(9.6)))
			System.out.println("Vector�����������e�O9.6");
		
		System.out.println("\n�ϥ�Enumeration�C�|���O���Vector���������e");
		int cnt=0;
		Enumeration vEnum = v.elements();
		System.out.println("Vector�U�Ӥ��������e�G");
		while(vEnum.hasMoreElements()){
			System.out.println("��:"+cnt+"�Ӥ������e�G"+ vEnum.nextElement());
			cnt++;
		}

		System.out.println("\n�ϥ�get()��k���Vector���������e");
		for(int i = 0;i < v.size();i++){ 
			System.out.println("��:"+i+"�Ӥ������e�G"+v.get(i)); 
		}
	}
}
