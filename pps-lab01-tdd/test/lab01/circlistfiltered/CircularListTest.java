package lab01.circlistfiltered;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularListTest {

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
    void testCanAddElements() {
        this.addElements(3);
        assertEquals(3, this.circularList.size());
    }
}