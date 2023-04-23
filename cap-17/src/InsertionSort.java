import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InsertionSort<T extends Comparable> {
    public void sort(List<T> lista) {
        for (int i = 1; i < lista.size(); i++) {
            T valI = lista.get(i);
            int j = i - 1;
            while(j > 0) {
                T valJ = lista.get(j);

                if (valI.compareTo(valJ) >= 0) {
                    break;
                }

                lista.set(j, valJ);
                j--;
            }

            lista.set(j, valI);
        }
    }

    public static void main(String[] args) {


        List<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(1);
        lista.add(4);
        lista.add(3);
        lista.add(6);

        InsertionSort<Integer> ordenador = new InsertionSort<>();
        ordenador.sort(lista);

        System.out.println(lista);
    }
}
