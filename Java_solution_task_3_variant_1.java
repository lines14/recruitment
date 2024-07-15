import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java_solution_task_3_variant_1 {
    public static void main(String[] args) {
        String defaultValue = "success";
        List<Object> arr = Arrays.asList(0.5, 2, 3.5, null, null);

        List<Object> newArr = new ArrayList<>();
        for (Object elem : arr) {
            if (elem == null) {
                newArr.add(defaultValue);
            } else if (elem instanceof Double && ((Double) elem) % 1 != 0) {
                Double doubleElem = (Double) elem * 2;
                newArr.add(doubleElem.intValue());
            }
        }

        System.out.println(newArr);
    }
}