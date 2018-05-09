package arrays.cyclicrotation;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

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
  public void testSolution() {
    assertArrayEquals(new int[]{9, 7, 6, 3, 8}, sol.solution(new int[]{3, 8, 9, 7, 6},3));
    assertArrayEquals(new int[]{0, 0, 0}, sol.solution(new int[]{0, 0, 0},1));
    assertArrayEquals(new int[]{1, 2, 3, 4}, sol.solution(new int[]{1, 2, 3, 4},4));

  }

}