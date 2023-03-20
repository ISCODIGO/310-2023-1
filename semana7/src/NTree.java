import java.util.ArrayList;
import java.util.List;

public class NTree<T> {
    class Node<T> {
        T element;
        ArrayList<Node> children;

        public Node(T e) {
            element = e;
            children = new ArrayList<>();
        }

        @Override
        public String toString() {
            return element.toString();
        }

        public Node addcChild(T e) {
            Node aux = new Node(e);
            children.add(aux);
            return aux;
        }
    }

    protected Node root;

    public NTree(T e) {
        root = new Node(e);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node add(Node parent, T e) {
        var newNode = new Node<>(e);

        if (isEmpty()) {
            root = newNode;
        } else if (parent == null) {
            parent = newNode;
        } else {
            parent.addcChild(e);
        }

        return newNode;
    }

    public void traverse(Node n) {
        if (n != null) {
            System.out.println(n);

            for (Node item: (List<Node>) n.children) {
                traverse(item);
            }
        }
    }
}
