public class MethodReturnByRef{
  public static void main(String[] args){
    App myObj=new App(); //建構一個App類別的myObj物件
    String[] a=myObj.getArray();
    for (int i=0;i<a.length;i++)
      System.out.println(a[i]);
  }
}
class App{
  public String[] getArray(){
    String[] temp={"this","is","a","test"};
    return temp;
  }
}
