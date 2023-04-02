import java.util.*;
 
public class stackList
{
    static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }

    }

    public static class Stack
    {
        public static Node head;

        public static boolean isEmpty()
        {
            if(head == null)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        public static void push(int data)
        {
            Node ptr = new Node(data);
            if(isEmpty())
            {
                head = ptr;
                return;
            }
            else
            {
                ptr.next = head;
                head = ptr;
            }
        }

        public static int pop()
        {
            int top = head.data;

            if(isEmpty())
            {
                System.out.println("ELEMENT CAN'T BE INSERTED");
                return 0;
            }
            else
            {
                head = head.next;
                return top;
            }
        }

        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            else
            {
                return head.data;
            }
        }

        public static void print()
        {
            System.out.println(" ");
            while(!isEmpty())
            {
                System.out.print(peek()+" -> ");
                pop();
            }
            System.out.println("NULL");
            System.out.println(" ");
        }

    }

    public static void main(String args[])
    {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // System.out.println(st.peek());
        st.print();
        


    }
}