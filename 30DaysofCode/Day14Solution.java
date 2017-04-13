import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    public Difference(int[] elements ){
        this.elements = elements;
    }
    public void computeDifference(){
    	//doesn't need to get abs : conatstrints '1< elements[i] <= 100'  
       maximumDifference = maxInt(elements) - minInt(elements);
    }
    
    public int maxInt(int[] arr){
        if(arr.length == 1){
            return arr[0];
        }
        int halfArr[] = Arrays.copyOfRange(arr, 0, arr.length/2);
        int halfArrAfter[] = Arrays.copyOfRange(arr, arr.length/2, arr.length);
        
        return maxInt(halfArr) > maxInt(halfArrAfter)? maxInt(halfArr):maxInt(halfArrAfter);
    }

    public int minInt(int[] arr){
        if(arr.length == 1){
            return arr[0];
        }    
        int halfArr[] = Arrays.copyOfRange(arr, 0, arr.length/2);
        int halfArrAfter[] = Arrays.copyOfRange(arr, arr.length/2, arr.length);
        
        return minInt(halfArr) < minInt(halfArrAfter)? minInt(halfArr):minInt(halfArrAfter);
    }
    //plus TODO : sort
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
