public class ArrayObject{
	public static void main(String args[]){
		Student st[] = new Student[3];
		st[0]=new Student("A0001","�i�T");  //�N�}�C��1������غc������
		st[1]=new Student("A0002","���|");  //�N�}�C��2������غc������
		st[2]=new Student("A0003","����");  //�N�}�C��3������غc������

		System.out.println("�ǥ͸�T�G");  
		for(int i=0; i<st.length; i++)
			System.out.println("�Ǹ�:"+st[i].sno+"\t�m�W�G"+st[i].name);
	}
}

class Student{
	String sno;  //�Ǹ�
	String name; //�m�W
	Student(String s1, String s2){  //�غc�l��k
		sno=s1;
		name=s2;
	}
}
