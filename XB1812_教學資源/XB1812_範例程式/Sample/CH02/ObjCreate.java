public class ObjCreate{
	double i;
		
	void getRandom(){
		i=Math.random();
		System.out.println("�üƭ�="+i);
	}
	public static void main(String[] arts){
		ObjCreate obj = new ObjCreate(); //�غc�@��ObjCreate���O������: 
		obj.getRandom();			
	}
}
