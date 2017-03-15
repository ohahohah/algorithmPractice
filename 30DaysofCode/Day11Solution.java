/**
<pre>
HackerRank 30 Days of Code.Day 11: 2D Arrays
</pre>
@author ohahohah.github.io
@version 1.0
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int maxResult = Integer.MIN_VALUE;
        int sumResult = 0;
        for(int row=0; row+2 < 6; row++){
            for(int col=0; col+2 < 6; col++){
                sumResult = arr[row][col]+arr[row][col+1]+arr[row][col+2]+arr[row+1][col+1]+arr[row+2][col]+arr[row+2][col+1]+arr[row+2][col+2];
                if(sumResult > maxResult){
                    maxResult = sumResult;
                }
            }
        }
        System.out.println(maxResult);
    }
}

/*
##Context
Given a 2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

We define an hourglass in to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g

There are hourglasses in , and an hourglass sum is the sum of an hourglass' values.

##Task
Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

##Input Format

There are lines of input, where each line contains space-separated integers describing 2D Array ; every value in will be in the inclusive range of to .

Constraints

##Output Format

Print the largest (maximum) hourglass sum found in .

##Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

##Sample Output

19
*/