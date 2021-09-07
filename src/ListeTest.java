import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest
{

    Liste liste = new Liste();

    @org.junit.jupiter.api.Test
    void insertFromHead()
    {

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
}