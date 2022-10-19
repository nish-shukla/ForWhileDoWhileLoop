public class NumberDivision {
    /* Writing a program to print all the numbers between 1 to 100
       and divisible by 3 and 5  */
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
// Using for loop for iteration
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.println("Numbers dividable by 3 is : " + i + ", ");
            }

            for (int j = a; j <= b; j++) {
                if (j % 5 == 0) {
                    System.out.println("Numbers dividable by 5 is : " + j + ", ");
                }
            }

        }

    }
}