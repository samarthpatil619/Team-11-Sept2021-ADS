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
            void search(int key)
            {
                Node n = head;
                while(n.next!=null)
                {
                    if(n.data==key)
                    {
                        System.out.println("Element is present");
                    }
                    n=n.next;
                }
                System.out.println("Element is not present");
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

     public Node reverse()
     {
         if (head == null)
         {
             return head;
         }

             Node current = head;
             Node previous = null;
             Node next = null;
             while (current != null) {
                 next = current.next;
                 current.next = previous;
                 previous = current;
                 current = next;
             }

         return previous;
     }



     void display(Node list)
    {

        Node n=list;
        while(n.next!=null)
        {
            System.out.print(n.data+" - - > ");
            n=n.next;
        }
        System.out.println(n.data);

    }
    void reversedisplay(Node reverse)
    {

        Node n=reverse;
        while(n.next!=null)
        {
            System.out.print(n.data+" - - > ");
            n=n.next;
        }
        System.out.println(n.data);

    }


}

class Main
{

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insert(10);
        System.out.println("List in order ");
        list.display(list.head);
        System.out.println("List in reverse ");
        list.display(list.reverse());




    }
}