class Score{
   public static void main(String args[]){
     System.out.println("科目數目:"+args.length);
     int sum=0;
     for(int i=0; i<args.length;){
         sum+=Integer.parseInt(args[i]);
         i++;
     }
     System.out.println("總分:"+sum+"\t平均:"+(float)sum/args.length);
   }
}
