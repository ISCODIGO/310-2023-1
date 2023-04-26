import java.util.Arrays;

public class MergeSort {

    private static void divide(int[] arr) {
        if (arr.length < 2) return;  // Caso base: cuando el arreglo esta vacio o solo hay un elemento

        int mid = arr.length / 2;
        int[] arr1 = new int[mid];
        int[] arr2 = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            arr1[i] = arr[i];
        }

        for (int j = mid; j < arr.length; j++) {
            arr2[j - mid] = arr[j];
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("----------------------");

        divide(arr1);
        divide(arr2);
        unir(arr, arr1, arr2, mid, arr.length - mid);
    }

    private static void unir(int[] arr, int[] leftArr, int[] rightArr, int leftIndex, int rightIndex) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftIndex && j < rightIndex) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < leftIndex) {
            arr[k++] = leftArr[i++];
        }

        while (j < rightIndex) {
            arr[k++] = rightArr[j++];
        }
    }

    public static void main(String[] args) {
        int[] numeros = {4, 3, 10, 2, 1, 7, 5};
        MergeSort.divide(numeros);
        System.out.println("Resultado final: ");
        System.out.println(Arrays.toString(numeros));
    }
}

// 0 1 2 3 | 4 5 6 7

