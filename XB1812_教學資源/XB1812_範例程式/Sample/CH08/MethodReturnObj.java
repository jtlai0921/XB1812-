public class MethodReturnObj{
  public static void main(String[] args){
    MyStudent std = getStd("5851001",6);
    System.out.println(std.getInfo());	
  }

  static MyStudent getStd(String sNo, int number){
  //�إߤ@�Ӿǥͪ���
    MyStudent pupil = new MyStudent(sNo,number);
    return pupil; 
  }	
}

class MyStudent{
  float score[];  //�׬즨�Z
  String no;		//�ǥ;Ǹ�
  MyStudent(String txt, int num){ 
    no=txt;
    score=new float[num];
  }
  String getInfo(){
    return "�ǥ;Ǹ�:"+no+", �׽Ҭ�ؼƶq�G"+score.length;
  }
}
