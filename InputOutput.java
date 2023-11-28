package Question_practice;


/* Q1 - Input name, roll number and field of interest from user and print in the format below :
Name: xyz, Roll number: xyz, Field of interest: xyz */
// import java.util.*;
// public class InputOutput {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Full Name: ");
//         String name = sc.nextLine();
//         System.out.print("Enter Roll number: ");
//         int roll = sc.nextInt();
//         System.out.print("Enter Field of interest: ");
//         String field = sc.next();
//         System.out.println();

//         System.out.println("Full Name: "+name);
//         System.out.println("Roll Number: "+roll);
//         System.out.println("Field of interest: "+field);
//     }
// }



/* Q2 - Input two different string and print them in same line.*/
// import java.util.*;
// public class InputOutput{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first value: ");
//         String first = sc.next();
//         System.out.print("Enter second value: ");
//         String second = sc.next();
//         System.out.println();
//         System.out.println(first+" "+second);
//     }
// }



/*Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of 100), write a program
to calculate his total marks and percentage marks. */

// import java.util.*;
// public class InputOutput{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter marks 1: ");
//         float mark1 = sc.nextFloat();
//         System.out.print("Enter marks 2: ");
//         float mark2 = sc.nextFloat();
//         System.out.println("Enter marks 3: ");
//         float mark3 = sc.nextFloat();

//         float total = mark1+mark2+mark3;
//         float percentage = total /3;
//         System.out.println("Total marks: "+total);
//         System.out.println("Percentage = "+percentage);
//     }
// }



/*Q4 - Given two numbers, return their sum in the following format:
Int t representing number of test cases
T lines of Two integers representing the numbers to be added */

// import java.util.*;
// public class InputOutput{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value: ");
//         int t = sc.nextInt();
//         for(int i = 0; i< t; i++){
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             System.out.println(a+b);
//         }
//     }
// }



// import java.util.Scanner;
// public class InputOutput{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter repeatation: ");
//         int t = sc.nextInt();
//         for(int i = 0; i<t; i++){
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             System.out.println(a+b);
//         }
//     }
// }



/*Q5 - Given few lines of input(number of lines unknown) where each line has two
strings, concatenate the strings. */

import java.util.*;
public class InputOutput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int lines = sc.nextInt();
        System.out.println();

        for(int i = 0; i< lines; i++){
            String first = sc.next();
            String last = sc.next();
            System.out.println(first+last);
            System.out.println();
        }
    }
}