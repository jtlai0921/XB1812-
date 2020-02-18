import java.util.*;
public class ObjStudent{
  public static void main(String args[]){
    //使用別人開發的類別
    Date dt = new Date();
    System.out.println("現在時間:"+dt.toString() );
    Scanner sc = new Scanner(System.in);
    System.out.print("請輸入姓名:");
    String name=sc.next();
    System.out.println("喔! 你叫做:"+name);
		
    //使用自己撰寫的類別
    Student std1 = new Student("A5851001");
    Student std2 = new Student("A5851002");
    System.out.println("第一位學生的學號是:"+std1.id);
    System.out.println("第二位學生的學號是:"+std2.id);
    std1.Chi=90.5;
    std1.Eng=85.3;
    System.out.println(std1.id+"平均是:"+std1.getAvg() );
  }
}

class Student{
  String id; 
  double Eng; 
  double Chi;
  Student(String key){
    id=key;
  }
  public double getAvg(){
    double average=(Eng+Chi)/2;   //average是區域變數，不是屬性
    return average;
  }
}
