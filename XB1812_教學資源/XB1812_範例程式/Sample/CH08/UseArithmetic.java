public class UseArithmetic{
  public static void main(String args[]){
		
    //求100的和
    long answer=Arithmetic.summary(100);
    System.out.println("100的和="+answer);
		
    //求10的積
    answer=Arithmetic.factors(20);
    System.out.println("20的積="+answer);
		
    }
}

class Arithmetic{
  static long result;
  static long summary(int num){
    //計算1+2+3+...+num
    result=0;
    for (int i=1; i<=num; i++)
      result+= num;
      return result;
    }
		
    static long factors(int num)	{
      //計算1*2*3*...*num
      result = 1;
      for (int i=1; i<=num; i++)
        result *= i;
      return result;
    }
}
