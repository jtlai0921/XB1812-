public class Citizen extends Plebs{
  public static void main(String[] args){ 
    Citizen cz=new Citizen();
    cz=new Citizen("�i�T");
    cz=new Citizen("���|",21);
  }
  Citizen(){  //------------------------(1) 
    //super();  //�۰ʨϥΤ����O���غc�l
    prt("[����]���@�ӤH");
  }
  Citizen(String name){  //-------------(2) 
    //super(name);//�۰ʨϥΤ����O���غc�l
    prt("[����]�L���W�r�O:"+name);
  }
  Citizen(String name,int age){  //-----(3)
    this(name);//�ϥ����O�ۤv���غc�l
    prt("[����]�L���~�֬O:"+age);
  }
}
class Plebs{
  public static void prt(String text){
    System.out.println(text);
  }  
  Plebs (){  //-------------------------(4)
    System.out.println("[�H��]���@�ӤH");
  }
  Plebs (String name){  //--------------(5)
    System.out.println("[�H��]�L���W�r�O:"+name);
  }
}
