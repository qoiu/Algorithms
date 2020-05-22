import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//сложность: O(N^2) or O(N^log(N))?
public class SimpleNumbers {
    public static void main(String... args) {
        List<Integer> arr= new ArrayList<>();
        for (int i = 2; i < 100; i++) {
            boolean isSimple = true;
            for (Integer simple:arr) {
                if (i % simple == 0) isSimple = false;
            }
            if(isSimple)arr.add(i);
        }
        System.out.println(Arrays.toString(arr.toArray()));
    }
}
