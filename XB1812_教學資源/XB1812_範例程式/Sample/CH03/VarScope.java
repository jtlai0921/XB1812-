public class VarScope{
	public static void main(String args[]){
		int i=1;
	    { int j=2;
	      System.out.println("j����="+j);
		}
	    System.out.println("j����="+j); //���~!!�w���}j�����Ľd��
	    
	    if (i>=1){
	    	int k=20;
	        System.out.println("k����="+k);
	    }
	    System.out.println("k����="+k); //���~!!�w���}K�����Ľd��
	}
}
