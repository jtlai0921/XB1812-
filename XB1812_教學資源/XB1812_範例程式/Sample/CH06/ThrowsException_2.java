import java.io.*;
public class ThrowsException_2{
    public void myMethod() throws Exception { // �Ъ`�Nthrows�̫᭱�Os
        FileInputStream f;
        try {
            f = new FileInputStream("abc.txt"); // �Y���s�babc.txt�ɮסA�K�|�޵oFileNotFoundException�ҥ~
        } catch(FileNotFoundException e) {
            System.out.println("�ɮפ��s�b�A�åB�ۦ�ߥX�@�Ӧ۫ت��ҥ~");
            throw new Exception("�o�O�ۤv�غc������");// �`�Nthrow�᭱�S��s
        }
    }
    public static void main(String[] argv) {
        ThrowsException_2 t = new ThrowsException_2();
        try {
            t.myMethod();
        } catch(Exception e) {
            System.out.println("�d��@�Өҥ~�A�ҥ~�T�����G"+e.getMessage());
        }
    }
}
