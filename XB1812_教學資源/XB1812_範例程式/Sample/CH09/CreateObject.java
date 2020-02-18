public class CreateObject extends MyRandom{
	int value[];
	public static void main(String[] args){ 
		CreateObject obj=new CreateObject();
		//取十個內容範圍在1~20的亂數值
		//並顯示於畫面
		obj.showRandom(obj.getRandom(10,1,20));
	}
	
	void showRandom(int[] ranValue){
		for (int i=0; i<ranValue.length;i++){
			System.out.println("第"+i+"個亂數:"+ranValue[i]);
		}
	}
  
	int[] getRandom(int count, int x, int y){
		value=new int[count];
		for (int i=0; i<count; i++){
			setRandom();
			value[i]=getRandom(x,y);
		}
		return value;
	}	  
}

class MyRandom{
	static double ran; 
	void setRandom(){ ran=Math.random();}
	double getRandom(){ return ran;}

 	int getRandom(int x, int y){  //取x~y範圍的亂數
		return (int)(ran*(y-x)+1)+x;
	} 
}
