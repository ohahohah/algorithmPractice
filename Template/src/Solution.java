import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

  /*
   * Complete the handshake function below.
   */
  static int handshake(int n) {
    if(n<1) return 0;
    return (n)*(n-1)/2;
  }

  private static void assertResult(int input, int expected) {
    int actual = handshake(input);
    if(actual!=expected) {
      System.out.println("not equals for input "+input+", expected="+expected+", actual="+actual);
    }

  }
  private static void runTestCase() {
    assertResult(1, 0);
    assertResult(2, 1);
    assertResult(3, 3);
    assertResult(4, 6);
    assertResult(5, 10);
    assertResult(6, 15);
    assertResult(7, 21);
  }

  private static boolean isLocal() {
    String current_path = System.getProperty("user.dir");
    return current_path.startsWith("/Users/mac/");
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    if(isLocal()) { runTestCase(); }
    else { doOriginalMain(args); }
  }

  public static void doOriginalMain(String[] args) throws IOException {
    //TODO OUTPUT_PATH 설정하기
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int t = Integer.parseInt(scanner.nextLine().trim());

    for (int tItr = 0; tItr < t; tItr++) {
      int n = Integer.parseInt(scanner.nextLine().trim());

      int result = handshake(n);

      bufferedWriter.write(String.valueOf(result));
      bufferedWriter.newLine();
    }

    bufferedWriter.close();
  }
}
