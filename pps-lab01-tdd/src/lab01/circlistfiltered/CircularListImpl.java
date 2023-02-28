package lab01.circlistfiltered;

import java.util.LinkedList;
import java.util.List;

public class CircularListImpl implements CircularList {

    private List<Integer> list = new LinkedList<>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
