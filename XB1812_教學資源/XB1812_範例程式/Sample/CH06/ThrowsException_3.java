import java.io.*;
public class ThrowsException_3{
    public void myMethod() throws Exception { // 請注意throws最後面是s
        FileInputStream f;
        try {
            // 若不存在abc.txt檔案，便會引發FileNotFoundException例外
            f = new FileInputStream("abc.txt"); 
        } catch(FileNotFoundException e) {
            System.out.println("檔案不存在，並且自行拋出一個自建的例外");
            throw new MyException( 1 );
        }
    }
    public static void main(String[] argv) {
        ThrowsException_3 t = new ThrowsException_3();
        try {
            t.myMethod();
        } catch(Exception e) {
            System.out.println("攔到一個例外，例外訊息為："+e.toString() );
        }
    }
}
