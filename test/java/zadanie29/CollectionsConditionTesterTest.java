package zadanie29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsConditionTesterTest {

    @Test
    void testEvenNumber() {
        CollectionsConditionTester tester = new CollectionsConditionTester();

        double percentage = tester.partOf(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), integer -> integer % 2 == 0);
        Assertions.assertEquals(50.0, percentage);
    }
}