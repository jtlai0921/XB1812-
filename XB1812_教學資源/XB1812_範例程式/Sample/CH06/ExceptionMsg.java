public class ExceptionMsg{
	public static void main(String args[]){
	  try{
	    int a[]=new int[args.length-1];
	   
	    for(int i=0; i<args.length; i++)
	      a[i]=Integer.parseInt(args[i]);
	  }catch(Exception e){
	  	 System.out.println("�ҥ~��]�G"+e.getCause());
	  	 System.out.println("�ҥ~�����y�z�G"+e.getLocalizedMessage());
	  	 System.out.println("�ҥ~�T���G"+e.getMessage());
	  	 System.out.println("�ҥ~�����G"+e.toString());
	  }finally{
	  	System.out.println("==�{������==");
	  }		
	}
}
