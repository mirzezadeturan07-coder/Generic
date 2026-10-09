import java.util.List;

public class Swap {
    public static  <T> void swap(T[] array, int i, int j) {
        T v = array[i];
        array[i] = array[j];
        array[j] = v;
    }

    public static double sum(List<? extends Number> list) {
        double total = 0;
        for (Number n : list) {
            total += n.doubleValue();
        }
        return total;
    }

    public static void addNumber(List<Integer> list, int n) {
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
    }
}
