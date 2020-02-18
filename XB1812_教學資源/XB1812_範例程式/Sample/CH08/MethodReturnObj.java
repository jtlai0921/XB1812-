public class MethodReturnObj{
  public static void main(String[] args){
    MyStudent std = getStd("5851001",6);
    System.out.println(std.getInfo());	
  }

  static MyStudent getStd(String sNo, int number){
  //建立一個學生物件
    MyStudent pupil = new MyStudent(sNo,number);
    return pupil; 
  }	
}

class MyStudent{
  float score[];  //修科成績
  String no;		//學生學號
  MyStudent(String txt, int num){ 
    no=txt;
    score=new float[num];
  }
  String getInfo(){
    return "學生學號:"+no+", 修課科目數量："+score.length;
  }
}
