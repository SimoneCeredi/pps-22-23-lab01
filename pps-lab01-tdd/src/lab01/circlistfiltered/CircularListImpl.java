package lab01.circlistfiltered;

import java.util.LinkedList;
import java.util.List;

public class CircularListImpl implements CircularList {

    private List<Integer> list = new LinkedList<>();
    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public void add(int element) {
        this.list.add(element);
    }
}
