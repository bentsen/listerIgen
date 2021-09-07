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
}