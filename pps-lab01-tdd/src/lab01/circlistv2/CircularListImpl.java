package lab01.circlistv2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CircularListImpl implements CircularList {

    private List<Integer> list = new LinkedList<>();

    @Override
    public void add(int element) {
        this.list.add(element);
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public Iterator<Integer> forwardIterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return list.size() != 0;
            }

            @Override
            public Integer next() {
                if(!this.hasNext()) {
                    throw new IllegalStateException();
                }
                return list.get(index++ % list.size());
            }
        };
    }

    @Override
    public Iterator<Integer> previousIterator() {
        return null;
    }

}
