import java.util.Scanner;

public class PalindromeNumber {
// Writing a program to check if it is Palindrome or not ??
public static void main(String[] args) {
// Scanner class for user input
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 5 digit number : ");
    int num1 = scanner.nextInt();   // logic for 1234
    int num2 = num1;
    int reverse = 0;
// Using while loop to check and compare
    while (num1 != 0) {
        reverse = reverse*10 + num1%10; //0+1234%10=4 --> 40+3=43 --> 430+2=432 --> 4320+1= 4321
        num1 = num1 / 10;              // 1234/10 = 123 --> 123/10-->12 -->12/10=1 --> 1/10=0
    }
    if (num2==reverse)  // Comparing with original input
    {
        System.out.println(num2 + " is Palindrome number");
    }
    else
    {
        System.out.println(num2 + " is not a Palindrome number");
    }

}

}
