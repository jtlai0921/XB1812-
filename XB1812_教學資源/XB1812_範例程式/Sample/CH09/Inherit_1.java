class Class_A{
	Class_A(){
		System.out.println("�o�O���O A");
	}
}
class Class_B extends Class_A{
	Class_B(){
		System.out.println("�o�O�~�����O A �����O B");
	}
}
class Class_C extends Class_B{
	Class_C(){
		System.out.println("�o�O�~�����O B �����O C");
	}
}

public class Inherit_1{
	public static void main(String args[]){
		System.out.println("��@�~�Ӫ��غc�l���涶�ǥܽd�G");
		Class_B b = new Class_B();
		
		System.out.println("\n�h���~�Ӫ��غc�l���涶�ǥܽd�G");
		Class_C c = new Class_C();
	}
}
