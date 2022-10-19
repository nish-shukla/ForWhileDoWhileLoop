import java.util.Scanner;

public class NaturalNumber {
// Writing a program to display sum of Natural number

    public static void main(String[] args)
    {
// Integer variable for numbers input
    int startNo=0; // sum from
    int endNo=0; // sum upto
    int sum=0;
// Scanner class for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to Start Sum from :");
        startNo = scanner.nextInt();
        System.out.println("Enter last number to do total up to : ");
        endNo = scanner.nextInt();
// Using whiles loop for iteration
        while ( startNo <= endNo)
        {
// Adding value of i to sum variable
            sum = sum + startNo ;
// Increase the value of i by 1 ++
            startNo++;
        }
        System.out.println("Sum of Natural number =" + sum );

    }
}