/*Q1 - Write a program to print Fibonacci series of n terms where n is input by user. */

// import java.util.*;
// public class on_loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number: ");
//         int num = sc.nextInt();
//         int a = 1;
//         int b = 1;
//         int sum;

//         for(int i = 1; i<=num; i++){
//             System.out.print(a+" ");
//             sum = a+b;
//             a = b;
//             b = sum;
//         }
//     }
// }



/*Q2 - Write a program to enter the numbers till the user wants, the number can be positive,
negative or zero. Calculate the sum of numbers until a negative number is encountered. I
f the input is a negative number, current sum is discarded and print -1. */

// import java.util.*;
// public class on_loop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value: ");
//         int n = sc.nextInt();
//         for(int i = 0; i<n; i++){
//             System.out.print("Enter number"+n+": ");
//             int num = sc.nextInt();

//             if(num <= 0){
//                 System.out.println(-1);
//                 break; //exit the loop if a negative number is entered.
//             }
//         }
//         if(sc.hasNextLine()){ //Check if any unread input remains
//             sc.nextLine(); //Consume the remaining newline character
//         }
//         System.out.println("End of loop.");

//     }
// }


/*Q3) Write a program to calculate the factorial of a number. */

// import java.util.*;
// public class on_loop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value: ");
//         int value = sc.nextInt();
//         int ans = 1; //initialize with 1 as factorial of 0 and 1 both is 1
//         for(int i = 1; i<=value; i++){
//             ans = ans* i; //keep multiplying numbers in the current product till you reach n
//         }
//         System.out.println("Factorial of "+value+" is " +ans);
//     }
// }



/*Q4- Write a program to print all Armstrong numbers between 1 to n. */


// import java.util.*;
// public class on_loop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value: ");
//         int n = sc.nextInt();
//         int num = 1;
//         while(num <= 1){
//             int count = 0;
//             int i = num;
//             while(i > 0){
//                 count++;
//                 i/=10;
//             }
//             int val = num;
//             int sum = 0;
//             while(val > 0){
//                 int digit = val % 10;
//                 sum += Math.pow(digit, count);
//                 val /= 10;
//                 if(sum > val){
//                     continue;
//                 }
//             }
//             if(sum == num){
//                 System.out.println(num);
//             }
//             num++;
//         }
//     }
// }




/*Q5 – Write a program to print the cross pattern given below (in the shape of X): */



// import java.util.*;
// public class on_loop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size: ");
//         int size = sc.nextInt();
//         for(int i = 0; i<size; i++){
//             for(int j = 0; j<size; j++){
//                 if(i==j || i+j == size-1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



/* Q6- Write a program to print alphabet diamond pattern: */

// import java.util.*;      /* not complete */
// public class on_loop{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value: ");
//         int size = sc.nextInt();
//         int alpha = 65;
//         int num = 0;

//         for(int i = 0; i< size; i++){
//             for(int j = size; j > i; j--){
//                 System.out.println(" ");
//             }
//             for(int k = 0; k< i*2-1 ; k++){
//                 System.out.print(" ");
//             }
//             for(int k = 0; k<i*2;k++){
//                 System.out.println((char)(alpha+num++));
//             }
//             num = 0;
//             System.out.println();
//         }
//         for(int i = 1; i<= size-1; i++){
//             for(int j = 0; j< i; j++){
//                 System.out.println(" ");
//             }
//         }
//     }
// }




// import java.util.Scanner;
// public class on_loop{
//     public static void main(String[] args) {
//         int marks[] = new int[5];
//         marks[0] = 58;
//         marks[1] = 66;
//         marks[2] = 48;
//         marks[3] = 78;
//         marks[4] = 99;

//         for(int i = 0; i<5; i++){
//             System.err.println(marks[i]);
//         }
//     }
// }



// import java.util.*;
// public class on_loop{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         for(int i = 0; i< n; i++){
//             for(int j = 0; j< n; j++){
//                 System.out.println(i+", "+j+" = "+j);
//             }
//         }
//     }
// }




import java.util.*;
public class on_loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int num = sc.nextInt();
        int temp = num; // It is used to copy the input into 'temp'
        int digit = 0;
        if(num == 0){
            digit = 1;
        }
        else{
            while (num != 0) {
                num /= 10;
                digit++;
            }
        }
        System.out.println(temp+" is a "+digit+"-digit number.");
    }
}