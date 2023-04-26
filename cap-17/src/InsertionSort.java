import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertionSort {
    private static int iteraciones = 0;

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int c = i;
            int candidato = arr[c];
            for (int j = i - 1; j >= 0; j--) {
                int previo = arr[j];
                if (candidato < previo) {
                    Util.swap(arr, c, j);  // intercambio de elementos
                    c = j;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {4, 3, 10, 2, 1, 7, 5};
        InsertionSort.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
