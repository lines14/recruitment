import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java_solution_task_2_variant_1 {
    public static void main(String[] args) {
        List<Object> arr = Arrays.asList(2, 9, 15, 30, "success");

        List<Object> newArr = new ArrayList<>();
        for (Object elem : arr) {
            if (!(elem instanceof Integer)) {
                newArr.add(elem);
            } else if ((Integer) elem % 2 != 0) {
                Double doubleElem = (Integer) elem / 3.0;
                newArr.add(doubleElem.intValue());
            }
        }

        System.out.println(newArr);
    }
}