package goorm.stringinput;

/** copy line **/
import java.io.IOException;
import java.util.Scanner;

class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    if (isLocal()) {
      runTestCase();
      runExceptionCase();
      runMaxCase();
      runMinCase();
    } else {
      doOriginalMain(args);
    }
  }

  public static void doOriginalMain(String[] args) throws IOException {
    String s = scanner.nextLine().trim();

    int result = solution(s);

    //TODO check again output format
    System.out.print(result);
  }

  private static int solution(String s) {
    //TODO refactroing method name
    return doSomething(s);
  }

  private static int doSomething(String s) {
    return 0;
  }

  //Testcase
  private static void assertResult(String input, int expected) {
    int actual = doSomething(input);
    if (actual != expected) {
      System.out.println(
          "not equals for input " + input + ", expected=" + expected + ", actual=" + actual);
    }
  }

  private static void runTestCase() {
    assertResult("", 0);
    assertResult("", 1);
    assertResult("", 3);
    assertResult("", 6);
    assertResult("", 10);
    assertResult("", 15);
    assertResult("", 21);
  }

  private static void runExceptionCase() {
    assertResult("", -1);
  }

  private static void runMaxCase() {
    assertResult("", 0);
  }

  private static void runMinCase() {
    assertResult("", 0);
  }

  private static boolean isLocal() {
    String current_path = System.getProperty("user.dir");
    //TODO change localActualPath
    String localActualPath = "/Users/syo";
    return current_path.startsWith(localActualPath);
  }
}