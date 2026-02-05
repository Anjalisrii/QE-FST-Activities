package demos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class ArrayListTest {

    @Test
    void insertTest() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");

        assertEquals(2, list.size(), "Wrong size");

        list.add("Orange");

        assertEquals(3, list.size(), "Wrong size after insert");

        assertEquals("Apple", list.get(0));
        assertEquals("Banana", list.get(1));
        assertEquals("Orange", list.get(2));
    }

    @Test
    void replaceTest() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");

        assertEquals(2, list.size());

        list.add("Orange");

        assertEquals(3, list.size());

        list.set(1, "Grapes");

        assertEquals("Apple", list.get(0));
        assertEquals("Grapes", list.get(1));
        assertEquals("Orange", list.get(2));
    }
}