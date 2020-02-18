public class InterfaceSample{
  public static void main(String[] args) {
    int n;
    for(int i = 0; i < 10; i++) {
        n = (int) (Math.random() * 10) % 2;
        switch (n) {
        case 0:
          doRequest( new HelloRequest("張三"));
          break;
        case 1:
          doRequest(new WelcomeRequest("某大學"));
        }
     }
   }
   public static void doRequest(IRequest request) {
     request.execute();
   }
}
