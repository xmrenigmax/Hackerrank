// using format specifiers in Java

/*
 * input : 1 , Cat, 2 , Dog, 3 , Mouse
 * output : 1       Cat, 2       Dog       3, Mouse
 */

 // import
 import java.util.Scanner;

public class OutputFormat {
    
    public static void main(String[] args) {
        // Loop (int i = 1 (define starting point) i <=3 (define ending point) i++) (define increment)
        for (int i =1; i <= 3; i++) {
            Scanner sc = new Scanner(System.in);
            // every loop iteration prompts user for input
            System.out.print("Enter value for " + i + ": ");
            sc.nextLine(); // consume the newline character
            int num = sc.nextInt();
            String str = sc.next();

            // formatting output

            /*
             * methods of formatting output
             *  %d - for integers 
             *  %s - for strings
             *  \t - for tab space
             *  %n - for new line
             *  %f - for floating point numbers
             *  %c - for characters
             *  %b - for boolean values
             *  %x - for hexadecimal values
             *  %o - for octal values
             *  %e - for scientific notation
             *  %g - for general format
             */

             // this output will be formatted with a tab space between the number and the string
             // if the number is 1 and the string is "Cat", the output will be "1       Cat"
            System.out.printf("%d\t%s", num, str);

        // Close the scanner
        sc.close();
        }
    }
}
