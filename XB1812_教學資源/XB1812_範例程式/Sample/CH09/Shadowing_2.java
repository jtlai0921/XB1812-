public class Shadowing_2{
	public static void main (String[] args){
		Car c = new Car(4);
		System.out.println("�������l���G"+c.wheel +"��");
	}

 }

class Car{
	public int wheel;  //�����w�ȡA�t�ιw�]����l�Ȭ��G0
	Car(int wheel){
		this.wheel = wheel;
	}
}
