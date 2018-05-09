/**
<pre>
HackerRank 30 Days of Code. Day 8: Dictionaries and Maps
</pre>
@author: ohahohah.githyb.io
@version: 1.0
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);            
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneBook.containsKey(s)){
                System.out.println(s+"="+phoneBook.get(s));    
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
/*
##Task
Given names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for is not found, print Not found instead.

Note: Your phone book should be a Dictionary/Map/HashMap data structure.

##Input Format

The first line contains an integer, , denoting the number of entries in the phone book.
Each of the subsequent lines describes an entry in the form of space-separated values on a single line. The first value is a friend's name, and the second value is an -digit phone number.

After the lines of phone book entries, there are an unknown number of lines of queries. Each line (query) contains a to look up, and you must continue reading lines until there is no more input.

Note: Names consist of lowercase English alphabetic letters and are first names only.

##Output Format

On a new line for each query, print Not found if the name has no corresponding entry in the phone book; otherwise, print the full and in the format name=phoneNumber.

##Sample Input
```
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry
```
##Sample Output
```
sam=99912222
Not found
harry=12299933
```
*/