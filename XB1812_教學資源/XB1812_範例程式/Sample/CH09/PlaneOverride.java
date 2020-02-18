public class PlaneOverride{
	public static void main(String arts[]){
		Plane747 CAL=new Plane747();
		CAL.setData(4000.5,"藍色");
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
		System.out.println("飛機可裝載燃料數量:"+fuel);
		System.out.println("飛機顏色:"+color);
	}
}

//子類別:Plane747
class Plane747 extends AirPlane{
	private int airLane;
	public void setLane(int airLane){
		this.airLane=airLane;
	}

	//覆寫Superclass的display()方法
	public void display(){
		System.out.println("747飛機可裝載油料 "+fuel+" 公升");
		System.out.println("747飛機的顏色是 "+color);
		System.out.println("747飛機起飛的跑道是 "+airLane);
	}
}
