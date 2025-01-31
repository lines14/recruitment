import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java_solution_task_3_variant_2 {
    public static void main(String[] args) {
        String defaultValue = "success";
        List<Object> arr = Arrays.asList(0.5, 2, 3.5, null, null);

        List<Object> newArr = arr.stream()
                                    .map(elem -> elem == null ? defaultValue : elem)
                                    .filter(elem -> !(elem instanceof Integer))
                                    .map(elem -> elem instanceof Double && ((Double) elem) % 1 != 0 ? ((Double) elem) * 2 : elem)
                                    .map(elem -> elem instanceof Double ? ((Double) elem).intValue() : elem)
                                    .collect(Collectors.toList());

        System.out.println(newArr);
    }
}