// Необходимо получить новый массив из дробных чисел заданного массива, умноженных на два (желательно однострочно). 
// Вместо нечисловых типов заданного массива требуется подставить и вернуть в новом массиве дефолтное значение:
import java.util.Arrays;
import java.util.List;

public class Java_task_3 {
    public static void main(String[] args) {
        String defaultValue = "success";
        List<Object> arr = Arrays.asList(0.5, 2, 3.5, null, null);

        System.out.println(arr);
        System.out.println(defaultValue);
    }
}