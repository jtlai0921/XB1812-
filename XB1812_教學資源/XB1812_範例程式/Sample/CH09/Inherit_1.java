class Class_A{
	Class_A(){
		System.out.println("這是類別 A");
	}
}
class Class_B extends Class_A{
	Class_B(){
		System.out.println("這是繼承類別 A 的類別 B");
	}
}
class Class_C extends Class_B{
	Class_C(){
		System.out.println("這是繼承類別 B 的類別 C");
	}
}

public class Inherit_1{
	public static void main(String args[]){
		System.out.println("單一繼承的建構子執行順序示範：");
		Class_B b = new Class_B();
		
		System.out.println("\n多重繼承的建構子執行順序示範：");
		Class_C c = new Class_C();
	}
}
