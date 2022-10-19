import java.util.Scanner;
// Writing a program to print any 10 numbers given by User Input

public class PrintAny10Number {
    public static void main(String[] args)
    {
    // Initializing Scanner Class for User input
    Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first number");
    // Assigning Integer variable for user input
        int a = scanner.nextInt();
        System.out.println("Please enter last number");
        int b = scanner.nextInt();
    // For Loop to compare and print first & second number
        for (int i = a; i <=b; i++)
        {
            System.out.println(i);
        }
    }
}
