import java.util.Scanner;
public class ReverseNumber {
    // Writing a program to user input 5 number and print it in reverse order
    public static void main(String[] args) {
// Creating 2 Integer variable for While loop
        int a = 0;
        int reverse = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 digit number : ");
        a = scanner.nextInt();
// Using while loop to find reverse number
        while (a != 0)
        {
            reverse = reverse * 10;
            reverse = reverse + a % 10;
            a = a / 10;
        }
        System.out.println("Reverse sequence of inputted number is : " + reverse);
    }
}