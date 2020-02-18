public class PassValue{
  public static void main(String[] args){
    int a=2, b=9;
    show(a, b);
    System.out.println("main()方法裡面: a="+a+", b="+b);
  }
  static void show(int a, int b){
    a++;
    b--;
    System.out.println("show()方法裡面：a="+a+", b="+b);
  }
}
