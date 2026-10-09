import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>("salam");
        System.out.println(box.getValue());
        System.out.println(box.isEmpty());

        Pair<String, Integer> pair = new Pair<>("yaş", 20);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
        System.out.println(pair);

        List<Integer> sum = Arrays.asList(1, 2, 3, 4);
        System.out.println(Swap.sum(sum));

        List<Integer> add = new ArrayList<>();
        Swap.addNumber(add, 10);
        System.out.println(add);
    }
}