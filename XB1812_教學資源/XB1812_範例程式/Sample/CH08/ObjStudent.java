import java.util.*;
public class ObjStudent{
  public static void main(String args[]){
    //�ϥΧO�H�}�o�����O
    Date dt = new Date();
    System.out.println("�{�b�ɶ�:"+dt.toString() );
    Scanner sc = new Scanner(System.in);
    System.out.print("�п�J�m�W:");
    String name=sc.next();
    System.out.println("��! �A�s��:"+name);
		
    //�ϥΦۤv���g�����O
    Student std1 = new Student("A5851001");
    Student std2 = new Student("A5851002");
    System.out.println("�Ĥ@��ǥͪ��Ǹ��O:"+std1.id);
    System.out.println("�ĤG��ǥͪ��Ǹ��O:"+std2.id);
    std1.Chi=90.5;
    std1.Eng=85.3;
    System.out.println(std1.id+"�����O:"+std1.getAvg() );
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
    double average=(Eng+Chi)/2;   //average�O�ϰ��ܼơA���O�ݩ�
    return average;
  }
}
