class Score{
   public static void main(String args[]){
     System.out.println("��ؼƥ�:"+args.length);
     int sum=0;
     for(int i=0; i<args.length;){
         sum+=Integer.parseInt(args[i]);
         i++;
     }
     System.out.println("�`��:"+sum+"\t����:"+(float)sum/args.length);
   }
}
