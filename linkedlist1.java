import java.util.*;
 
public class linkedlist1
{
    public static void main(String args[])
    {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("NULL");

        list.removeLast();
        System.out.println(list);
    }
}