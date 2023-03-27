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

        /**
         * Agregar un nodo a la izquierda
         * @param node nodo a insertar
         * @return devuelve true si logra insertar el nodo
         */
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

    /**
     * Nodo raiz del arbol binario
     */
    private Node<T> root;

    public BinaryTree(T element) {
        root = new Node<>(element);
    }

    /**
     * Determinar si el arbol esta vacio
     * @return true si no hay elementos
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Retorna el nodo raiz
     * @return nodo raiz
     */
    public Node<T> root() {
        return root;
    }

    /**
     * Recorrer el arbol binario utilizando preorder
     * @param n nodo de origen
     */
    public void preorder(Node<T> n) {
        if(n != null) {
            System.out.println(n);  // paso 1
            preorder(n.left);  // paso 2
            preorder(n.right);  // paso 3
        }
    }

    /**
     * Inserta un nuevo nodo a partir del parent. Si el arbol esta vacio crea un nuevo root. Sino intenta insertar a la izquierda o finalmente a la derecha.
     * @param parent el nodo padre
     * @param element dato del nuevo nodo
     * @return el nuevo nodo
     * @throws Exception en caso de no insertar el nodo
     */
    public Node<T> add(Node<T> parent, T element) throws Exception {
        Node<T> newNode = new Node<>(element);

        // si el arbol esta vacia crea el nodo raiz
        if (isEmpty()) {
            root = newNode;
        } else if (parent.left == null) {
            parent.left = newNode;
        } else if (parent.right == null) {
            parent.right = newNode;
        } else {
            throw new Exception("No pudo insertar el nodo");
        }

        return newNode;
    }

    /**
     * Retorna el array de nodos del arbol obtenidos a traves del recorrido preorden
     * @return array de los nodos
     */
    public Object[] toArray() {
        var list = new LinkedList<T>();
        addListPreorder(list, root);
        return list.toArray();
    }

    private void addListPreorder(List<T> list, Node<T> n) {
        if (n != null) {
            list.add(n.element);
            addListPreorder(list, n.left);
            addListPreorder(list, n.right);
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

    /**
     * Impresion de los nodos del arbol binario, incluyendo los hijos de cada nodo.
     */
    public void print() {
        printPreorder(root);
    }
    private void printPreorder(Node<T> n) {
        if (n != null) {
            System.out.printf("%s [%s, %s]%n", n, n.left, n.right);
            printPreorder(n.left);
            printPreorder(n.right);
        }
    }
}
