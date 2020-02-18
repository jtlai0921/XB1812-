class Class_A{
	double A_a;
	int A_b;
	Class_A(double i, int j){
		A_a=i; A_b=j;
	}
	void show(){
		System.out.println("這是父類別Class A的方法");
		System.out.println("\t A_a="+A_a);
		System.out.println("\t A_b="+A_b);
	}
}

class Class_B extends Class_A{
	int B_a;
	Class_B(double i, int j, int k){
		super(i,j);
		B_a=k;
	}
	void show(){
		super.show();
		System.out.println("這是子類別Class B的方法");
		System.out.println("\t A_a="+A_a);
		System.out.println("\t A_b="+A_b);
		System.out.println("\t B_a="+B_a);
	}
}

public class Inherit_2{
	public static void main(String args[]){
		Class_B myObj= new Class_B(2.5, 10, 3);
		myObj.show();
	}
}
