import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InsertionSort {
    static int iteraciones = 0;
    public static <T extends Comparable<T>> void sorting(List<T> list) {
        for (int i = 1; i < list.size(); i++) {
            T currentElement = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j).compareTo(currentElement) > 0) {
                iteraciones++;
                list.set(j + 1, list.get(j));
                j--;
            }
            iteraciones++;
            list.set(j + 1, currentElement);
        }
    }



    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(6);
        lista.add(4);
        lista.add(3);
        lista.add(2);
        lista.add(1);

        InsertionSort.sorting(lista);
        System.out.println(lista);
        System.out.printf("Para un n=%d hay %d iteraciones", lista.size(), iteraciones);
    }
}
