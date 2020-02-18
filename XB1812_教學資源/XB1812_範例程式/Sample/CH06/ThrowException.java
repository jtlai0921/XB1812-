public class ThrowException{
	static float division(int num1, int num2){
		float ans=0; //計算結果
		try{
			if (num2==0)
				throw new ArithmeticException("發生除數為零的錯誤");
			ans=(float)num1/num2;
			
		}catch(Exception e){
			System.out.println("程式錯誤，錯誤原因："+e.getMessage() );
		}finally{
			return ans;
		}
	}
	
	public static void main(String arts[]){
		System.out.println("12/0="+division(12,0));
	}
}
