package lab01.circlistfiltered;

import java.util.Optional;
import java.util.function.Predicate;

public interface CircularList {
    /**
     * Checks if the list is empty
     *
     * @return true if the list is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Provides the current size of the list
     *
     * @return the size of the list
     */
    int size();

    /**
     * Adds an element to the list, namely, after the last inserted one.
     *
     * @param element the element to be added to the list
     */
    void add(int element);

    /**
     * Finds and returns the next element that satisfies a given condition
     * @param condition the filtering condition
     * @return the next element that satisfies a given condition or an empty optional
     */
    Optional<Integer> filteredNext(Predicate<Integer> condition);


}
