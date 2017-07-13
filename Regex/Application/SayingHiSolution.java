/**
<pre>
HackerRank.Regex.Applications.Saying Hi
</pre>
@author ohahohah.github.io
@version 1.0
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.util.regex.*;

public class SayingHiSolution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        String[] inputArr = new String[count]; 
        
        for(int i =0; i < count; i++){
             inputArr[i] =  scan.nextLine(); 
        }    
		scan.close();
        
		String regExp = "^[Hh][Ii]\\s[^Dd].*$";
        
       //sol 01. Matcher.matches() : RegExp must contain ^ and $ , entire input sequense.
        Pattern p = Pattern.compile(regExp);
        for(String strInput : inputArr){	
            Matcher m = p.matcher(strInput);
            if(m.matches()){
				System.out.print("matches(): ");
                System.out.println(strInput);
			}
		}
		
		//sol 02. Matcher.find() : 
		//Doesn't need to contain ^ and $ , but this method finds 'the next' matched sentense. 
		//Matcher object was not reset. 
		String regExp_forFind = "[Hh][Ii]\\s[^Dd]";
		Pattern pf = Pattern.compile(regExp_forFind);
        for(String strInput : inputArr){	
            Matcher m = p.matcher(strInput);
			if(m.find()){
                System.out.print("find(): ");
				System.out.println(strInput);
			}
		}
        
        //sol 03. Less efficient - not allowed compiled pattern to be reused 
        for(String strInput : inputArr){
            if(Pattern.matches(regExp,strInput)){
				System.out.println(strInput);
			}
		}
        
        
    }
}

/*
Given a sentence, , write a RegEx to match the following criteria:

The first character must be the letter  or .
The second character must be the letter  or .
The third character must be a single space (i.e.: ).
The fourth character must not be the letter  or .
Given  lines of sentences as input, print each sentence matching your RegEx on a new line.

### Input Format

The first line contains an integer, , denoting the number of lines of sentences. 
Each of the  subsequent lines contains some sentence  you must match.

### Constraints

Each sentence, , contains  to  words.
Each word/token in a sentence is comprised only of upper and lowercase English letters.
Output Format

Find each sentence, , satisfying the RegEx criteria mentioned above, and print it on a new line.

### Sample Input

5
Hi Alex how are you doing
hI dave how are you doing
Good by Alex
hidden agenda
Alex greeted Martha by saying Hi Martha

### Sample Output

Hi Alex how are you doing

### Explanation

The first sentence satisfies the RegEx criteria set forth in the Problem Statement (starts with the case-insensitive word , followed by a space, followed by a letter that is not ), so we print the sentence on a new line.
The second sentence fails our RegEx criteria, as the second word/token starts with a  (so we print nothing).
The third sentence fails our RegEx criteria, as it doesn't start with an  (so we print nothing).
The fourth sentence fails our RegEx criteria, as the third character in the sentence is not a space (so we print nothing).
The fifth sentence fails as our RegEx criteria, as the sentence does not start with the word  (so we print nothing).

 */