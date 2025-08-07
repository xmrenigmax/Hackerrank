// another harder loop problem

/*
 * following a series of patterns
 * 
 * we read ints a,b, and n 
 * we get q
 * 
 * a,b are inputs 
 * n is number of terms
 * 
 * n = a + 2^n-1 * b
 * next loop = a + 2^n-1 * b + 2^n-1 * b
 * next loop = a + 2^n-1 * b + 2^n-1 *b + 2^n-1 * b
 * 
 * q = each term in series
 */

 import java.util.*;
public class loops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);

        // t = number of loops
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            // q = stores result of each term
            int q = a;
            for(int j=0;j<n;j++){
                // q = a + 2^j * b
                // j = n-1
                q += Math.pow(2, j) * b;
                System.out.print(q + " ");
            }
            System.out.println();

        }
        in.close();
    }
}
