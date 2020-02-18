public class People3{
  String sno;    //學號;
  String name;  //姓名;
  String unit;   //系所
  public static void main(String[] args){
    People3 student = new People3("9301001","張三");
    student.display();
  }
  public People3(String no, String n){
    sno=no;    name=n;    unit="資傳系"; 
  }

  public void display(){
     System.out.println(unit+"學生"+name+"的學號是"+sno);
   }

  public String display(){
     return unit+"學生"+name+"的學號是"+sno;
  }
}
