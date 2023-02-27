import lab01.tdd.CircularList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
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
        for (int i = 0; i < nElements; i++) {
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

    

}
