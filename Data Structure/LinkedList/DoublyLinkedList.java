package DoublyLinkedList;

import java.util.NoSuchElementException;

class Node
{
    int data;
    Node next;
    Node prev;
    int length;

    Node(int data)
    {
        this.data =data;
        this.prev=null;
        this.next=null;
        this.length=0;
    }
    boolean isEmpty()
    {
        return length==0;
    }
    int length()
    {
        return length;
    }

}

class DoublyLinkedlistFunction
{
    Node head=null;
    Node tail=null;
    int counter=0;
    void insertAtStart(int data)
    {
        Node node= new Node(data);
        if(head==null)
        {
           tail=node;
        }
        else
        {
            head.prev=node;
        }
        node.next=head;
        head=node;
        counter++;
    }

    void insertAtEnd(int data)
    {
        Node node = new Node(data);
        if(head==null)
        {
            head=node;
        }
        else
        {
            tail.next=node;
            node.prev=tail;
        }
        tail=node;
        counter++;
    }

    void insertAt(int index,int data) {
        Node n = head;
        Node n2;   //we need 2 node because to connect the futher node to new new node ;
        Node node = new Node(data);
        if (index == 0) {
            insertAtStart(data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;

            }
           n2 = n.next;   //imp step

            node.next = n.next;
            node.prev = n;
            n.next = node;
            n2.prev = node;
        }
    }

    void deleteAtStart()
    {
        try {
            if (head == null) {

            }
        }
        catch(NoSuchElementException e)
        {
            System.out.println(e);
        }
        Node n=head;
        if(head==tail)
        {
            tail=null;
        }
        else
        {
            head.next.prev=null;
        }
            head=head.next;
            n.next=null;




    }
    void deleteAtEnd()
    {
        if(head==null)
        {
            throw new NullPointerException();
        }
        Node n=tail;
        if(head==tail)
        {
            head=null;
        }
        else
        {
            tail.prev.next=null;
        }
        tail=tail.prev;
        n.prev=null;

    }

    void deleteAt()
    {

    }


    void displayForward()
    {
        Node n = head;
        if(head==null)
        {
            return;
        }
        while(n!=null)
            {
                System.out.print(n.data+" - - - >");
                n=n.next;
            }
            System.out.print("null");
    }

    void dispalyBackward()
    {
        Node n=tail;
        if(tail==null)
        {
            return;
        }
        while(n!=null)
        {
            System.out.print(n.data+" - - > ");
            n=n.prev;

        }
        System.out.print("null");
    }

}
public class DoublyLinkedList {
    public static void main(String[] args)
    {
        DoublyLinkedlistFunction DF = new DoublyLinkedlistFunction();


        DF.insertAtStart(15);
        DF.insertAtStart(25);
        DF.insertAtStart(35);
        DF.insertAtEnd(45);
        DF.insertAt(2,65);
        DF.insertAt(0,90);
        DF.displayForward();
        System.out.println();
       // DF.deleteAtStart();
        DF.deleteAtEnd();

        DF.displayForward();

        System.out.println();

        DF.dispalyBackward();
        System.out.println();
    }
}
