public class SendRefType	{
  public static void main(String[] args)	{
    int[] x = {10};
    MyFunc(x);
    System.out.println("陣列x[0]的內容：" + x[0]);
  }
  static void MyFunc(int[] y)	{
    y[0] += 1;
    System.out.println("在MyFunc()中，陣列y[0]的內容：" + y[0]);
  }
}
