public class StringMethod_2{
	public static void main(String[] args){
		String str="教學目標，以數位創新、知識管理與信息傳播為目標";
		String subStr1=str.substring(10);
		String subStr2=str.substring(4,9);
		System.out.println("完整字串內容："+str);
		System.out.println("子字串1="+subStr1);
		System.out.println("子字串2="+subStr2);
		
		System.out.println("\"傳播\"最先出現的位址："+str.indexOf("傳播"));
		System.out.println("\"傳播\"最後出現的位址："+str.lastIndexOf("傳播"));
		System.out.println("取代字串的結果："+str.replace("管理","加值"));		}
}
