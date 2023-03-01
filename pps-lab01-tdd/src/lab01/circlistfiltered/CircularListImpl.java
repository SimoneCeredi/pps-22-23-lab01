package lab01.circlistfiltered;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class CircularListImpl implements CircularList {

    private List<Integer> list = new LinkedList<>();
    private int lastPosition;

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

    @Override
    public Optional<Integer> filteredNext(Predicate<Integer> condition) {
        Optional<Integer> ret = this.list.subList(lastPosition, this.list.size()).stream()
                .peek((element) -> this.lastPosition++).filter(condition).findFirst();
        if (ret.isPresent()) {
            return ret;
        }
        int lastItemToCheck = this.lastPosition;
        this.lastPosition = 0;
        return this.list.subList(this.lastPosition, lastItemToCheck).stream()
                .peek((element) -> this.lastPosition++).filter(condition).findFirst();
    }
}
