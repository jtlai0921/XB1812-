public class Staff extends Human{  //Staff類別繼承Human類別
  public static void main(String[] args){
    Staff st=new Staff();
    st.setName("張三");
    st.setAge(21);
    st.print();
  }
  public void print(){
    System.out.println("職員: ");
    super.print();
  }

}class Human{
  private String name;
  private int age;
  protected void setName(String name){
    this.name=name;
  }
  protected void setAge(int age){
    this.age=age; 
  }
  protected void print(){
    System.out.println("姓名="+name+", 年齡="+age);
  }
}
