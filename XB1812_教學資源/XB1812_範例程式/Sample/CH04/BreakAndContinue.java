public class BreakAndContinue {
  public static void main(String[] args) {
    for(int i = 0; i < 100; i++) {
      if(i == 74) break; // 離開迴圈
      if(i % 9 != 0) continue; // 回到迴圈前端
      System.out.println(i);
    }
    int i = 0;
    
    while(true) {
      i++;
      int j = i * 27;
      if(j == 1269) break; // 離開迴圈
      if(i % 10 != 0) continue; // 回到迴圈前端
      System.out.println(i);
    }
  }
}
