public class StrBuffer{
	public static void main(String[] args){
		//宣告StringBuffer物件，並指定內容
		StringBuffer sb = new StringBuffer("Java程式練習");

		System.out.println("sb的內容為：" + sb);
		System.out.println("sb的儲存空間為：" + sb.capacity());
		System.out.println("sb的內容的長度量為：" + sb.length());

		sb.append("-StringBuffer類別的範例練習");    //附加sb的內容
		System.out.println("變更後，sb的內容為：" + sb);
		System.out.println("變更後，sb的儲存空間為：：" + sb. capacity());
		System.out.println("變更後，sb的內容的長度量為：" + sb.length());
		String str = sb.toString();  //將StringBuffer物件轉換成字串
	 	System.out.println("str字串物件內容為："+str);

	}
}
