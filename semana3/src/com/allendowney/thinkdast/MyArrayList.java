package com.allendowney.thinkdast;

import java.util.*;

/**
 * @param <T>
 * @author downey
 */
public class MyArrayList<T> implements List<T> {
    int size;                    // keeps track of the number of elements
    T[] array;           // stores the elements
    public final int INITIAL_CAPACITY = 3;

    /**
     *
     */
    @SuppressWarnings("unchecked")
    public MyArrayList() {
        // You can't instantiate an array of T[], but you can instantiate an
        // array of Object and then typecast it.  Details at
        // http://www.ibm.com/developerworks/java/library/j-jtp01255/index.html
        array = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    /**
     * @param element
     */
    @Override
    public boolean add(T element) {
        if (size == this.array.length) {  // el array esta lleno
            grow();  // O(n)
        }
        this.array[this.size++] = element;
        return true;
    } // O(1*)

    private void grow() {
        T[] newArray = (T[]) new Object[this.array.length * 2];
        // copiar al nuevo array, el viejo array elemento por elemento (LENTO!!!)
        System.arraycopy(this.array, 0, newArray, 0, this.array.length);
        // ahora el nuevo arreglo es el original
        this.array = newArray;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        // add the element to get the resizing
        add(element);

        // shift the elements
        for (int i = size - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        // put the new one in the right place
        array[index] = element;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        boolean flag = true;
        for (T element : collection) {
            flag &= add(element);
        }
        return flag;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        // note: this version does not actually null out the references
        // in the array, so it might delay garbage collection.
        size = 0;
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        for (Object element : collection) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public int indexOf(Object target) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Checks whether an element of the array is the target.
     * <p>
     * Handles the special case that the target is null.
     *
     * @param target
     * @param element
     */
    private boolean equals(Object target, T element) {
        if (target == null) {
            return element == null;
        } else {
            return target.equals(element);
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<T> iterator() {
        // make a copy of the array
        T[] copy = Arrays.copyOf(array, size);
        // make a list and return an iterator
        return Arrays.asList(copy).iterator();
    }

    @Override
    public int lastIndexOf(Object target) {
        // see notes on indexOf
        for (int i = size - 1; i >= 0; i--) {
            if (equals(target, array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        // make a copy of the array
        T[] copy = Arrays.copyOf(array, size);
        // make a list and return an iterator
        return Arrays.asList(copy).listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        // make a copy of the array
        T[] copy = Arrays.copyOf(array, size);
        // make a list and return an iterator
        return Arrays.asList(copy).listIterator(index);
    }

    @Override
    public boolean remove(Object obj) {
        int index = indexOf(obj);
        if (index == -1) {
            return false;
        }
        remove(index);
        return true;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (size < this.array.length / 4) {
            reduce();
        }

        T element = this.array[index];

        for (int i = index; i < size - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.size--;
        return element;
    }

    private void reduce() {
        T[] newArray = (T[]) new Object[this.array.length / 2];
        System.arraycopy(this.array, 0, newArray, 0, newArray.length);
        // ahora el nuevo arreglo es el original
        this.array = newArray;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        // collection.size es otro tamaño del problema -> m
        boolean flag = true;
        for (Object obj : collection) {
            flag &= remove(obj);  //  O(n), n -> array.length
        }
        return flag;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        T old = this.array[index];
        this.array[index] = element;
        return old;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex >= size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        T[] copy = Arrays.copyOfRange(array, fromIndex, toIndex);
        return Arrays.asList(copy);
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(array, size);
    }

    @Override
    public <U> U[] toArray(U[] array) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return Arrays.toString(this.toArray());
    }

        public static void main(String[] args) {
            // run a few simple tests
            MyArrayList<Character> mal = new MyArrayList<Character>();
            mal.add('o');
            mal.add(0, 'h');
            mal.add(1, 'l');
            mal.add(2, 'a');
        }
    }
