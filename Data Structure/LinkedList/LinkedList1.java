
class Node
{
    int data;
    Node next;
    Node(){}
    Node(int d)
    {
        data = d;
        next=null;
    }

}


class LinkedList
{
        Node head;
    void insert(int data)   //insert at end by default
    {
        Node node = new Node(data);

        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }


    void insertAtStart(int data)
    {
        Node node = new Node(data);
        node.next=head;
        head=node;


    }

    void insertAt(int index, int data) {
        Node node = new Node(data);

        if (index == 0) {
            insertAtStart(data);
        } else {


            Node n = head;

            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }


    void deleteAt(int index)
    {
        if(index == 0)
        {
            head=head.next;
        }
        else
        {
            Node n = head;
            Node n1 = null;
            for(int i=0; i<index-1;i++)
            {
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
            System.out.println("n1 is deleted "+n1.data);
            n1=null;
        }

    }
     public int countNode()
     {
         int count=0;
         Node n = head;
        while(n.next!=null)
        {
            count++;
            n=n.next;
        }
        count++;
        return count;
     }

     void display()
    {

        Node n=head;
        while(n.next!=null)
        {
            System.out.println("Node "+n.data);
            n=n.next;
        }
        System.out.println("Node " +n.data);

    }
}

class LinkedList1
{

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insertAtStart(12);
        list.insertAt(0,4);
        list.insert(5);
        list.display();
        System.out.println();
        list.deleteAt(3);
        list.display();
       // System.out.println();
        System.out.println("Number of nodes are "+list.countNode());


    }
}
