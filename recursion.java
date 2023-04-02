import java.util.*;
 
public class recursion
{
    public static int factorial(int n)
    {
        if( n == 0 || n == 1)
        {
            return 1;
        }
       return n*factorial(n-1);
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number");
       int n = sc.nextInt();
       System.out.println(factorial(n));
    }
}