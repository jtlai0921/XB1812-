import java.util.*;
class StringCompare{
  public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入第一個字串:");
		String sA=sc.next();
		System.out.print("請輸入第二個字串:");
		String sB=sc.next();
		System.out.println("使用==比較，兩字串: "+(sA==sB?"相同":"不同"));
		System.out.println("使用equals()比較，兩字串:"+(sA.equals(sB)?"相同":"不同"));
  }
}
