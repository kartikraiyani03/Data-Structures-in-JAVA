import java.util.*;

public class towerOfHanoi 
{
    public static void Hanoi(int n, String src, String helper, String dest) 
    {
        if (n == 1) 
        {
            System.out.println("Disk " + n + " Move from " + src + " to " + dest);
            return;
        }
        Hanoi(n - 1, src, dest, helper);
        System.out.println("Disk " + n + " Move from " + src + " to " + dest);
        Hanoi(n-1,helper,src,dest);
    }

    public static void main(String args[]) 
    {
        int n=2;
        Hanoi(n,"Source","Helper","Destination");

    }
}