import java.util.*;
 
public class cqueue
{
    static class CQueue
    {
        static int size;
        static int front = -1;
        static int rear = -1;
        static int arr[];

        CQueue(int size)
        {
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty()
        {
            if(front == -1 && rear == -1)
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
            if((rear+1)%size == front)
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
                rear = (rear+1) % size;
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
                for(int i= front+1; i <= rear; i++)
                {
                    System.out.print(arr[i]+" | ");
                }
            }
        } 


    }
    public static void main(String args[])
    {
        CQueue cq = new CQueue(6);

        System.out.println(" ");
        
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.dequeue();
        cq.enqueue(4);
        cq.dequeue();
        cq.enqueue(5);
        cq.dequeue();
        
        cq.print();
        System.out.println(" ");
        System.out.println(" ");

    }
}