public class InterfaceSample{
  public static void main(String[] args) {
    int n;
    for(int i = 0; i < 10; i++) {
        n = (int) (Math.random() * 10) % 2;
        switch (n) {
        case 0:
          doRequest( new HelloRequest("�i�T"));
          break;
        case 1:
          doRequest(new WelcomeRequest("�Y�j��"));
        }
     }
   }
   public static void doRequest(IRequest request) {
     request.execute();
   }
}
