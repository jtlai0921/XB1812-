public class MyThird{
  double score;
  public static void main(String args[]){
     MyThird myObj = new MyThird();
     myObj.show();
  }

  MyThird(){
    score=Math.random()*40+60;
  }

  void show(){
    System.out.println("�j�a�n�A�ڪ����Z�O:"+score);
  }
}
