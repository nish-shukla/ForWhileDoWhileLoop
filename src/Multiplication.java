import java.util.Scanner;

public class Multiplication {
// Writing a program multiplication table for given number
public static void main(String[] args)
{
// Integer variable for user input
    int a;
    int b;
// Initialising Scanner class for user input
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please Enter number to get multiplication table  ");
    a = scanner.nextInt();
    System.out.println("Enter a number up to you want to multiply ");
    b = scanner.nextInt();
// For loop for iteration
    for (int i = 1; i <=b ; i++)
    {
        System.out.println(a + " * " + i + " = " + a*i) ;
    }
}
}
