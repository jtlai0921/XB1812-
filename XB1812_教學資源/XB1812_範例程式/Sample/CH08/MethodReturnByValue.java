public class MethodReturnByValue{
  public static void main(String[] args){
    int firstValue=100, lastValue=1, step=1, sum=0;
    sum=processCalcu(firstValue,lastValue,step);
    
    System.out.println("�_�l�ȡG"+firstValue);
    System.out.println("�����ȡG"+lastValue);
    System.out.println("���j�ȡG"+step);
    System.out.println("���G�G"+sum);
  }
  static int processCalcu(int firstValue, int lastValue, int d){
    int total=0, temp;
    
    //�קK�_�l�Ȥj�󵲧���
    if (firstValue>lastValue){
      temp=firstValue;
      firstValue=lastValue;
      lastValue=temp;
    }
    //�p��
    for (int i = firstValue; i<=lastValue; i+=d)
      total+=i;
    return total;
  }
}  
