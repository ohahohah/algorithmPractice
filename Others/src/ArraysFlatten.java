import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Flatten nested arrays in java [[[1],2],[3]],4] -> [1,2,3,4] from.
 * https://stackoverflow.com/questions/31851548/flatten-nested-arrays-in-java
 */
public class ArraysFlatten {

  static Object[] flattenArray(Object[] input) {
    List<Object> result = new ArrayList<>();

    for(Object element : input){
      if(element instanceof Object[]){
        result.addAll(Arrays.asList(flattenArray((Object[])element)));
        continue;
      }
      result.add(element);
    }
    return result.toArray();
  }

  private static void assertResult(Object[] input, Object[] expected) {
    Object[] actual = flattenArray(input);
    if (!Arrays.equals(actual, expected)) {
      System.out.println(
          "not equals for input " + Arrays.deepToString(input) + ", expected=" + Arrays
              .deepToString(expected) + ", actual=" + Arrays.deepToString(actual));
    }
  }

  private static void runTestCase() {
    //TODO test more case
    Object[] input = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9, 10};
    Object[] output = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    assertResult(input, output);
  }

  private static boolean isLocal() {
    String current_path = System.getProperty("user.dir");
    return current_path.startsWith("/Users/mac/");
  }

  public static void main(String[] args){
    if (isLocal()) {
      runTestCase();
    } else {
      doOriginalMain(args);
    }
  }

  public static void doOriginalMain(String[] args){
//    TODO add sequence - 입력받기

    Object[] input = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9, 10};
    System.out.println("input Array: " + Arrays.deepToString(input));
    System.out.println("ouput Array: " + Arrays.deepToString(flattenArray(input)));
  }
}