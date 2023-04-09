package tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Clase para generar arboles binarios de busqueda
 * @param <T> tipo generico
 */
public class BinarySearchTree<T extends Comparable<T>> {
    /**
     * Clase que define los nodos
     * @param <T> tipo generico
     */
    protected static class Node<T> {
        /**
         * Dato del nodo
         */
        T element;

        /**
         * Referencia al nodo hijo izquierdo
         */
        Node<T> left;

        /**
         * Referencia al nodo hijo derecho
         */
        Node<T> right;

        public Node(T e) {
            element = e;
            left = null;
            right = null;
        }

        protected boolean isLeaf() {
           return  (this.left == null && this.right == null);
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
     * Constructor
     */
    public BinarySearchTree() {
        root = null;
    }

    /**
     * Agrega un elemento segun su valor: si es menor que la raiz se ubica en el subarbol izquierdo, si es mayor en el derecho.
     * @param element dato del nodo
     */
    public void add(T element) {
        root = addRecursive(root, element);
    }

    private Node<T> addRecursive(Node<T> parent, T element)  {
        if (parent == null) {
            return new Node<>(element);
        }

        if (element.compareTo(parent.element) < 0) {
            parent.left = addRecursive(parent.left, element);
        } else if (element.compareTo(parent.element) > 0) {
            parent.right = addRecursive(parent.right, element);
        }

        return parent;
    }

    /**
     * Remueve el nodo que contiene el elemento
     * @param element dato del nodo
     */
    public void remove(T element) {
        root = removeRecursive(root, element);
    }

    private Node<T> removeRecursive(Node<T> node, T element) {
        // caso base
        if (node == null) {
            return null;
        }

        // busca a la izquierda
        if (element.compareTo(node.element) < 0) {
            node.left = removeRecursive(node.left, element);
        }
        // busca a la derecha
        else if (element.compareTo(node.element) > 0) {
            node.right = removeRecursive(node.right, element);
        }
        // se ha encontrado el nodo
        else {
            // caso 1: nodo hoja
            if (node.isLeaf()) {
                return null;
            }
            // caso 2-l: un hijo a la izquierda
            else if (node.left != null && node.right == null) {
                return node.left;
            }
            // caso 2-r: un hijo a la derecha
            else if (node.left == null && node.right != null) {
                return node.right;
            }
            // case 3: dos hijos
            else {
                // hallar el menor valor a la derecha
                Node<T> minRight = findMin(node.right);
                // reemplazar el valor del nodo con el del menor valor a la derecha
                node.element = minRight.element;
                // remover nodo con el menor valor a la derecha
                node.right = removeRecursive(node.right, minRight.element);
            }
        }

        return node;
    }

    private Node<T> findMin(Node<T> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    /**
     * Busca si un elemento esta en el arbol
     * @param element dato del nodo
     * @return true si se encontro el valor
     */
    public boolean contains(T element) {
        return containsNodeRecursive(root, element);
    }

    private boolean containsNodeRecursive(Node<T> current, T element) {
        if (current == null) {
            return false;
        }
        if (element == current.element) {
            return true;
        }
        return element.compareTo(current.element) < 0
                ? containsNodeRecursive(current.left, element)
                : containsNodeRecursive(current.right, element);
    }

    /**
     * Impresion de los nodos del arbol binario, incluyendo los hijos de cada nodo.
     */
    public void print() {
        printPreorder(root);
    }
    private void printPreorder(Node<T> n) {
        if (n != null && (!n.isLeaf() || n == this.root)) {
            System.out.printf("%s [left: %s, right: %s]%n", n, n.left, n.right);
            printPreorder(n.left);
            printPreorder(n.right);
        }
    }

    public void bfsTraversal() {
        if (root == null) {
            return;
        }

        Queue<Node<T>> queue = new LinkedList<>();  // creacion de cola mediante un linkedlist
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
}
