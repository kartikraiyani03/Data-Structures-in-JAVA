import java.util.*;
 
public class linkedlist
{
    Node head;

    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
  
    public void printList()
    {
      Node p = head;
      while(p != null)
      {
          System.out.print(p.data+" -> ");
          p = p.next;
      }
      System.out.println("NULL");
    }

    public void insertatFirst(int data)
     {
         Node ptr = new Node(data);
        if(head == null )
        {
            head = ptr;
            return;
        }
        ptr.next= head;
        head = ptr;;  
     }

     public void insertatLast(int data)
     {
        Node ptr = new Node(data);
        Node p = head;

        if(head == null )
        {
            head = ptr;
            return;
        }

        while(p.next != null)
        {
            p = p.next;
        }

        p.next= ptr;

     }

     public void deleationatFirst()
     {
        if(head == null)
        {
            System.out.println("LIST IS EMPTY");
        }
        head = head.next;
     }

     public void delationatLast()
     {
        if(head == null)
        {
            System.out.println("LIST IS EMPTY");
        }
        Node p = head;
        Node q = head.next;

        while(q.next != null)
        {
            p = p.next;
            q = q.next;
        }

        p.next = null;
     }

     public Node deleationatIndex(Node head, int index)
     {
        Node p = head;
        Node q = head.next;
        

        if(index <= 0)
        {
            System.out.println("Invalid Index");
        }

        for(int i = 0; i < index-2 ;i++)
        {
            p = p.next;
            q = q.next;
        }

         p.next = q.next;
         return head;

     }



    public void main(String args[])
    {
        linkedlist list = new linkedlist();
        System.out.println("");
        Node head;
        
        list.insertatLast(1);
        list.insertatLast(2);
        list.insertatLast(3);
        list.insertatLast(4);
        list.insertatLast(5);
        
        list.deleationatFirst();
        list.delationatLast();
        
        // list.printList();

        deleationatIndex(head,3);
        System.out.println(list);

    }
}