public class PlaneOverride{
	public static void main(String arts[]){
		Plane747 CAL=new Plane747();
		CAL.setData(4000.5,"�Ŧ�");
		CAL.setLane(5);
		CAL.display();
	}
}

class AirPlane{
	double fuel;
	String color;
	public void setData(double fuel, String color){
		this.fuel=fuel;
		this.color=color;	 	
	 }
	public void display(){
		System.out.println("�����i�˸��U�Ƽƶq:"+fuel);
		System.out.println("�����C��:"+color);
	}
}

//�l���O:Plane747
class Plane747 extends AirPlane{
	private int airLane;
	public void setLane(int airLane){
		this.airLane=airLane;
	}

	//�мgSuperclass��display()��k
	public void display(){
		System.out.println("747�����i�˸��o�� "+fuel+" ����");
		System.out.println("747�������C��O "+color);
		System.out.println("747�����_�����]�D�O "+airLane);
	}
}
