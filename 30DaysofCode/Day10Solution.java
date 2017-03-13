/**
/**
<pre>
HackerRank 30 Days of Code.Day 10: Binary Numbers
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[]binaryArr = Integer.toBinaryString(n).toCharArray();
        int oneCount =0;
        int count =0;
        for(int i = 0;  i<binaryArr.length; i++){
            if(binaryArr[i] == '1'){
             count++;
            }else{
                if(count > oneCount){
                    oneCount = count; 
                    count =0;
                }
            }
        }
        System.out.println(oneCount);
    }
}
/*
##Task
Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation.

##Input Format

A single integer

##Output Format

Print a single base- integer denoting the maximum number of consecutive 's in the binary representation of .

##Sample Input 1

5

##Sample Output 1

1

##Sample Input 2

13

##Sample Output 2

2

*/