package goorm.intinput;

/** copy line **/
import java.io.IOException;
import java.util.Scanner;

class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    if (isLocal()) {
      runTestCase();
      runExceptionCase();
      runMinCase();
      runMinCase();
    } else {
      doOriginalMain(args);
    }
  }

  public static void doOriginalMain(String[] args) throws IOException {
//    int n = Integer.parseInt(scanner.nextLine().trim());
    int n = scanner.nextInt();

    int result = solution(n);

    System.out.print(result);
  }

  private static int solution(int n) {
    //TODO refactroing method name
    return doSomething(n);
  }

  private static int doSomething(int n) {
    return 0;
  }

  //Testcase
  private static void assertResult(int input, int expected) {
    int actual = doSomething(input);
    if (actual != expected) {
      System.out.println(
          "not equals for input " + input + ", expected=" + expected + ", actual=" + actual);
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

  private static void runExceptionCase() {
    assertResult(0, -1);
  }

  private static void runMaxCase() {
    assertResult(4999, 0);
  }

  private static void runMinCase() {
    assertResult(-4999, 0);
  }

  private static boolean isLocal() {
    String current_path = System.getProperty("user.dir");
    //TODO change localActualPath
    String localActualPath = "/Users/syo";
    return current_path.startsWith(localActualPath);
  }
}