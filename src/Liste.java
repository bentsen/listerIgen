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

}
