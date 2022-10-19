import java.sql.SQLOutput;
import java.util.Scanner;
public class PrimeNumber {
// Writing a program to find Prime number
// Using Scanner class for user input & For loop
public static void main(String[] args)
{
// Initialising Scanner class
    Scanner scanner = new Scanner(System.in);
// User input through Scanner class (First & Second number)
    System.out.println("Please enter your first number");
    int a= scanner.nextInt();
    System.out.println("Please enter your second number ");
    int b= scanner.nextInt();
    System.out.println("List of prime numbers between " + a + " and " + b );
// For loop for Iteration
    for (int i = a; i <b ; i++)
    {
        if (isPrime(i))
        {
            System.out.println(i);
        }
    }
}
    public static boolean isPrime(int num)
    {
        if (num<=1)
        {
            return false;
        }
        for (int i = 2; i <Math.sqrt(num) ; i++)
    {
        if (num%i==0)
        {
            return false;
        }
    }
            return true;
        }
}

