package zadanie29;

import java.util.Collection;
import java.util.function.Predicate;


public class CollectionsConditionTester {

    public <T> double partOf(Collection<T> collection, Predicate<T> predicate) {
        long count =
                collection.stream()
                        .filter(predicate)
                        .count();
        return 100.0 * count / collection.size();
    }
}
