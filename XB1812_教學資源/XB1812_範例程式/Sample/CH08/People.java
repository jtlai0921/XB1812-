public class People{
  String sno;  //學號;
  String name; //姓名;
  String unit; //系所
  char type;   // 'T'表示老師, 'S'表示學生	
  
public static void main(String[] args){ 
    People student = new People("9301001","張三");
    People teacher = new People("李四");
    student.display();
    teacher.display();
  }
  
public People(String n){ 
    type='T';  
    name=n; 
    unit ="資傳系";
  } 

  public People(String no, String n){
    type='S';    
    sno=no;
    name=n; 
  } 
  
public void display(){
     if (type=='T')
        System.out.println("這位是"+unit+"的老師, 姓名是："+name);
    else
        System.out.println("這位是學號 "+sno+" 的學生, 姓名是："+name);
  }
}
