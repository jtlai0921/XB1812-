public class ThrowsException_1{
    public int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
     
    public static void main(String[] args) {
        ThrowsException_1 t = new ThrowsException_1();
         
        try {
            System.out.println(t.divide(10, 25));
            System.out.println(t.divide(10, 10));
            System.out.println(t.divide(10, 5));
            System.out.println(t.divide(10, 0));
        }
        catch (ArithmeticException ex) {
            System.out.println("µo¥Í¹Bºâ¿ù»~");
        }
    }
}
