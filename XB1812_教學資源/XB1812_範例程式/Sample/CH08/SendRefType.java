public class SendRefType	{
  public static void main(String[] args)	{
    int[] x = {10};
    MyFunc(x);
    System.out.println("�}�Cx[0]�����e�G" + x[0]);
  }
  static void MyFunc(int[] y)	{
    y[0] += 1;
    System.out.println("�bMyFunc()���A�}�Cy[0]�����e�G" + y[0]);
  }
}
