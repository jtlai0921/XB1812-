public class MethodReturnByValue{
  public static void main(String[] args){
    int firstValue=100, lastValue=1, step=1, sum=0;
    sum=processCalcu(firstValue,lastValue,step);
    
    System.out.println("起始值："+firstValue);
    System.out.println("結束值："+lastValue);
    System.out.println("間隔值："+step);
    System.out.println("結果："+sum);
  }
  static int processCalcu(int firstValue, int lastValue, int d){
    int total=0, temp;
    
    //避免起始值大於結束值
    if (firstValue>lastValue){
      temp=firstValue;
      firstValue=lastValue;
      lastValue=temp;
    }
    //計算
    for (int i = firstValue; i<=lastValue; i+=d)
      total+=i;
    return total;
  }
}  
