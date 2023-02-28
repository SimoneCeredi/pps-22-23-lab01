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

    @Test
    void testListIsEmpty() {
        assertTrue(this.circularList.isEmpty());
    }
}