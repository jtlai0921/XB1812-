import java.io.*;
public class ThrowsException_3{
    public void myMethod() throws Exception { // �Ъ`�Nthrows�̫᭱�Os
        FileInputStream f;
        try {
            // �Y���s�babc.txt�ɮסA�K�|�޵oFileNotFoundException�ҥ~
            f = new FileInputStream("abc.txt"); 
        } catch(FileNotFoundException e) {
            System.out.println("�ɮפ��s�b�A�åB�ۦ�ߥX�@�Ӧ۫ت��ҥ~");
            throw new MyException( 1 );
        }
    }
    public static void main(String[] argv) {
        ThrowsException_3 t = new ThrowsException_3();
        try {
            t.myMethod();
        } catch(Exception e) {
            System.out.println("�d��@�Өҥ~�A�ҥ~�T�����G"+e.toString() );
        }
    }
}
