package Question_practice;

/* Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result. */

// import java.util.*;
// public class operator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value: ");
//         int value = sc.nextInt();
//         int add = (value +8)/3;
//         int module = add%5;
//         int multiply = module *5;
//         System.out.println("The final result: "+multiply);
//     }
// }
/*Output: Enter value: 2345
The final result: 20 */



/* Q2 - Swap two numbers without the use of third variable. */
// import java.util.Scanner;
// public class operator{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first value: ");
//         int first = sc.nextInt();
//         System.out.print("Enter second value: ");
//         int second = sc.nextInt();
//         System.out.println("Before swap: A = "+first+" B = "+second);
//         System.out.println();
//         first = first + second;
//         second = first - second;
//         first = first - second;
//         System.out.println("After swapping:");
//         System.out.println("A = "+first+" B = "+second);
//     }
// }



/* Q3 - Write a program to calculate the sum of the digits of a 3-digit number.*/
// import java.util.*;
// public class operator{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter digits: ");
//         int n = sc.nextInt();
//         int sum = 0;
//         while(n>0){
//             sum += n%10;
//             n /= 10;
//         }
//         System.out.println(sum);
//     }
// }


/* Q4 - Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
 i) both the conditions 'a < 50' and 'a < b' are true.
ii) at least one of the conditions 'a < 50' or 'a < b' is true. */
// import java.util.*;
// public class operator{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter 1st variable: ");
//         int a = sc.nextInt();
//         System.out.print("Enter 2nd variable: ");
//         int b = sc.nextInt();
//         System.out.println();
//         // System.out.println(a<50 && a<b);  //input: 55 70   //output: false
//         System.out.println(a<b || a<50);  //input: 55 70   //output: true
//     }
// }




/*Q5 - Find the total number of bits needed to be flipped to convert x to y. */

// import java.util.*;
// public class operator{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 1st value: ");
//         int x = sc.nextInt();
//         System.out.println("Enter 2nd value: ");
//         int y = sc.nextInt();
//         int result = x^y;
//         int count = 0;
//         while(result != 0){
//             result = result & (result-1);
//             count++;
//         }
//         System.out.println(count);
//     }
// }




/* HackerRank Question solution*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2 != 0  || (N > 6 && N < 21)){
            System.out.println("Weird");
        }
        else if(( N >= 2 && N <= 5) || N > 20){
            System.out.println("Not Weird");
        }
        else{
            System.out.println("Default!");
        }

        // scanner.close();
    }
}
