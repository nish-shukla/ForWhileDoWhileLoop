import java.util.Scanner;

public class FirstLastNumberSum {
    // Writing a program to find sum of first & last digit number given
    public static void main(String[] args) {
// Defining variables to use
        int num1;
        int last_digit;
        int sum;
// Initialising Scanner class for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number "); // User input 1234
        num1 = scanner.nextInt();

        last_digit = num1 % 10; // To find last digit 1234 divide by 10 which is 4
        while (num1 > 9)   // when number greater then 9
        {
            num1 = num1 / 10;  //1234 = 1234/10 = 1
        }
        sum = last_digit + num1;  // sum is equal to 4+1 =5
        System.out.println("The sum of first & last digit is : " + sum);
    }
}