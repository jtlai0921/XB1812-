public class Object1{
  public static void main(String[] args){
    System.out.println("���D="+MyObj.title);
    //System.out.println("�ؤo="+MyObj.size);
		
    MyObj a = new MyObj();
    MyObj b = new MyObj();

    a.color="����";	//�ק�a�����C���ݩ�
    a.title="�A��";		//�ק�a���󪺼��D�ݩ�
    b.size=20;		//�ק�b���󪺤ؤo�ݩ�
		
    System.out.println("a�����C��="+a.color);
    System.out.println("b�����C��="+b.color);
    System.out.println("a���󪺤ؤo="+a.size);
    System.out.println("b���󪺤ؤo="+b.size);

    System.out.println("b���󪺼��D="+b.title); 
    System.out.println("myObj���O�����D="+MyObj.title);
  }
}
class MyObj{
  String color;				//�C���ݩ�
  int size=20;				//�ؤo�ݩ�
  static String title="���";	//���D�ݩʡA���@�ݩʫŧi���R�A
  MyObj(){   //�غc�l�G�P���O�W�٬ۦP�B�L�׹��y�B�L�^�ǭ�
    color="�զ�";
    size=10;
  }
}
