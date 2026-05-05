/*Write a program that takes a student's numerical score as input 
and determines their letter grade based on specific performance brackets.
90 or above: Grade A
70 to 89: Grade B
50 to 70: Grade C
35 to 50: Grade D 
Below 35: Grade F*/

import java.util.Scanner;
public class CheckGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        if (marks >= 90){
            System.out.println("The grade is A");
        }
        else if (marks >= 70){
            System.out.println("The grade is B");
        }
        else if( marks >= 50){
            System.out.println("The grade is C");
        }
        else if (marks >= 35){
            System.out.println("The grade is D");
        }
        else{
            System.out.println("The grade is F");
        }
        scanner.close();
    }
}
