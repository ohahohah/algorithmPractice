/**
<pre>
HackerRank.Regex.Applications.HackerRank Language
</pre>
@author ohahohah.github.io
@version 1.0
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankLanguageSolution {

    public static void main(String[] args) {
        
        String strProgList = "C:CPP:JAVA:PYTHON:PERL:PHP:RUBY:CSHARP:HASKELL:CLOJURE:BASH:SCALA:ERLANG:CLISP:LUA:BRAINFUCK:JAVASCRIPT:GO:D:OCAML:R:PASCAL:SBCL:DART:GROOVY:OBJECTIVEC";
        
        Scanner in = new Scanner(System.in);
        int inputNum = Integer.parseInt(in.next());
        
        //Constraints - Number of Program(in response program list)
        Boolean checkNumberN = true;
        if(inputNum > 100){
           checkNumberN = false;
        }
        
        //Get input Separately ('api_id','Program id')
        String[] strArrInput = new String[inputNum];
        int[] numArrInput = new int[inputNum];
        for(int i = 0; i<inputNum; i++){
            numArrInput[i] = Integer.parseInt(in.next());
            strArrInput[i] = in.next();    
        }
        in.close();
        
       //sol01. Use input as regExp
        /*
       for(int i=0; i<inputNum; i++){   
        Pattern p = Pattern.compile("\\b"+strArrInput[i]+"\\b");
        Matcher m = p.matcher(strProgList);
           
        if(checkNumberN){
            if(10000 > numArrInput[i] || 100000 < numArrInput[i]){
                System.out.println("INVALID");   
            //}else if(m.find(0)){
            }else if(m.matches()){
                System.out.println("VALID");
            }else System.out.println("INVALID");   
        }
        */
         
       //sol02. Use strProgList as regExp -> doesn't need to compile regExp everytime when input is changed
       Pattern p = Pattern.compile("^("+strProgList.replaceAll(":","|")+")$");
       for(int i=0; i<inputNum; i++){   
        Matcher m = p.matcher(strArrInput[i]);           
           
        if(checkNumberN){
            if(10000 > numArrInput[i] || 100000 < numArrInput[i]){
                System.out.println("INVALID");   
            //}else if(m.find(0)){
            }else if(m.matches()){
                System.out.println("VALID");
            }else System.out.println("INVALID");   
        }
           
        
           
       } 
    }
}

/*
Every submission at HackerRank has a field called language which indicates the programming language which a hacker used to code his solution.

C:CPP:JAVA:PYTHON:PERL:PHP:RUBY:CSHARP:HASKELL:CLOJURE:BASH:SCALA: ERLANG:CLISP:LUA:BRAINFUCK:JAVASCRIPT:GO:D:OCAML:R:PASCAL:SBCL:DART: GROOVY:OBJECTIVEC

Sometimes, error-prone API requests can have an invalid language field. Could you find out if a given submission has a valid language field or not?

### Input Format

First line contains N. N API requests follow, each in a newline. Each request has an integer api_id and a string language which are the request parameters placed by the an API request.

### Constraints

1 <= N <= 100  
10^4 <= api_id < 10^5  
a valid language is any of the languages listed above (case sensitive):

### Output Format

For every api request given in input, print "VALID" if it has a valid language string in it or print "INVALID" otherwise.

### Sample Input

3
11011 LUA
11022 BRAINFUCK
11044 X

### Sample Output

VALID
VALID
INVALID
Explanation

LUA and BRAINFUCK are valid languages as listed above. As X is doesn't appear in the list, it is an invalid request.
*/