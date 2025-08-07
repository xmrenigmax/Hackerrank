// Stdin Stdout

/*
 * using Scanner for input and printing output
 * 
 * input: 42 ; 100 ; 125
 * output: mystring: 42 ; 100 ; 125
 */


 // Import
import java.util.Scanner;

public class StdinStdout {

    public static void main(String[] args) {
        // Scanner Object
        Scanner scans = new Scanner(System.in);

        // Inputs
        int a = scans.nextInt();
        int b = scans.nextInt();
        int c = scans.nextInt();

        // Close the scanner
        scans.close();

        // Output
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}


