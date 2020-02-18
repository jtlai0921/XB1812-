class Animal<T> {
  private T age;
  private T weight;
  private String name;
     
  public Animal(T a, T w, String name) {
    setAge(a);
    setWeight(w);
    this.name=name;
  }
  public T getAge() {
    return age;
  }
  public void setAge(T n) {
    age = n;
  }
  public T getWeight() {
    return weight;
  }
  public void setWeight(T n) {
    weight = n;
  }
  public void getInfo() {
    System.out.println("�ʪ��W�١G"+name+",�~��:"+getAge()+"��, ���q:"+getWeight()+"����");
  }
}
 
class UseGeneric_2{
  public static void main(String[] args) {
    Animal bio1, bio2, bio3; 
    bio1 = new Animal(5, 70,"��");
    bio2 = new Animal(8, 30.52,"��");
    bio3 = new Animal("�|�Q", "���d","�H");
 
    bio1.getInfo();
    bio2.getInfo();
    bio3.getInfo();   
  }
}
