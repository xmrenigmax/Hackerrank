// Stdin and Stdout in Java with nextLine()

/* 
 * usage of nextline needs to be done carefully
 * 
 * input : 42 ; 3.1415 ; Hello World
 * output : Int: 42 ; Double: 3.1415 ; String: Hello World
*/

// Import
import java.util.Scanner;

public class stdinstdout2 {
    public static void main(String[] args) {
        // Scanner Object
        Scanner scan = new Scanner(System.in);

        //input
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // Consume the newline character left by nextDouble() (important)
        String s = scan.nextLine();

        //output
        System.out.println("Int: " + i);
        System.out.println("Double: " + d);
        System.out.println("String: " + s);

        // Close the scanner
        scan.close();
    }
    
}
