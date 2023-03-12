package pila;

import java.util.LinkedList;

public class MyStack<T> {
    LinkedList<T> lista;

    public MyStack() {
        lista = new LinkedList<>();
    }

    public void push(T element) {
        lista.add(element);  // se inserta al final
    }

    public T pop() {
        return lista.remove(lista.size() - 1);
    }

    public T top() {
        return lista.getLast();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }
}
