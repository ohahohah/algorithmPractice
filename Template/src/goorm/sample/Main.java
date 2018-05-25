package goorm.sample;

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
    int n = Integer.parseInt(scanner.nextLine().trim());

    String result = solution(n);

    System.out.print(result);
  }

  private static String solution(int n) {
    //TODO refactroing method name
    return getAllDivisor(n);
  }

  private static String getAllDivisor(int n) {

    int targetnumber = 0;
    int nownum;
    StringBuilder diviors = new StringBuilder();

    for (nownum = 1; nownum < targetnumber; nownum++) {
      if (targetnumber % nownum == 0) {
        diviors.append(nownum+" ");
      }
    }

    System.out.println(diviors.toString());
    return diviors.toString();
  }

  private String joinStr(String[] element) {
    return String.join(" ", element);
  }

  //Testcase
  private static void assertResult(int input, String expected) {
    String actual = getAllDivisor(input);
    if (!expected.equals(actual)) {
      System.out.println(
          "not equals for input " + input + ", expected=" + expected + ", actual=" + actual);
    }
  }

  private static void runTestCase() {
    assertResult(1, "");
    assertResult(2, "");
    assertResult(3, "");
    assertResult(4, "");
    assertResult(5, "");
    assertResult(6, "");
    assertResult(7, "");
  }

  private static void runExceptionCase() {
    assertResult(0, "");
  }

  private static void runMaxCase() {
    assertResult(4999, "");
  }

  private static void runMinCase() {
    assertResult(-4999, "");
  }

  private static boolean isLocal() {
    String current_path = System.getProperty("user.dir");
    //TODO change localActualPath
    String localActualPath = "/Users/syo";
    return current_path.startsWith(localActualPath);
  }
}