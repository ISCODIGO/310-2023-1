package tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Clase para generar un arbol binario general
 * @param <T> tipo generico
 */
public class BinaryTree<T> {
    /**
     * Clase que determina el nodo del arbol
     * @param <T> nodo
     */
    public static class Node<T> {
        private T element;

        private Node<T> left;

        private Node<T> right;

        private Node(T e) {
            element = e;
            left = null;
            right = null;
        }

        /**
         * Devuelve el nodo hijo a la izquierdo
         * @return Nodo izquierdo
         */
        public Node<T> left() {
            return this.left;
        }

        /**
         * Devuelve el nodo hijo a la derecho
         * @return Nodo derecho
         */
        public Node<T> right() {
            return this.right;
        }

        /**
         * Devuelve el dato del nodo
         * @return dato del nodo
         */
        public T element() {
            return this.element;
        }

        /**
         * Determina si el nodo es hoja
         * @return true si no tiene ambos hijos
         */
        public boolean isLeaf() {
            return (this.left == null && this.right == null);
        }

        @Override
        public String toString() {
            return element.toString();
        }
    }

    /**
     * Nodo raiz
     */
    private Node<T> root;

    /**
     * Determinar si un arbol tiene al menos un nodo
     * @return true si no tiene nodos
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Devuelve el nodo raiz
     * @return nodo raiz
     */
    public Node<T> root() {
        return root;
    }

    /**
     * Agregar un nodo utilizando uno ya existente dentro del arbol. Si los espacios estan ocupados no se inserta.
     * @param parent nodo padre
     * @param element dato del nodo hijo
     * @return nodo insertado
     */
    public Node<T> add(Node<T> parent, T element) {
        Node<T> newNode = new Node<>(element);

        // si el arbol esta vacia crea el nodo raiz
        if (isEmpty()) {
            root = newNode;
        }
        // segundo intento: insertar por la izquierda
        else if (parent.left == null) {
            parent.left = newNode;
        }
        // tercer intento: insertar por la derecha
        else if (parent.right == null) {
            parent.right = newNode;
        }
        // en caso que no pueda insertar genera una excepcion
        else {
            return parent;
        }

        return newNode;
    }

    /**
     * Recorrido por profundidad utilizando preorden
     */
    public void dfsPreorder() {
        dfsPreorder(root);
    }

    private void dfsPreorder(Node<T> node) {
        if(node != null) {
            System.out.println(node);  // paso 1
            dfsPreorder(node.left);  // paso 2
            dfsPreorder(node.right);  // paso 3
        }
    }

    /**
     * Recorrido por anchura
     */
    public void bfsTraversal() {
        if (root == null) {
            return;
        }

        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node<T> node = queue.poll();
            System.out.println(node.element);

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    /**
     * Devuelve el array de nodos del arbol obtenidos a traves del recorrido preorden
     * @return array de los nodos
     */
    public T[] toArray() {
        List<T> list = new ArrayList<>();
        insertListPreorder(list, root);

        T[] arr = (T[]) Array.newInstance(root.element.getClass(), list.size());  // generar un array generico
        return list.toArray(arr);
    }

    private void insertListPreorder(List<T> list, Node<T> n) {
        if (n != null) {
            list.add(n.element);
            insertListPreorder(list, n.left);
            insertListPreorder(list, n.right);
        }
    }

    /**
     * Conteo de todos los nodos del arbol de forma recursiva
     * @return cantidad de nodos del arbol
     */
    public int size() {
        return size(root);
    }

    private int size(Node<T> n) {
        if (n == null) return 0;
        return 1 + size(n.left) + size(n.right);
    }

    /**
     * Impresion de los nodos del arbol binario, incluyendo los hijos de cada nodo.
     */
    public void print() {
        print(root);
    }
    private void print(Node<T> n) {
        // solo imprimir los nodos que no son hoja (salvo que root sea hoja)
        if (n != null && (n == this.root || !n.isLeaf())) {
            System.out.printf("%s [left:%s, right:%s]%n", n, n.left, n.right);
            print(n.left);
            print(n.right);
        }
    }
}
