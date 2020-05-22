import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleNumbers {
    public static void main(String... args) {
        List<Integer> arr= new ArrayList<>();
        for (int i = 2; i < 100; i++) {
            boolean isSimple = true;
            for (int a = 2; a < i; a++) {
                if (i % a == 0 && a!=i) isSimple = false;
            }
            if(isSimple)arr.add(i);
        }
        System.out.println(Arrays.toString(arr.toArray()));
    }
}
