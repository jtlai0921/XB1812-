public class UseThis{
  private String name;
  private int age;
  
  public static void main(String[] args){
    UseThis ut=new UseThis("�i�T",21);
  }
  
  UseThis(String name,int age){
    setName(name); //�i�H�g��this.setName(name);����ڬO�h�l��
    setAge(age);
    this.print();
  }
     
  public void setName(String name){
    this.name=name;//�����n���W�ޥΪ�����
  }
  
  public void setAge(int age){
    this.age=age;
  }
  
  public void print(){
    //����k�����ݭn�ϥ�this�A�]���S���ɭP�V�c�������W��
    System.out.println("�m�W="+name+", �~��="+age);
  }
}
