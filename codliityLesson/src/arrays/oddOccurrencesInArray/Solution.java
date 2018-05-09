package arrays.oddOccurrencesInArray;

import java.util.Arrays;

/**
 * 홀수개 배열에서 같은 수가 아닌(같은 수는 짝지을 수 있음) 홀로 남는 숫자(배열인덱스가 아님) 반환 -> 배열에 9,9,9만 있으면 9를 반환 - 9가 홀수개이므로
 * 여러숫자가_홀수개인 경우는 존재하지 않음 (all but one of the values in A occur an even number of times.)

 */

public class Solution {

  public int solution(int[] A) {
    return solutionUsingApi(A);
  }

  private int solutionUsingApi(int[] ints) {
    Arrays.sort(ints);

    int find = ints[0];
    int count = 0;

    if (ints.length == 1) {
      return ints[0];
    }

    for (int element : ints) {
      if (find == element) {
        count++;
      } else if (find < element) {
        if (count % 2 == 1) {
          return find;
        }
        find = element;
        count = 1;
      }
      if (element == ints[ints.length - 1]) {
        return element;
      }

    }
    return 0;
  }


  private int solutionBrutal(int[] ints) {
    /*
    - 한 번에 카운트 - 새로 배열 만들기
      - 해당 숫자가 나오면 해당 숫자가 얼마나 나오는지 배열을 탐색하고, 나오는 숫자를 count함
        - 해당 숫자이면 count, 아니면 새로운 배열에 저장 -> 새롭게 배열만드는 이유는? 탐색한 숫자 또 탐색안하려고
        - 숫자가 홀수이면 숫자 출력
        - 숫자가 짝수이면, 새로 생성된 배열을 사용해서 다음 숫자 탐색
      - 예상단점: 공간복잡도 - 찾을때까지 여러 배열이 계속 생성됨

    - 한 번에 카운트 - 기존 배열 사용
      - 해당 숫자가 나오면 해당 숫자가 얼마나 나오는지 배열을 탐색하고, 나오는 숫자를 count함
        - 해당 숫자이면 count
        - 마지막 인덱스까지 탐색을 끝내고, 숫자출현횟수가 홀수이면 숫자출현횟수 출력
        - 숫자출현횟수가 짝수이면, 새로 생성된 배열을 사용해서 다음 숫자 탐색
          - 이미 탐색한 숫자인지 아닌지 어떻게 알아?
    * */

    int find = 0;
    int count = 0;
    for (int element : ints) {
      find = element;
      for (int i : ints) {
        if (find == i) {
          count++;
        }
      }
      if (count % 2 == 1) {
        return find;
      }
    }
    return 0;
  }
}