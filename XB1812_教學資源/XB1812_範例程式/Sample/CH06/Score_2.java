import java.util.*;
class Score_2{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("��ؼƥ�:"+args.length);
     int sum=0;
     for(int i=0; i<args.length;){
       try{
         sum+=Integer.parseInt(args[i]);
         i++;
       }catch(Exception e){
         System.out.print(args[i]+"���Z�榡���šA�Э��s��J:");
         args[i]=sc.next();
       }
     }
     System.out.println("�`��:"+sum);
   }
}
