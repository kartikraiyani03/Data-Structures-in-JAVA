import java.util.*;
 
public class queueList
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue
    {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty()
        {
            if(head == null && tail == null)
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
            Node ptr = new Node(data);

            if(tail == null)
            {
                tail = head = ptr;
                return;
            }
            else
            {
                tail.next = ptr;
                tail = ptr;
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
                if(head == tail)
                {
                    tail = null;
                }

                int a = head.data;
                head = head.next;
                return a;
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
                return head.data;
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

                for(int i = head.data; i <= tail.data; i++)
                {
                    System.out.print(head.data+" | ");
                    head = head.next;
                }
            }
        }

    }
    public static void main(String args[])
    {
       Queue q = new Queue();

       q.enqueue(1);
       q.enqueue(2);
       q.enqueue(3);
       q.enqueue(4);
       q.enqueue(5);

       q.print();
    }
}