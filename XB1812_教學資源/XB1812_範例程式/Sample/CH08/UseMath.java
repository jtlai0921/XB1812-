import exercise.unit.MyMath;

public class UseMath{
	public static void main(String args[]){
       float num[]= new float[args.length];
       for (int i=0; i<args.length; i++)
           num[i]=Float.parseFloat(args[i]);
   
       MyMath math = new MyMath();  //�غc�@��MyMath���O��math����
       System.out.println("�`��="+math.getSummary(num));
       System.out.println("��������="+math.getAvg(num));
       System.out.println("�зǮt="+math.getStdDev(num));
   }
}
