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
        String binaryStr = Integer.toBinaryString(n);
        int maxCount =0;
        int count =0;
        for(int i = 0;  i < binaryStr.length(); i++){
            if(binaryStr.charAt(i) == '1'){
             count++;
             if(count > maxCount){
              maxCount = count; 
             }
            }else{
                count = 0;
            }
        }
        System.out.println(maxCount);
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

/*
##TestCase 1
- Input: 439 
- Output: 3
##TestCase 2
- Input: 65535 
- Output: 16
*/
