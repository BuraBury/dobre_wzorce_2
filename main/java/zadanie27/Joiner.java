package zadanie27;

public class Joiner<T> {
    private String separator = "-";

    void join(int i, T t) {
        for (int j = 1; j <= i; j++) {
            add(t);
            if (j == i - 1) {
                setSeparatorForLastElement();
            }
        }
    }

    private void add(T t) {
        System.out.print(t + separator);
    }

    private void setSeparatorForLastElement() {
        this.separator = ". ";
    }
}
