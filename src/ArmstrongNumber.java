import java.util.Scanner;

public class ArmstrongNumber {
// Writing a program to find Armstrong number
public static void main(String[] args)
{
// defining various variable for input and comparison
    int num1;
    int org_Num=0;
    int remainder=0;
    int result=0;
// Scanner class for user input
    Scanner scanner= new Scanner(System.in);
    System.out.println("Please enter number : ");
    num1=scanner.nextInt();
    org_Num = num1;

    while (org_Num !=0) // when original number from user input is not equal to zero
    {
        remainder = org_Num %10; // Dividing number by 10 to get remainder value
        result += Math.pow(remainder, 3); // it will raise value by power of 3 (Java function)
        org_Num /= 10;
    }
        if (result == num1)
        {
            System.out.println( num1 + " : is an Armstrong number.");
        }
        else
        {
            System.out.println( num1 + " : is not an Armstrong number.");
        }

        }
}
