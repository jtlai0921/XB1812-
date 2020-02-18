import java.io.*;
public class ThrowsException_2{
    public void myMethod() throws Exception { // 請注意throws最後面是s
        FileInputStream f;
        try {
            f = new FileInputStream("abc.txt"); // 若不存在abc.txt檔案，便會引發FileNotFoundException例外
        } catch(FileNotFoundException e) {
            System.out.println("檔案不存在，並且自行拋出一個自建的例外");
            throw new Exception("這是自己建構的物件");// 注意throw後面沒有s
        }
    }
    public static void main(String[] argv) {
        ThrowsException_2 t = new ThrowsException_2();
        try {
            t.myMethod();
        } catch(Exception e) {
            System.out.println("攔到一個例外，例外訊息為："+e.getMessage());
        }
    }
}
