public class Liste
{
    Node head = null;
    Node tail = null;

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
            return head;
        }

        head.previous = node;
        node.next = head;

        head = node;

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
}
