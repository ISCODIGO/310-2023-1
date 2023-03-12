import com.allendowney.thinkdast.MyArrayList;
import com.allendowney.thinkdast.MyLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new MyArrayList<>();
        List<Integer> linkedlist = new MyLinkedList<>();

        fill(arrayList, 10, 20);
        fill(linkedlist, 21, 30);

        System.out.println(arrayList);
        System.out.println(linkedlist);
    }

    public static void fill(List<Integer> lista, int valorInicial, int valorFinal) {
        if (lista == null) {
            throw new NullPointerException();
        }

        for (int i = valorInicial; i <= valorFinal; i++) {
            lista.add(i);
        }
    }
}