/**
<pre>
HackerRank 30 Days of Code.Day 12: Inheritance
</pre>
@author ohahohah.github.io
@version 1.0
*/
import java.util.*;
class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
            +   "\nID: " + idNumber);
    }
}

class Student extends Person{
    private int[] testScores;
    public int[] getTestScores(){
        return testScores;
    }
    public void setTestScores(int[] testScores){
        this.testScores = testScores;
    }

    /*  
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    Student(String firstName, String lastName, int id, int[]scores){
        super(firstName, lastName, id);
        this.testScores = scores;
    }
    
    /*  
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public char calculate(){
        double sum = 0.0;
        for(int value : testScores){
            sum += value;
        }
        double avg = sum / testScores.length;
        return calGrade(avg);
    }
    
    private char calGrade(double score){
        if(90<=score && score<=100){
            return 'O';
        }else if(80<=score && score<=90){
            return 'E';
        }else if(70<=score && score<=80){
            return 'A';
        }else if(55<=score && score<=70){
            return 'P';
        }else if(40<=score && score<=55){
            return 'D';
        }else if(score<40){
            return 'T';
        }else {
            return Character.MIN_VALUE;   
        }
    }
}
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i &lt; numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

/*
##Task
You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.

Complete the Student class by writing the following:
```
    A Student class constructor, which has parameters:
        A string, .
        A string, .
        An integer, .
        An integer array (or vector) of test scores, .
    A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:
```
##Input Format

The locked stub code in your editor calls your Student class constructor and passes it the necessary arguments. It also calls the calculate method (which takes no arguments).

You are not responsible for reading the following input from stdin:
The first line contains , , and , respectively. The second line contains the number of test scores. The third line of space-separated integers describes .

##Constraints
4<=|firstName|,|lastName|<=10
|id| 7
0<=socre,average<=100

##Output Format

This is handled by the locked stub code in your editor. Your output will be correct if your Student class constructor and calculate() method are properly implemented.

##Sample Input
```
Heraldo Memelli 8135627
2
100 80
```
##Sample Output
```
 Name: Memelli, Heraldo
 ID: 8135627
 Grade: O
```
*/