import java.util.Scanner;

public class FibonacciSeries {
    // Writing a program using For loop to print Fibonacci series 1 1 2 3 5 8 13 21
    public static void main(String[] args)
    {
        int a= 0;
        int b= 1;
    // Initialising Scanner class for user input
        Scanner scanner = new Scanner(System.in);
    // Assigning counter variable to scanner class for user input
        System.out.println("Please enter a counter number to display series");
        int count = scanner.nextInt();
    // For loop to count Fibonacci Series
        for (int i = 1; i <=count ; i++)
        {
            System.out.println(a + " ");
    // On each iteration, we are assigning second number to first number
        int sum = a+b;
        a = b;
        b = sum;
    // Assigning sum of last 2 numbers to Second number
        }    

    }
}
