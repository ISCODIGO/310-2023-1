package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para establecer un arbol n-ario
 * @param <T> tipo generico
 */
public class Tree<T> {
    /**
     * Clase del nodo
     * @param <T> tipo generico
     */
    static class Node<T> {
        T element;
        List<Node<T>> children;  // esto permite usar cualquier implementacion de List

        public Node(T e) {
            element = e;
            children = new ArrayList<>();
        }

        @Override
        public String toString() {
            return element.toString();
        }

        public void addChild(Node<T> node) {
            children.add(node);
        }
    }

    private Node<T> root;

    /**
     * Devuelva el nodo raiz del arbol.
     * @return nodo raiz.
     */
    public Node<T> root() {
        return root;
    }

    /**
     * Identifica si un arbol tiene al menos un nodo.
     * @return true si esta vacio el arbol.
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Crea un nodo a partir del elemento y lo incluye dentro de los hijos del nodo padre
     * @param parent nodo padre
     * @param element elemento a partir del cual se crea un nuevo nodo
     * @return el nodo creado
     */
    public Node<T> add(Node<T> parent, T element) {
        var newNode = new Node<>(element);

        if (isEmpty()) {
            root = newNode;
        } else {
            parent.addChild(newNode);
        }

        return newNode;
    }

    /**
     * Recorre el subarbol completo a partir de un nodo de origen imprimiendo
     * los datos dentro de cada nodo.
     * @param node - nodo de origen
     */
    public void traverse(Node<T> node) {
        if (node != null) {
            System.out.println(node);

            for (Node<T> child: node.children) {
                traverse(child);
            }
        }
    }
}
