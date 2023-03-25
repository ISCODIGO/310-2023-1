import java.util.LinkedList;
import java.util.List;

public class BinaryTree<T> {
    private static class Node<T> {
        /**
         * Dato dentro del nodo
         */
        T element;

        /**
         * Referencia hacia la izquierda
         */
        Node<T> left;

        /**
         * Referencia hacia la derecha
         */
        Node<T> right;

        public Node(T e) {
            element = e;
            left = null;
            right = null;
        }

        public boolean addLeft(Node<T> node) {
            if (this.left == null) {
                this.left = node;
                return true;
            }
            return false;
        }

        /**
         * Agregar un nodo hijo hacia la derecha.
         * @param node nodo a insertar
         * @return devuelve true si logro insertar el nodo.
         */
        public boolean addRight(Node<T> node) {
            if (this.right == null) {
                this.right = node;
                return true;
            }
            return false;
        }

        @Override
        public String toString() {
            return element.toString();
        }
    }

    // atributos de BinaryTree
    private Node<T> root;

    public BinaryTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<T> root() {
        return root;
    }

    /**
     * Recorrer el arbol binario utilizando preorder
     * @param n nodo de origen
     */
    public void traverse(Node<T> n) {
        if(n != null) {
            System.out.println(n);  // paso 1
            traverse(n.left);  // paso 2
            traverse(n.right);  // paso 3
        }
    }

    /**
     * Inserta un nuevo nodo a partir del parent. Si el arbol esta vacio crea
     * un nuevo root. Sino intenta insertar a la izquierda o finalmente a la
     * derecha.
     * @param parent nodo padre
     * @param e elemento del nuevo nodo
     * @return retorna el nuevo nodo
     */
    public Node<T> add(Node<T> parent, T e) {
        boolean isLeft, isRight;
        Node<T> newNode = new Node<>(e);

        // si el arbol esta vacia crea el nodo raiz
        if (isEmpty()) {
            root = newNode;
        } else if (!parent.addLeft(newNode)) {
            if (!parent.addRight(newNode))
                return null;  // no se inserto en ningun lado
        }

        return newNode;
    }

    /**
     * Retorna el array de nodos del arbol obtenidos a traves del recorrido preorden
     * @return array de los nodos
     */
    public Object[] toArray() {
        var list = new LinkedList<T>();
        listPreorder(list, root);
        return list.toArray();
    }

    private void listPreorder(List<T> list, Node<T> n) {
        if (n != null) {
            list.add(n.element);
            listPreorder(list, n.left);
            listPreorder(list, n.right);
        }
    }

    /**
     * Conteo de todos los nodos del arbol de forma recursiva
     * @return cantidad de nodos del arbol
     */
    public int size() {
        return sizeRecursive(root);
    }

    private int sizeRecursive(Node<T> n) {
        if (n == null) return 0;
        return 1 + sizeRecursive(n.left) + sizeRecursive(n.right);
    }

    public void print() {
        printRecursive(root);
    }
    private void printRecursive(Node<T> n) {
        if (n != null) {
            System.out.printf("%s [%s, %s]%n", n, n.left, n.right);
            printRecursive(n.left);
            printRecursive(n.right);
        }
    }
}
