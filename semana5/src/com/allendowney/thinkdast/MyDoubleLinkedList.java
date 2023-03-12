package com.allendowney.thinkdast;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyDoubleLinkedList<E> implements List<E> {
    class Node<E> {
        E data;
        Node prev;
        Node next;

        public Node(E data, Node<E> prev, Node<E> next) {
            this.data =data;
            this.prev = prev;
            this.next = next;
        }
    }

    int size;  // cuantos elementos hay
    Node head;  // referencia al primer nodo
    Node tail;  // referencia al ultimo nodo

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        var newNode = new Node<>(e, null, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index == -1) {
            return false;
        }
        remove(index);
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        // remover el
        E data;

        if (index == 0) {
            data = (E)head.data;
            head = head.next;
            head.prev = null;
        } else if (index < size - 1) {
            Node<E> actual = getNode(index);
            data = (E)actual.data;
            Node<E> previo = actual.prev;
            Node<E> sig = actual.next;
            previo.next = sig;
            sig.prev = previo;
        } else {
            data = (E)tail.data;
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return data;
    }

    public Node<E> getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> aux = null;

        if (index <= size / 2) {
            aux = head;
            for(int i = 0; i < index; i++) {
                aux = aux.next;
            }
        } else {
            aux = tail;
            for(int i = size - 1; i > index; i--) {
                aux = aux.prev;
            }
        }
        return aux;
    }

    @Override
    public int indexOf(Object o) {
        Node<E> aux = head;
        for (int i = 0; i < size; i++) {
            if (aux.data.equals(o)){
                return i;
            }
            aux = aux.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");

        Node aux = head;
        for(int i = 0; i < size; i++) {
            if (i == 0) {
                s.append(aux.data);
            } else {
                s.append(", " + aux.data);
            }
            aux = aux.next;
        }
        s.append("]");
        return s.toString();
    }

    public static void main(String[] args) {
        var dll = new MyDoubleLinkedList<Integer>();
        dll.add(10);
        dll.add(20);
        dll.add(30);
        System.out.println(dll);
        System.out.println(dll.size);
        dll.remove(1);
        Integer valor = 30;
        dll.remove(valor);
        System.out.println(dll);
        System.out.println(dll.size);
    }
}
