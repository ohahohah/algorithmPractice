package arrays.oddOccurrencesInArray;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
  Solution sol = null;

  @Before
  public void setUp() throws Exception {
    sol = new Solution();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void 배열크기가_1일때_동작확인() {
    assertEquals(9,sol.solution(new int[]{9}));
  }

  @Test
  public void 하나숫자만_홀수개일때_동작확인() {
    assertEquals(3, sol.solution(new int[]{3,5,3,3,5}));
    assertEquals(7, sol.solution(new int[]{9,3,9,3,9,7,9}));
  }

  @Test
  public void 가장큰값이_홀수개일때_동작확인() {
    assertEquals(11, sol.solution(new int[]{11,11,11,9,3,7,9,3,9,7,9}));
  }

  @Test
  public void testSolution() {
    //TODO qna assume 은 예외처리 고려안해도 되나?

    assertEquals(9,sol.solution(new int[]{9}));
    assertEquals(7, sol.solution(new int[]{9,3,9,3,9,7,9}));
    assertEquals(3, sol.solution(new int[]{3,5,3,3,5}));
  }
}