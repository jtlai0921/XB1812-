public class ObjCreate{
	double i;
		
	void getRandom(){
		i=Math.random();
		System.out.println("亂數值="+i);
	}
	public static void main(String[] arts){
		ObjCreate obj = new ObjCreate(); //建構一個ObjCreate類別的物件: 
		obj.getRandom();			
	}
}
