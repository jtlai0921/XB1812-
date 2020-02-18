public class StrBufferDelete {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Java程式練習");
    sb.delete(4, 6); //刪除第4字元到第六字元之前的內容

    System.out.println(sb);
    sb.delete(0,sb.length());//刪除從第0開始，到資料的總長
    System.out.println(sb); //沒有資料，因為全部刪光了

    sb.append("Java程式的練習"); //重新指定資料
    sb.deleteCharAt(6); //刪掉第六字元的內容
    System.out.println(sb);
  }
}
