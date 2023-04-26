import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    Util.swap(arr, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {4, 1, 5, 2, 6, 3};
        BubbleSort.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
