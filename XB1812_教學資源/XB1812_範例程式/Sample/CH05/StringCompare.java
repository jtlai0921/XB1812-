import java.util.*;
class StringCompare{
  public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J�Ĥ@�Ӧr��:");
		String sA=sc.next();
		System.out.print("�п�J�ĤG�Ӧr��:");
		String sB=sc.next();
		System.out.println("�ϥ�==����A��r��: "+(sA==sB?"�ۦP":"���P"));
		System.out.println("�ϥ�equals()����A��r��:"+(sA.equals(sB)?"�ۦP":"���P"));
  }
}
