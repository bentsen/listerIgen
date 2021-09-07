import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest
{

    Liste liste = new Liste();

    @org.junit.jupiter.api.Test
    void insertFromHead()
    {
        assertEquals("1", liste.insertFromHead("1").data);
    }

    @Test
    void isEmpty()
    {
        assertEquals(true,liste.isEmpty());
        liste.insertFromHead("Viktor");
        assertEquals(false,liste.isEmpty());
    }

    @Test
    void printListFromHead()
    {
        liste.insertFromHead("1");
        liste.insertFromHead("2");
        liste.insertFromHead("3");

        assertEquals("321",liste.printFromHead());
    }

    @Test
    void insertFromTail()
    {
        assertEquals("1", liste.insertFromTail("1").data);
    }

    @Test
    void printListFromTail()
    {
        liste.insertFromTail("1");
        liste.insertFromTail("2");
        liste.insertFromTail("3");

        assertEquals("123",liste.printFromTail());
    }

    @Test
    void removeFromHead()
    {
        liste.insertFromHead("1");
        liste.insertFromHead("2");
        liste.insertFromHead("3");

        assertEquals("3",liste.removeFromHead());
        assertEquals("21",liste.printFromHead());
    }

    @Test
    void removeFromTail()
    {
        liste.insertFromHead("1");
        liste.insertFromHead("2");
        liste.insertFromHead("3");

        assertEquals("1",liste.removeFromTail());
        assertEquals("23",liste.printFromTail());
    }
}