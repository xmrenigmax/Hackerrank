// determining what input fits into which data type

/*
 * 8 data types
 * - byte = 8-bit signed, *
 * - short = 16-bit signed,*
 * - int = 32-bit signed, *
 * - long = 64-bit signed, *
 * - float = 32-bit floating point,
 * - double = 64-bit floating point,
 * - char = 16-bit Unicode character,
 * - boolean = true/false
 */


import java.util.*;
public class datatypes {
 public static void main(String []argh)
    {
        // read input
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        // loop through all inputs
        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
        sc.close();
    }
}