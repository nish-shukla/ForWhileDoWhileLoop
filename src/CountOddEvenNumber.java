import java.util.Scanner;

public class CountOddEvenNumber {
// Writing a program to find total number of Odd & Even number and sum of them
public static void main(String[] args)
{
// Defining integer variable
    double i;
    double num1;
    double even_Sum=0;
    double odd_Sum=0 ;
// Initialising Scanner class for user input
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter 5 digit number :\n");
    num1 = scanner.nextInt();

// Using while loop to check and compare
    i=1;
    while (i<=num1)
    {
     if (i%2==0)  // Checking if even number If dividable by 2
         even_Sum=even_Sum+i;  // Storing result to variable even_Sum
     else
         odd_Sum = odd_Sum+i;  // If first condition is fail then it's Odd number
     i++;                     // Increment by 1 to check condition again
    }
    System.out.println("Sum of all odd numbers are : " + odd_Sum);
    System.out.println("Sum of all Even numbers are : " + even_Sum);
}
}

