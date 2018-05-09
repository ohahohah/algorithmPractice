package iterations.binaryGap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
  SolutionOther sol = null;

  @Before
  public void setUp() throws Exception {
    sol = new SolutionOther();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void solution() {
  }

  @Test
  public void testCountGap() {
    assertEquals(sol.countGap("1000010001"),4);
    assertEquals(sol.countGap("10100"),1);
    assertEquals(sol.countGap("1111"),0);
    assertEquals(sol.countGap("10000010001"),5);
  }

  @Test
  public void testFindGap() {
    assertEquals(sol.findGap("1000010001"),4);
    assertEquals(sol.findGap("10100"),1);
    assertEquals(sol.findGap("1111"),0);
    assertEquals(sol.findGap("10000010001"),5);
  }

  @Test
  public void testConvertBinary() {
    assertEquals(sol.convertBinary(529), "1000010001");
    assertEquals(sol.convertBinary(20), "10100");
    assertEquals(sol.convertBinary(15), "1111");
    assertEquals(sol.convertBinary(1041), "10000010001");
  }

  /*string indexOf 학습테스트*/

  @Test
  public void 이진수_문자열_indexOf_동작확인() {
    //    TODO 해당 동작안하는 이유 알아보기
    String binary = "1000010001";
    assertEquals(0,binary.indexOf("1"));
    assertEquals("000010001",binary.substring(binary.indexOf("1")));

    System.out.println(binary.substring(binary.indexOf("1")));
  }

  @Test
  public void 숫자가_아닌_문자일_경우_indexOf_동작확인() {
    //정상 작동
    String text = "thisisApple";
    assertEquals(6,text.indexOf("A"));
    assertEquals("Apple",text.substring(text.indexOf("A")));
  }

  @Test
  public void 숫자인_문자일_경우_indexOf_동작확인() {
    //숫자라서 안되나? 해서 테스트 -> 정상 작동
    String nums = "123456";
//    assertEquals(2,nums.indexOf("3"));
//    assertEquals("3456",nums.substring(nums.indexOf("3")));
    assertEquals("3456",nums.substring(2));
  }

  @Test
  public void 첫번째_문자_indexOf_사용할경우_substring_동작확인() {
    //정상 작동
    String text = "thisisApple";
//    assertEquals("hisisApple",text.substring(text.indexOf("t")));
    assertEquals("hisisApple",text.substring(1));
  }
}