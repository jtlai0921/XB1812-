public class Object1{
  public static void main(String[] args){
    System.out.println("標題="+MyObj.title);
    //System.out.println("尺寸="+MyObj.size);
		
    MyObj a = new MyObj();
    MyObj b = new MyObj();

    a.color="紅色";	//修改a物件的顏色屬性
    a.title="翠谷";		//修改a物件的標題屬性
    b.size=20;		//修改b物件的尺寸屬性
		
    System.out.println("a物件的顏色="+a.color);
    System.out.println("b物件的顏色="+b.color);
    System.out.println("a物件的尺寸="+a.size);
    System.out.println("b物件的尺寸="+b.size);

    System.out.println("b物件的標題="+b.title); 
    System.out.println("myObj類別的標題="+MyObj.title);
  }
}
class MyObj{
  String color;				//顏色屬性
  int size=20;				//尺寸屬性
  static String title="資傳";	//標題屬性，此一屬性宣告為靜態
  MyObj(){   //建構子：與類別名稱相同、無修飾語、無回傳值
    color="白色";
    size=10;
  }
}
