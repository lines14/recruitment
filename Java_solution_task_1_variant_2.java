import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java_solution_task_1_variant_2 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 9, 15, 30, 45);

        List<Integer> newArr = arr.stream()
                                    .filter(elem -> elem % 2 == 0)
                                    .map(elem -> elem * 2)
                                    .collect(Collectors.toList());

        System.out.println(newArr);
    }
}