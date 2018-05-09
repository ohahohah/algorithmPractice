package iterations.binaryGap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class SolutionOther {

  //TODO junit 으로 테스팅하게 템플릿 만들기
  /*
## Problem
  given a positive integer N,
  returns the length of its longest binary gap.
  The function should return 0 if N doesn't contain a binary gap.

  ### Complexity
  expected worst-case time complexity is O(log(N));
expected worst-case space complexity is O(1).

### 구현
- 2진수로 변환
- 1~1 사이 0 갯수 찾음
  - 1이 나온 후부터 1이 나올때까지, 0의 갯수를 카운트
    - 끝나는 1은 다른 gap의 시작하는 1이 될 수 있음
- 가장 큰 gapCount를 리턴
   */

  // TODO remove static
  public static int solution(int N) {
    String binary = convertBinary(N);
    int gapCount = findGap(binary);

    return gapCount;
  }

  static int findGap(String s) {
    countGap(s);

    return 0;
  }

  static int countGap(String s) {
    //TODO do not use API - char 1 나오면 count update 그 다음 1나오면 count return
//    https://docs.oracle.com/javase/tutorial/java/data/manipstrings.html
    if(s.matches(".*1(0)+1.*")){
      int i = s.indexOf("1");
      String after = s.substring(i);
      int j = after.indexOf("1");
      int count = j-i;

      System.out.println("s: " + s);
      System.out.println("i : " + i);
      System.out.println("after : " + after);
      System.out.println("j : " + j);
      System.out.println("count : " + count);

      return count;
//      countGap(after.substring(j));
    }
    return 0;
  }

  //TODO Change Logic of convering binary to shift Cal
  static String convertBinary(int n) {
    StringBuffer sb = new StringBuffer();
    Stack binary =  new Stack();

    int gapCount = 0;
    int max = 0;
    boolean start = false;

    while (n != 0) {
      int d = n % 2;
      binary.push(d);
      n /= 2;
    }

    while (!(binary.isEmpty() )) {
      sb.append(binary.pop());
    }

    return sb.toString();
  }

  //  TODO 다른 aseert 구현
  private static void assertResult(int input, int expected) {
    int actual = solution(input);
    if (actual != expected) {
      System.out.println(
          "not equals for input " + input + ", expected=" + expected + ", actual=" + actual);
    }
  }

  private static void testCountGap(String input, int expected) {
    int actual = findGap(input);
    if (expected != actual) {
      System.out.println(
          "CountGap: "+"not equals for input " + input + ", expected=" + expected + ", actual=" + actual);
    }
  }

  private static void testFindGap(String input, int expected) {
    int actual = findGap(input);
    if (expected != actual) {
      System.out.println(
          "not equals for input " + input + ", expected=" + expected + ", actual=" + actual);
    }
  }

  private static void testConvertBinary(int input, String expected) {
    String actual = convertBinary(input);
    if (!expected.equals(actual)) {
      System.out.println(
          "not equals for input " + input + ", expected=" + expected + ", actual=" + actual);
    }
  }

  private static void runTestCase() {
//    testCountGap("1000010001",4);
//    testCountGap("10100",1);
    testCountGap("1111",0);
//    testCountGap("10000010001",5);

//    testConvertBinary(529,"1000010001");
//    testFindGap("1000010001",4);
//
//    testConvertBinary(20,"10100");
//    testFindGap("10100",1);
//
//    testConvertBinary(15,"1111");
//    testFindGap("1111",0);
//
//    testConvertBinary(1041,"10000010001");
//    testFindGap("10000010001",5);

//    assertResult(1, 0);
//    assertResult(2, 1);
//    assertResult(3, 3);
//    assertResult(4, 6);
//    assertResult(5, 10);
//    assertResult(6, 15);
//    assertResult(7, 21);
  }

  private static boolean isLocal() {
    String current_path = System.getProperty("user.dir");
    String localActualPath = "/Users/syo/";
    return current_path.startsWith(localActualPath);
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    if (isLocal()) {
      runTestCase();
    } else {
      doOriginalMain(args);
    }
  }

  public static void doOriginalMain(String[] args) throws IOException {
    //TODO OUTPUT_PATH 설정하기
    BufferedWriter bufferedWriter = new BufferedWriter(
        new FileWriter(System.getenv("OUTPUT_PATH")));

    int t = Integer.parseInt(scanner.nextLine().trim());

    for (int tItr = 0; tItr < t; tItr++) {
      int n = Integer.parseInt(scanner.nextLine().trim());

      int result = solution(n);

      bufferedWriter.write(String.valueOf(result));
      bufferedWriter.newLine();
    }

    bufferedWriter.close();
  }
}
