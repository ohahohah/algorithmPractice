package iterations.binaryGap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

/*
 BinaryGap
https://app.codility.com/programmers/lessons/1-iterations/
  ### Complexity
  expected worst-case time complexity is O(log(N));
expected worst-case space complexity is O(1).
*/

  // TODO remove static
//  TODO remove sout
  public static int solution(int n) {

    int gapCount = 0;
    int maxCount = 0;
    boolean countFlag = false;

    while (n != 0) {
      int binaryDigit = n % 2;
      n /= 2;

      if (binaryDigit == 1 && countFlag == false) {
        countFlag = true;
      } else if (binaryDigit == 1 && countFlag == true) {
        if (maxCount < gapCount) {
          maxCount = gapCount;
        }
        gapCount = 0;
      }
      if (binaryDigit == 0 && countFlag == true) {
        gapCount++;
      }
    }
    return maxCount;
  }

  private static void assertResult(int input, int expected) {
    int actual = solution(input);
    if (actual != expected) {
      System.out.println(
          "not equals for input " + input + ", expected=" + expected + ", actual=" + actual);
    }
  }

  private static void runTestCase() {
    assertResult(529, 4); // "1000010001"
    assertResult(20, 1); // "10100"
    assertResult(15, 0); // "1111"
    assertResult(1041, 5);  // "10000010001"
    assertResult(2325, 3); //"100100010101"

  }

  private static boolean isLocal() {
    String current_path = System.getProperty("user.dir");
    String localActualPath = "/Users/syo/";
    return current_path.startsWith(localActualPath);
  }

  public static void main(String[] args) throws IOException {
    if (isLocal()) {
      runTestCase();
    } else {
      doOriginalMain(args);
    }
  }

  private static final Scanner scanner = new Scanner(System.in);

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
