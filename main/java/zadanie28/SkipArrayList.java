package zadanie28;

import java.util.ArrayList;
import java.util.List;

public class SkipArrayList<T> extends ArrayList<T> {

    public List<T> getEveryNthElement(int startIndex, int skip) {
        List<T> modifiedList = new ArrayList<>();
        int currentIndex = startIndex;
        while (currentIndex < size()) {
            modifiedList.add(get(currentIndex));
            currentIndex += skip++;
        }


        return modifiedList;
    }

}
