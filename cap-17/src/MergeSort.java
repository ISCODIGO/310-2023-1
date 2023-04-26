import java.util.Arrays;

public class MergeSort {

    private static void divide(int[] arr) {
        if (arr.length < 2) return;  // Caso base: cuando el arreglo esta vacio o solo hay un elemento

        int mid = arr.length / 2;                   // posicion de la mitad del array
        int[] arr1 = new int[mid];                  // arreglo a la izquierda
        int[] arr2 = new int[arr.length - mid];     // arreglo a la derecha

        // Llena los elementos del arreglo a la izquierda
        for (int i = 0; i < mid; i++) {
            arr1[i] = arr[i];
        }

        // Llena los elementos del arreglo a la derecha
        for (int j = mid; j < arr.length; j++) {
            arr2[j - mid] = arr[j];
        }

        // Esta parte sirve para mostrar las particiones de cada arreglo
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("----------------------");

        // Caso recursivo
        divide(arr1);
        divide(arr2);

        // Unir las particiones
        unir(arr, arr1, arr2);
    }

    private static void unir(int[] arr, int[] leftArr, int[] rightArr) {
        int i = 0;  // posicion de leftArr
        int j = 0;  // posicion de rightArr
        int k = 0;  // posicion de arr

        // Hacer el ordenamiento a igual cantidad de elementos a la derecha e izquierda
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // Inserta el resto de la izquierda (no orden)
        while (i < leftArr.length) {
            arr[k++] = leftArr[i++];
        }

        // Inserta el resto de la derecha (no orden)
        while (j < rightArr.length) {
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

/*

N=7
m=3
{4, 3, 10, 2, 1, 7, 5}
{4, 3, 10, 2} / {1, 7, 5}


 */