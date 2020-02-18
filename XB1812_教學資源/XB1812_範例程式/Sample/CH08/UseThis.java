public class UseThis{
  private String name;
  private int age;
  
  public static void main(String[] args){
    UseThis ut=new UseThis("張三",21);
  }
  
  UseThis(String name,int age){
    setName(name); //可以寫成this.setName(name);但實際是多餘的
    setAge(age);
    this.print();
  }
     
  public void setName(String name){
    this.name=name;//必須要指名引用的成員
  }
  
  public void setAge(int age){
    this.age=age;
  }
  
  public void print(){
    //此方法中不需要使用this，因為沒有導致混淆的成員名稱
    System.out.println("姓名="+name+", 年齡="+age);
  }
}
