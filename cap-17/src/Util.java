public class Util {
    public static void swap(int[] arr, int x, int y) {
        int aux = arr[x];
        arr[x] = arr[y];
        arr[y] = aux;
    }
}
