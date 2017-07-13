---
/**
<pre>
HackerRank 30 Days of Code. Day 9: Recursion
</pre>
@author ohahohah.github.io
@version 1.0
</pre>
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int factorial(int n){
        if(n>=1){
            return n*factorial(n-1);    
        }else return 1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(factorial(num));
    }
}

/*
##Task
Write a factorial function that takes a positive integer, as a parameter and prints the result of ( factorial).

Note: If you fail to use recursion or fail to name your recursive function factorial or Factorial, you will get a score of .

##Input Format

A single integer, (the argument to pass to factorial).

##Constraints

    Your submission must contain a recursive function named factorial.

##Output Format

Print a single integer denoting .

##Sample Input

3

##Sample Output

6


*/