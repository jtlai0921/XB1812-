public class People2{
  String sno;		//�Ǹ�;
  String name;	//�m�W;
  String unit;		//�t��

  public static void main(String[] args){
    People2 student = new People2("9301001","�i�T");
    student.display();
    student.display(student.sno, student.name);
  }

  public People2(String no, String n){
    sno=no;
    name=n;
    unit="��Ǩt"; 
  } 

  public void display(){
     System.out.println(unit+"�ǥ�"+name+"���Ǹ��O"+sno);
   }

  public void display(String no, String n){
     System.out.println("�Ǹ�:"+no+"���m�W�O:"+n);
  }
}
