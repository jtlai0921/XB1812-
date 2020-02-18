public class ExceptionMsg{
	public static void main(String args[]){
	  try{
	    int a[]=new int[args.length-1];
	   
	    for(int i=0; i<args.length; i++)
	      a[i]=Integer.parseInt(args[i]);
	  }catch(Exception e){
	  	 System.out.println("例外原因："+e.getCause());
	  	 System.out.println("例外局部描述："+e.getLocalizedMessage());
	  	 System.out.println("例外訊息："+e.getMessage());
	  	 System.out.println("例外類型："+e.toString());
	  }finally{
	  	System.out.println("==程式結束==");
	  }		
	}
}
