class Compute{
	public void times (int x, int y){
		System.out.println(x+"*"+y+"="+(x*y));		
	}
	public void divided (int x, int y){
		System.out.println(x+"/"+y+"="+(float)x/y);		
	}
}

public class Accounting extends Compute{
	public void plus (int x, int y){
		System.out.println(x+"+"+y+"="+(x+y));		
	}
	public void minus (int x, int y){
		System.out.println(x+"-"+y+"="+(x-y));		
	}
	
	public static void main(String args[]){
		Accounting myObj = new Accounting();
		myObj.plus(200,30);
		myObj.minus(200,30);
		myObj.times(200,30);
		myObj.divided(200,30);	
	}
}
