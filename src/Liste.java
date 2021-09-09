public class Liste
{
    Node head = null;
    Node tail = null;
    int size;

    public boolean isEmpty()
    {
        if (head == null)
        {
            return true;
        }
        return false;
    }

    public Node insertFromHead(String s)
    {

        Node node = new Node(s);

        if(isEmpty())
        {
            head = node;
            tail = node;
            size++;
            return head;
        }

        head.previous = node;
        node.next = head;

        head = node;
        size++;

        return  head;
    }

    public String printFromHead()
    {
        Node n = head;
        String res = "";

        while(n != null)
        {
            res = res +n.data;
            n = n.next;
        }
        return res;
    }

    public Node insertFromTail(String s)
    {
        Node node = new Node(s);

        if(isEmpty())
        {
            head = node;
            tail = node;
            return tail;
        }

        head.next = node;
        node.previous = tail;

        tail = node;



        return  tail;
    }

    public String printFromTail()
    {
        Node n = tail;
        String res = "";

        while(n != null)
        {
            res = res +n.data;
            n = n.previous;
        }
        return res;
    }

    public String removeFromHead()
    {
        if(isEmpty())
        {
            return "";
        }

        Node n = head;

        n.next.previous = null;
        head = n.next;

        return n.data;
    }

    public String removeFromTail()
    {
        if(isEmpty())
        {
            return "";
        }

        Node n = tail;

        n.previous.next = null;
        tail = n.previous;

        return n.data;
    }


    public Node findNode(String s)
    {
        Node node = head;

        if(isEmpty())
        {
            return node;
        }

        while(node != null)
        {
            if(node.data == s)
            {
                return node;
            }
            node = node.next;
        }

        return node;
    }

    public void removeNode(String s)
    {
        Node node = head;

        if(isEmpty())
        {
            return;
        }

        while(node != null)
        {
            if(node.data == s)
            {
                node.next.previous = null;
                node.previous.next = null;

                node.previous.next = node.next;
                node.next.previous = node.previous;

            }
            node = node.next;
        }
    }

    public void addNode(String s, int number)
    {

        if(isEmpty())
        {
            head = new Node(s);
        }

        else
        {
            if(number == 1)
            {
                insertFromTail(s);
            }
            else
                {

                Node newNode = new Node(s);

                Node ptr = tail;
                Node ptr2 = head;
                int len = 0;

                while (ptr != null)  // get length of list
                {
                    len++;
                    ptr = ptr.previous;
                }

                ptr = tail;  // change ptr back to tail

                if (number > len + 1)  //Secure you can type to large number
                {
                    System.out.println("Placement longer then length of list");
                    System.out.println("number put in the end of list");
                    number = len + 1;
                }

                while ((number--) - 1 > 1)
                {
                    ptr = ptr.previous;
                    ptr2 = ptr2.next;
                }


                    newNode.previous = ptr.previous;
                    ptr.previous = newNode;
                    newNode.next = ptr2.next;
                    ptr2.next = newNode;

            }

        }

    }
}
