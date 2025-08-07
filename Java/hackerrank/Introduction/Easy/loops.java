// using loops in Java

/*
 * times tables from 1 to 10, only if N is between 2 and 20
 * 
 * You are given an integer N.
 */



import java.io.*;

public class loops {
    public static void main(String[] args) throws IOException {

        // BufferedReader is used to read input from the console (scanner but more efficient)

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // read the integer N from the console
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if (N < 2 || N > 20) {
            System.out.println("N must be between 2 and 20");
            bufferedReader.close();
            return;
        }
        else {
            for (int i = 1; i <=10 ; i++) {
                System.out.println(N + " x " + i + " = " + (N*i));
            }
    }
        bufferedReader.close();
    }
}