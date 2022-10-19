public class MultiplicationTable {
 /* Writing a program to print multiplication table using
    DO WHILE loop */
 public static void main(String[] args)
 {
  System.out.print("Multiplication table\n");  // \n for next line display
  int i=1;
  while(i<=5)  // When i (1) <= 5 Horizontal
  {
   int j=1;
   while(j<=5) // When j <= = vertically
   {
    System.out.print(i*j+"\t");  // multiplying i & j and tab space
    j++;  // increment to j value
   }
   i++;   // then increment to i value
   System.out.println();  // blank print ln
  }
 }

}


