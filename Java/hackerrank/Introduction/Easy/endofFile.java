// EOF (no more can be read)

/*
 * read n lines of input until EOF, then number eachnd print all n lines
 * 
 * using scanner.hasnextLine() to check for more input
 */

import java.util.*;



public class endofFile {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // default line number
        int lineNumber = 1;

        // while loops 
        while (sc.hasNextLine()) {
            // print line number
            System.out.println(lineNumber + " " + sc.nextLine());
            lineNumber++;

        }
    sc.close();
     }
}