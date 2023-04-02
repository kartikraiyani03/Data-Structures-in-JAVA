import java.util.*;
 
public class Array
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(0);
        list.add(2);
        list.add(1);

        System.out.println(list);
        
        int a = list.get(3);
        System.out.println(a);
        
        int b = list.set(3,33);
        System.out.println(list);
        
        for(int i =0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        
        System.out.println("");
        System.out.println(list.size());
        
        list.remove(4);
        System.out.println(list.size());
        
        Collections.sort(list);
        System.out.println(list);
        
    }
}