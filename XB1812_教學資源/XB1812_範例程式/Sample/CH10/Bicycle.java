interface IMove{
  int maxGear=10; //最高檔位
  void gearShift(int num);
  String getGear();
    
}

interface IStop{
  	void brake();
  	String getStatus();
	
}

public class Bicycle implements IMove, IStop{
	private int gear;
	boolean move;
	Bicycle(){
		gear=1; //腳踏車初始在第一檔
		move=true;
	}
    public void gearShift(int num){
		  gear+=num;
		  if (gear>maxGear) gear=maxGear;

    }
	public String getGear(){
		return "現在檔位在:"+Integer.toString(gear);
	}
	public void brake(){
		move=false; //停車
	}
	public String getStatus(){
		if (move==true)
		   return "騎車一路好風光";
		else
		   return "停車休息片刻";
	}
	
	public static void main(String args[]){
   	  Bicycle bike=new Bicycle();
   	  System.out.println(bike.getGear());
  	  System.out.println("換檔...");
   	  bike.gearShift(2);
   	  System.out.println(bike.getGear());

   	  System.out.println(bike.getStatus());
   	  System.out.println("煞車...");
   	  bike.brake();
   	  System.out.println(bike.getStatus());
    }	
}

