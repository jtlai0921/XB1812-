public class Dog implements IPet{
  public void skill(){
    System.out.println("¬Ýªù");
  }
  public void action(){
    System.out.println("°l»°¶]¸õ¸I");
  }
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.skill();
    dog.action();
  }
}
