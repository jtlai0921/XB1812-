public class MySecond{
  public static void main(String args[]){
    Show myShow = new Show();
    myShow.No=94079999;
    myShow.Hello();
  }
}

class Show{
  public int No;
  public void Hello(){
    System.out.println("Hello! This is my second program.");
    System.out.println("My no. is :"+No);
  }
}
