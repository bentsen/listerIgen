import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest
{

    Liste liste = new Liste();

    @org.junit.jupiter.api.Test
    void insertFromHead()
    {
        assertEquals("1",liste.insertFromHead("1"));
        assertEquals("2",liste.insertFromHead("2"));
        assertEquals("3",liste.insertFromHead("3"));
    }

    @Test
    void isEmpty()
    {
        assertEquals(true,liste.isEmpty());
        liste.insertFromHead("Viktor");
        assertEquals(false,liste.isEmpty());
    }
}