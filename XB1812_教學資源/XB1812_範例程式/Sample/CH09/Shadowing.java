public class Shadowing{
	public static void main (String[] args){
		Car c = new Car(4);
		System.out.println("車的輪子有："+c.wheel +"個");
	}

 }

class Car{
	public int wheel;  //未指定值，系統預設之初始值為：0
	Car(int wheel){
		wheel = wheel;
	}
}
