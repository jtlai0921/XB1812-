public class MethodReturnByRef{
  public static void main(String[] args){
    App myObj=new App(); //�غc�@��App���O��myObj����
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
