class Person{
  String name;
  public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return "姓名："+name;
  }
}

class Student extends Person{
  private String SNO;
  public void setName(String SNO, String name){
    super.setName(name);
    this.SNO=SNO;
  }
  public String getName(){
    if (SNO==null)
      return("姓名："+super.name); 
    else
      return ("學號:"+SNO+", "+super.getName());
  }
}

public class Register{
  public Student[] std; 
  public static void main(String[] args){
    int i;
    int argLen=args.length;
    int argNum=argLen/2;
    Register reg=new Register();
    reg.std=new Student[(argNum)];
    for (i = 0;i < reg.std.length;i++){
      reg.std[i]=new Student();
      reg.std[i].setName(args[i*2],args[i*2+1]);
    }
    for (i = 0;i < reg.std.length;i++){
      System.out.println(reg.std[i].getName());
    }
  }
}
