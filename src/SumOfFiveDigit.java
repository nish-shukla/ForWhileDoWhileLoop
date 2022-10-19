import java.util.Scanner;

public class SumOfFiveDigit {
// Writing a program to find Sum of entered 5 digit number by user
public static void main(String[] args)
{
    int num1=0;
    int digit=0;
    int sum =0;
// Scanner class for user input
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter 5 digit number :--> ");
    num1 = scanner.nextInt();

    while(num1>0) // First condition entered number should be greater then 0
    {
        digit = num1 % 10; // To find last digit number
        sum = sum + digit; // To add last digit to variable Sum
        num1 = num1 / 10;   // To remove last digit from number
    }
    System.out.println(" Sum of entered digits  is : = " + sum );

    }

}

