import java.util.*;
 
public class queueArray
{
    static class Queue
    {
         static int  size;
         static int rear = -1;
         static int front = -1;

         static int arr[];

        Queue(int size)
        {
            arr = new int[size];
            this.size = size; 
        }

        public static boolean isEmpty()
        {
            if(rear == -1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        public static boolean isFull()
        {
            if(rear == size -1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        public static void enqueue(int data)
        {
            if(isFull())
            {
                return;
            }
            else
            {
                rear++;
                arr[rear] = data;
            }
        }

        public static int dequeue()
        {
            if(isEmpty())
            {
                return 0;
            }
            else
            {
                int front = arr[0];

                for(int i = 0; i < rear ; i++)
                {
                    arr[i] = arr[i+1];
                }
                
                rear--;
                return front;
            }
        }

        public static int peek()
        {
            if(isEmpty())
            {
                return 0;
            }
            else
            {
                return arr[0];
            }
        }

        public static void print()
        {
            if(isEmpty())
            {
                return;
            }
            else
            {
                // while(!isEmpty())
                // {
                //  System.out.print(peek()+" | ");
                //  dequeue();
                // }

                for(int i = front+1; i <= rear; i++)
                {
                    System.out.print(arr[i]+" | ");
                }
            }
        }
    }

    public static void main(String args[])
    {
        Queue q = new Queue(6);

        System.out.println(" ");
        
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        
        q.print();
        System.out.println(" ");
        System.out.println(" ");

    }
}