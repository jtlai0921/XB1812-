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
    System.out.println("動物名稱："+name+",年齡:"+getAge()+"歲, 重量:"+getWeight()+"公斤");
  }
}
 
class UseGeneric_2{
  public static void main(String[] args) {
    Animal bio1, bio2, bio3; 
    bio1 = new Animal(5, 70,"狗");
    bio2 = new Animal(8, 30.52,"鹿");
    bio3 = new Animal("四十", "五千","象");
 
    bio1.getInfo();
    bio2.getInfo();
    bio3.getInfo();   
  }
}
