/**
<pre>
HackerRank 30 Days of Code. Day 7
</pre>
@author ohahohah.github.io
@version 1.0
*/

import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        for(int j =1 ; j <= n; j++){
            System.out.print(arr[n-j]+" ");
        }
    }
}

/*
##Task
Given an array, , of integers, print 's elements in reverse order as a single line of space-separated numbers.

##Input Format
The first line contains an integer, (the size of our array).
The second line contains space-separated integers describing array 's elements.

##Output Format
Print the elements of array in reverse order as a single line of space-separated numbers.

##Sample Input
4
1 4 3 2

##Sample Output
2 3 4 1
*/