import java.util.Scanner;
public class FactorialNumber {
    // Writing a program to find a factorial number of user input
// 5 = 5*4*3*2*1 = 120 Answer
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to find factorial of this number :");
        num1 = scanner.nextInt();

        for (int i = 1; i <= num1; i++) {
            num2 = num2 * i;
        }
        System.out.println("Factorial of " + num1 + " is " + num2);
    }

}