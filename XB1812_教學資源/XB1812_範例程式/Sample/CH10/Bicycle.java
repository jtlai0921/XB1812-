interface IMove{
  int maxGear=10; //�̰��ɦ�
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
		gear=1; //�}�񨮪�l�b�Ĥ@��
		move=true;
	}
    public void gearShift(int num){
		  gear+=num;
		  if (gear>maxGear) gear=maxGear;

    }
	public String getGear(){
		return "�{�b�ɦ�b:"+Integer.toString(gear);
	}
	public void brake(){
		move=false; //����
	}
	public String getStatus(){
		if (move==true)
		   return "�M���@���n����";
		else
		   return "�����𮧤���";
	}
	
	public static void main(String args[]){
   	  Bicycle bike=new Bicycle();
   	  System.out.println(bike.getGear());
  	  System.out.println("����...");
   	  bike.gearShift(2);
   	  System.out.println(bike.getGear());

   	  System.out.println(bike.getStatus());
   	  System.out.println("�٨�...");
   	  bike.brake();
   	  System.out.println(bike.getStatus());
    }	
}

