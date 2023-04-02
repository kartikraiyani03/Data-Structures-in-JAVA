
import java.util.*;
 
public class queueStack
{
    static class Queue
    {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

       public static boolean isEmpty()
       {
         return s1.isEmpty() && s2.isEmpty();
       }

       public static void enqueue(int data)
       {
        //  if(s1.isEmpty())
        //  {
        //     s1.push(data);
        //  }

          while(!s1.isEmpty())
          {
             s2.push(s1.pop());
          }

          s1.push(data);

          while(!s2.isEmpty())
          {
            s1.push(s2.pop());
          }
       }

       public static int dequeue()
       {
         if(s1.isEmpty())
         {
            return 0;
         }
         else
         {
            return s1.pop();
         }
       }

       public static int peek()
       {
        if(!s1.isEmpty())
        {
           return 0;
        }
        else
        {
           return s1.peek();
        }
       }

    //    public static void print()
    //    {
    //     if(!s1.isEmpty())
    //     {
    //        return;
    //     }
    //     else
    //     {
    //         while(!s1.isEmpty())
    //         {
    //             System.out.println(s1.peek()+" | ");
    //             s1.pop();
    //         }
    //     }
         
    //    }
    }
    public static void main(String args[])
    {
        Queue q = new Queue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        while(!q.isEmpty())
        {
            System.out.print(q.peek()+" | ");
            q.dequeue();
        }


    }
}