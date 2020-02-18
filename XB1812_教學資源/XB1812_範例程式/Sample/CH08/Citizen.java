public class Citizen extends Plebs{
  public static void main(String[] args){ 
    Citizen cz=new Citizen();
    cz=new Citizen("張三");
    cz=new Citizen("李四",21);
  }
  Citizen(){  //------------------------(1) 
    //super();  //自動使用父類別的建構子
    prt("[市民]有一個人");
  }
  Citizen(String name){  //-------------(2) 
    //super(name);//自動使用父類別的建構子
    prt("[市民]他的名字是:"+name);
  }
  Citizen(String name,int age){  //-----(3)
    this(name);//使用類別自己的建構子
    prt("[市民]他的年齡是:"+age);
  }
}
class Plebs{
  public static void prt(String text){
    System.out.println(text);
  }  
  Plebs (){  //-------------------------(4)
    System.out.println("[人民]有一個人");
  }
  Plebs (String name){  //--------------(5)
    System.out.println("[人民]他的名字是:"+name);
  }
}
