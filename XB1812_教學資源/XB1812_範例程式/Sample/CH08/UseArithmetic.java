public class UseArithmetic{
  public static void main(String args[]){
		
    //�D100���M
    long answer=Arithmetic.summary(100);
    System.out.println("100���M="+answer);
		
    //�D10���n
    answer=Arithmetic.factors(20);
    System.out.println("20���n="+answer);
		
    }
}

class Arithmetic{
  static long result;
  static long summary(int num){
    //�p��1+2+3+...+num
    result=0;
    for (int i=1; i<=num; i++)
      result+= num;
      return result;
    }
		
    static long factors(int num)	{
      //�p��1*2*3*...*num
      result = 1;
      for (int i=1; i<=num; i++)
        result *= i;
      return result;
    }
}
