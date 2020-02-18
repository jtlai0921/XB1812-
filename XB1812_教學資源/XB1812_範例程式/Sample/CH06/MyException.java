class MyException extends Exception{
	private int value;
	MyException (int code){
		value = code;  //自訂的錯誤代碼
	}
	public String toString(){
		String s = "程式執行發生例外狀況\n" +
			"錯誤代碼：" + value + " \n" +
			"請將此代碼通知系統人員\n";
		return s;
	}
}
