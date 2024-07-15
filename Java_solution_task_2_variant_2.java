import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java_solution_task_2_variant_2 {
    public static void main(String[] args) {
        List<Object> arr = Arrays.asList(2, 9, 15, 30, "success");

        List<Object> newArr = arr.stream()
                                    .map(elem -> { if (elem instanceof Integer && (Integer) elem % 2 != 0) { return (Integer) elem / 3.0; } return elem; })
                                    .filter(elem -> !(elem instanceof Integer && (Integer) elem % 2 == 0))
                                    .map(elem -> { if (elem instanceof Double) { Double doubleElem = (Double) elem; return doubleElem.intValue(); } return elem; })
                                    .collect(Collectors.toList());

        System.out.println(newArr);
    }
}