/**
<pre>
HackerRank 30 Days of Code. Day 6
</pre>
@author ohahohah.github.io
@version 1.0
*/

import java.util.Scanner;

public class Day6Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testNum =  scan.nextInt();
        while(scan.hasNext()){
            for(int i = 0;i<testNum;i++){
                String inputStr = scan.next();              
                char [] charArray = inputStr.toCharArray();
                String evenStr = "";
                String oddStr = "";
                for(int j = 0; j<inputStr.length(); j++){
                    if(j%2 ==0){
                        evenStr = evenStr.concat(Character.toString(charArray[j]));
                    }else{
                       oddStr = oddStr.concat(Character.toString(charArray[j]));
                    }
                }
                System.out.println(evenStr+" "+oddStr);
            }
        }
    }

    /*
    ##Task 
    Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

    Note:  is considered to be an even index.

    ##Input Format

    The first line contains an integer,  (the number of test cases). 
    Each line  of the  subsequent lines contain a String, .

    ##Output Format

    For each String  (where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.

    ##Sample Input
    ```
    2
    Hacker
    Rank
    ```

    ##Sample Output
    ```
    Hce akr
    Rn ak
    ```

    */

}