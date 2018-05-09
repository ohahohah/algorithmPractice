package arrays.cyclicrotation;

public class Solution {
  public int[] solution(int[] A, int K) {
    return solutionBrutal(A,K);
  }

  public int[] solutionBrutal(int[] arr, int loopNum) {
    int[] result = arr.clone();

    for(int i = 0; i < loopNum; i++){
      result = shiftArr(result).clone();
//      System.out.println(i + "번째 : " + Arrays.toString(arr));
    }
    return result;
  }
//TODO 정리 : 테스트케이스일때 경계값 테스트 : 배열길이 == 0
  private int[] shiftArr(int[] arr) {
    int[] origin = arr.clone();
    int[] change = new int[arr.length];
    if(arr.length == 0){
      return arr;
    }

    for(int i = 0; i < arr.length - 1; i++){
      change[i+1] = arr[i];
    }
    change[0] = arr[arr.length-1];

    return change;
  }
}
