public class People3{
  String sno;    //�Ǹ�;
  String name;  //�m�W;
  String unit;   //�t��
  public static void main(String[] args){
    People3 student = new People3("9301001","�i�T");
    student.display();
  }
  public People3(String no, String n){
    sno=no;    name=n;    unit="��Ǩt"; 
  }

  public void display(){
     System.out.println(unit+"�ǥ�"+name+"���Ǹ��O"+sno);
   }

  public String display(){
     return unit+"�ǥ�"+name+"���Ǹ��O"+sno;
  }
}
