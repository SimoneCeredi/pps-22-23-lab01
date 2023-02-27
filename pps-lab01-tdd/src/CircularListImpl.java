import lab01.tdd.CircularList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList {

    private final List<Integer> list = new ArrayList<>();
    private final Iterator<Integer> iterator = list.iterator();
    private int index = -1;

    private void setIndex(int index) {
        if (this.list.isEmpty()) {
            return;
        }
        this.index = index == -1 ? this.list.size() - 1 : index % this.list.size();
    }

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
    public Optional<Integer> next() {
        setIndex(++this.index);
        return this.list.isEmpty() ? Optional.empty() : Optional.of(this.list.get(this.index));
    }

    @Override
    public Optional<Integer> previous() {
        return Optional.empty();
    }

    @Override
    public void reset() {

    }
}
