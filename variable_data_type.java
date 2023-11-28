package Question_practice;

/* Q) Print the ASCII value of character ‘U’. */

// import java.util.*;
// public class variable_data_type{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the alphabate: ");
//         String alpha = sc.next();
//         System.out.println("Alphabate: "+alpha);

//         int asciiValue = (int)alpha.charAt(0);
//         System.out.println("ASCII value of '"+alpha+"' is "+asciiValue);
//     }
// }




/*Q3 - Write a Java program to take the length and breadth of a rectangle and print its area. */

// import java.util.*;
// public class variable_data_type{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter length of rectrangle: ");
//         float l = sc.nextInt();
//         System.out.print("Enter breadth of rectrangle: ");
//         float b = sc.nextInt();

//         float area = l * b ;
//         System.out.println("Area of rectrangle is "+area);
//     }
// }





/*Q4 - Write a Java program to calculate the cube of a number. */

// import java.util.Scanner;
// public class variable_data_type{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value: ");
//         float x = sc.nextInt();
//         float cube = x * x * x;
//         System.out.println("Cube of "+x+" is "+cube);
//     }
// }




/* 5) Write a java program to swap two numbers with the hhelp of a third variable. */

import java.util.*;
public class variable_data_type{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter of value A: ");
        int n = sc.nextInt();
        System.out.print("Enter of value B: ");
        int m = sc.nextInt();

        System.out.println("Before Swap value of A: "+n+" and B: "+m);


        int temp;
        temp = n;
        n = m;
        m = temp;
        System.out.println("After swapping ");
        System.out.println("A = "+n+" and B = "+m);

    }
}

