public class Staff extends Human{  //Staff���O�~��Human���O
  public static void main(String[] args){
    Staff st=new Staff();
    st.setName("�i�T");
    st.setAge(21);
    st.print();
  }
  public void print(){
    System.out.println("¾��: ");
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
    System.out.println("�m�W="+name+", �~��="+age);
  }
}
