public class VarScope{
	public static void main(String args[]){
		int i=1;
	    { int j=2;
	      System.out.println("j的值="+j);
		}
	    System.out.println("j的值="+j); //錯誤!!已離開j的有效範圍
	    
	    if (i>=1){
	    	int k=20;
	        System.out.println("k的值="+k);
	    }
	    System.out.println("k的值="+k); //錯誤!!已離開K的有效範圍
	}
}
