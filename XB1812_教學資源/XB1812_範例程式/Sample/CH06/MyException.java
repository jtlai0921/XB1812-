class MyException extends Exception{
	private int value;
	MyException (int code){
		value = code;  //�ۭq�����~�N�X
	}
	public String toString(){
		String s = "�{������o�ͨҥ~���p\n" +
			"���~�N�X�G" + value + " \n" +
			"�бN���N�X�q���t�ΤH��\n";
		return s;
	}
}
