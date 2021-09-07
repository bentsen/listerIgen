import static org.junit.jupiter.api.Assertions.*;

class ListeTest
{

    Liste liste = new Liste();

    @org.junit.jupiter.api.Test
    void insertFromHead()
    {
        Node node = new Node("2");
        Node node1 = new Node("3");

        assertEquals("1",liste.insertFromHead(new Node("1")).data);
        assertEquals("2",liste.insertFromHead(node).data);
        assertEquals("3",liste.insertFromHead(node1).data);
    }
}