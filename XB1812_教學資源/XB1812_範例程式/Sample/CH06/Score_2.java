import java.util.*;
class Score_2{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("科目數目:"+args.length);
     int sum=0;
     for(int i=0; i<args.length;){
       try{
         sum+=Integer.parseInt(args[i]);
         i++;
       }catch(Exception e){
         System.out.print(args[i]+"成績格式不符，請重新輸入:");
         args[i]=sc.next();
       }
     }
     System.out.println("總分:"+sum);
   }
}
