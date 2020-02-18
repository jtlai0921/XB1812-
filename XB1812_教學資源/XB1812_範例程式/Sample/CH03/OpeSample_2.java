public class OpeSample_2{
	public static void main(String args[]){
		int i=5, j=10;
		//比較運算子練習
		System.out.println("i<j 比較的結果："+(i<j));
		System.out.println("i>j 比較的結果："+(i>j));
		System.out.println("i!=j比較的結果："+(i!=j));
		
		//邏輯運算子練習
		System.out.println("i<j AND i<=5 的結果："+(i<j && i<=5));
		System.out.println("i<j OR i>10  的結果："+(i<j || i>10));
		System.out.println("NOT(i<j)的結果："+(!(i<j)));
	}
}
