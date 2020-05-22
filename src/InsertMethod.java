import java.util.Arrays;
import java.util.Random;


//сложность: O(N^2)
public class InsertMethod {
    public static void main(String... args) {
        int[] array = randArray(20, 40);
        System.out.println(Arrays.toString(array));
        array = sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] randArray(int size, int maximum) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            Random rn = new Random();
            array[i] = rn.nextInt(maximum);
        }
        return array;
    }

    private static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int j = i;
                int value = arr[i];
                while (j > 0 && arr[j - 1] > value ) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = value;
            }
        }
        return arr;
    }
}
