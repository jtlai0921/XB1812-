public class People{
  String sno;  //�Ǹ�;
  String name; //�m�W;
  String unit; //�t��
  char type;   // 'T'��ܦѮv, 'S'��ܾǥ�	
  
public static void main(String[] args){ 
    People student = new People("9301001","�i�T");
    People teacher = new People("���|");
    student.display();
    teacher.display();
  }
  
public People(String n){ 
    type='T';  
    name=n; 
    unit ="��Ǩt";
  } 

  public People(String no, String n){
    type='S';    
    sno=no;
    name=n; 
  } 
  
public void display(){
     if (type=='T')
        System.out.println("�o��O"+unit+"���Ѯv, �m�W�O�G"+name);
    else
        System.out.println("�o��O�Ǹ� "+sno+" ���ǥ�, �m�W�O�G"+name);
  }
}
