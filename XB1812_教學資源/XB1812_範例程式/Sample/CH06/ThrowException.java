public class ThrowException{
	static float division(int num1, int num2){
		float ans=0; //�p�⵲�G
		try{
			if (num2==0)
				throw new ArithmeticException("�o�Ͱ��Ƭ��s�����~");
			ans=(float)num1/num2;
			
		}catch(Exception e){
			System.out.println("�{�����~�A���~��]�G"+e.getMessage() );
		}finally{
			return ans;
		}
	}
	
	public static void main(String arts[]){
		System.out.println("12/0="+division(12,0));
	}
}
