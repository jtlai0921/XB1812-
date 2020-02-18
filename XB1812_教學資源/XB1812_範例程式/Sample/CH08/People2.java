public class People2{
  String sno;		//學號;
  String name;	//姓名;
  String unit;		//系所

  public static void main(String[] args){
    People2 student = new People2("9301001","張三");
    student.display();
    student.display(student.sno, student.name);
  }

  public People2(String no, String n){
    sno=no;
    name=n;
    unit="資傳系"; 
  } 

  public void display(){
     System.out.println(unit+"學生"+name+"的學號是"+sno);
   }

  public void display(String no, String n){
     System.out.println("學號:"+no+"的姓名是:"+n);
  }
}
