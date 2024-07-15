import java.util.ArrayList;
import java.util.List;

public class Java_solution_task_1_variant_1 {
    public static void main(String[] args) {
        int[] arr = {2, 9, 15, 30, 45};
        List<Integer> newArr = new ArrayList<>();
        for (int elem : arr) {
            if (elem % 2 == 0) {
                newArr.add(elem * 2);
            }
        }

        System.out.println(newArr);
    }
}