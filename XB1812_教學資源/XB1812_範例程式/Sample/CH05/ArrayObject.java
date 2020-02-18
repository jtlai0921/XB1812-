public class ArrayObject{
	public static void main(String args[]){
		Student st[] = new Student[3];
		st[0]=new Student("A0001","張三");  //將陣列第1元素件建構成物件
		st[1]=new Student("A0002","李四");  //將陣列第2元素件建構成物件
		st[2]=new Student("A0003","王五");  //將陣列第3元素件建構成物件

		System.out.println("學生資訊：");  
		for(int i=0; i<st.length; i++)
			System.out.println("學號:"+st[i].sno+"\t姓名："+st[i].name);
	}
}

class Student{
	String sno;  //學號
	String name; //姓名
	Student(String s1, String s2){  //建構子方法
		sno=s1;
		name=s2;
	}
}
