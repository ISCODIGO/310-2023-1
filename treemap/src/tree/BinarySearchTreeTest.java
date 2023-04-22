package tree;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(7);
        tree.add(15);
        tree.add(3);
        tree.add(4);
        tree.add(8);
        tree.add(20);

        tree.print();

        //tree.bfsTraversal();

        /**System.out.println("Remover el nodo con valor 4");
        tree.remove(4);
        tree.print();

        System.out.println("Esta el numero 2: " + tree.contains(2));
        System.out.println("Esta el numero 4: " + tree.contains(4));*/
    }
}
