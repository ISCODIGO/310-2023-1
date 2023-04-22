import java.util.ArrayList;
import java.util.Arrays;

public class Boxing {
    public static void main(String[] args) {
        // Autoboxing
        Object o1 = 10;
        Object o2 = false;
        Object o3 = new int[]{1, 2, 3};

        ArrayList<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("adios");

        Object o4 = lista;

        // Unboxing
        int i1 = (Integer) o1;
        int[] arr = (int[]) o3;

        System.out.println(Arrays.toString(arr));

        ArrayList<String> copiaLista = (ArrayList<String>) o4;
        System.out.println(copiaLista);

    }
}
