// using selection statements 

/*
 * usage of if-else statement
 * 
 * input: 3 ; 24
 * Output:  Weird ; Not Weird
 * 
 * If N is odd, print Weird
 * If N is even and in the inclusive range of 2 to 5, print Not Weird
 * If N is even and in the inclusive range of 6 to 20, print Weird
 * If N is even and greater than 20, print Not Weird
 */


 // Import
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Read an integer from input
        int N = scan.nextInt();

        // Close the scanner
        scan.close();

        // meet conditions
        if (N % 2 == 1) {
            System.out.println("Weird");
        } else if (N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if (N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else if (N > 20) {
            System.out.println("Not Weird");
        }
    }
}

    