package lab01.circlistv2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class CircularListTest {

    private CircularList circularList;
    @BeforeEach
    void setUp() {
        this.circularList = new CircularListImpl();
    }

    private void addElements(int nElements) {
        for (int i = 1; i <= nElements; i++) {
            this.circularList.add(i);
        }
    }


    @Test
    void testListIsEmpty() {
        assertTrue(this.circularList.isEmpty());
    }

    @Test
    void testAddElement() {
        addElements(2);
        Iterator<Integer> iterator = this.circularList.forwardIterator();
        assertEquals(1, iterator.next());
        assertEquals(2, iterator.next());
        assertEquals(1, iterator.next());
    }

    @Test
    void testForwardIteratorOnEmptyList() {
        Iterator<Integer> iterator = this.circularList.forwardIterator();
        assertThrows(IllegalStateException.class, () -> iterator.next());
    }
}