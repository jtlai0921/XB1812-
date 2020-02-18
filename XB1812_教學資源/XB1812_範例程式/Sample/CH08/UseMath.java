import exercise.unit.MyMath;

public class UseMath{
	public static void main(String args[]){
       float num[]= new float[args.length];
       for (int i=0; i<args.length; i++)
           num[i]=Float.parseFloat(args[i]);
   
       MyMath math = new MyMath();  //建構一個MyMath類別的math物件
       System.out.println("總分="+math.getSummary(num));
       System.out.println("平均分數="+math.getAvg(num));
       System.out.println("標準差="+math.getStdDev(num));
   }
}
