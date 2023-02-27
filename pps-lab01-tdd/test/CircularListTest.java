import lab01.tdd.CircularList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    private CircularList circularList;

    //TODO: test implementation
    @BeforeEach
    void beforeEach(){
        this.circularList = new CircularListImpl();
    }

    private void addElements(int nElements) {
        for (int i = 1; i <= nElements; i++) {
            this.circularList.add(i);
        }
    }

    @Test
    void testIsNewListEmpty() {
        assertTrue(this.circularList.isEmpty());
    }

    @Test
    void testCanAddElements() {
        this.addElements(3);
        assertEquals(3, this.circularList.size());
    }

    @Test
    void testEmptyListNextReturnsNothing() {
        assertEquals(Optional.empty(), this.circularList.next());
    }

    @Test
    void testCanGetFirstElement() {
        this.addElements(3);
        assertEquals(1, this.circularList.next().get());
    }

    @Test
    void testListReturnsToFirst() {
        this.addElements(2);
        this.circularList.next();
        assertEquals(2, this.circularList.next().get());
        assertEquals(1, this.circularList.next().get());

    }

    @Test
    void testEmptyListPreviousReturnsNothing() {
        assertEquals(Optional.empty(), this.circularList.previous());
    }

    @Test
    void testListBackwordsCircular() {
        this.addElements(2);
        assertEquals(2, this.circularList.previous().get());
        assertEquals(1, this.circularList.previous().get());
        assertEquals(2, this.circularList.previous().get());
    }

    @Test
    void testReset() {
        this.addElements(2);
        this.circularList.next();
        this.circularList.next();
        this.circularList.reset();
        assertEquals(1, this.circularList.next().get());
    }

}
