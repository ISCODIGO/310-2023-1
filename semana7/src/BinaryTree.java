import java.util.LinkedList;

public class BinaryTree<T> {
    class Node<T> {
        T element;
        Node<T> left;
        Node<T> right;

        public Node(T e) {
            element = e;
            left = null;
            right = null;
        }

        @Override
        public String toString() {
            return element.toString();
        }
    }

    // atributos de ArbolBinario
    private Node root;

    public BinaryTree(T elemento) {
        root = new Node(elemento);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node getRoot() {
        return root;
    }

    public void preorden(Node n) {
        if(n != null) {
            System.out.println(n);  // paso 1
            preorden(n.left);  // paso 2
            preorden(n.right);  // paso 3
        }
    }

    /**
     * Inserta un nuevo nodo a partir del parent. Si este es nulo lo crea.
     * @param parent - nodo padre
     * @param e - elemento del nuevo nodo
     * @return - retorna el nuevo nodo
     */
    public Node add(Node parent, T e) {
        Node newNode = new Node(e);

        // si el arbol esta vacia crea el nodo raiz
        if (isEmpty()) {
            root = newNode;
        } else if (parent == null) {
            parent = newNode;
        } else if (parent.left == null) {
            parent.left = newNode;
        } else if (parent.right == null) {
            parent.right = newNode;
        }

        return newNode;
    }

    /**
     * Retorna el array de nodos del arbol obtenidos a traves del recorrido preorden
     * @return - Array de los nodos
     */
    public Object[] toArray() {
        LinkedList list = new LinkedList();
        listPreorder(list, root);
        return list.toArray();
    }

    private void listPreorder(LinkedList list, Node n) {
        if (n != null) {
            list.add(n.element);
            listPreorder(list, n.left);
            listPreorder(list, n.right);
        }
    }

    /**
     * Conteo de todos los nodos del arbol de forma recursiva
     * @return - Cantidad de nodos del arbol
     */
    public int size() {
        return sizeRecursive(root);
    }

    private int sizeRecursive(Node n) {
        if (n == null) return 0;
        return 1 + sizeRecursive(n.left) + sizeRecursive(n.right);
    }

    public void print() {
        printRecursive(root);
    }
    private void printRecursive(Node n) {
        if (n != null) {
            System.out.printf("%s [%s, %s]%n", n, n.left, n.right);
            printRecursive(n.left);
            printRecursive(n.right);
        }
    }
}
