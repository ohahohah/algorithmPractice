/**
<pre>
HackerRank.Algorithms.WarmUp.Simple Array Sum
</pre>
@author ohahohah.github.io
@version 1.0
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SimpleArraySumSolution {
    static int sumArray(int arr[]){
        int result = 0;
        for(int i=0;i<arr.length;i++){
            result += arr[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        System.out.println(sumArray(arr));
    }
}

/*
Given an array of integers, can you find the sum of its elements?

##Input Format
The first line contains an integer, , denoting the size of the array.
The second line contains space-separated integers representing the array's elements.

###Output Format
Print the sum of the array's elements as a single integer.

##Sample Input
6
1 2 3 4 10 11

##Sample Output
31
*/