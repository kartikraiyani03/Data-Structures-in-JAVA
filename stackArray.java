import java.util.*;
 
public class stackArray
{
    static class Stack
    {
        static ArrayList<Integer> arr = new ArrayList<Integer>();

        public static boolean isEmpty()
        {
            if(arr.get(arr.size()-1) == 0)
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
            arr.add(data);
        }
        
        public static int pop()
        {
            if(isEmpty())
            {
                return 0;
            }
            else
            {
                int top = arr.get(arr.size()-1);
                arr.remove(arr.size()-1);
                return top;
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
                return arr.get(arr.size()-1);
            }
        }

        public static void print()
        {
            while(!isEmpty())
            {
                System.out.println(peek());
                pop();
            }
        }

    }
    public static void main(String args[])
    {
        Stack st = new Stack();

        st.push(1);
        st.push(2);
        st.pop();
        st.push(3);
        st.push(4);
        st.push(5);

        st.print();
        System.out.println("");
        st.print();
    }
}