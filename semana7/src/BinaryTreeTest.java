import java.util.Arrays;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<Integer> bin = new BinaryTree<>(1);
        var n10 = bin.add(bin.getRoot(), 10);
        var n20 = bin.add(bin.getRoot(), 20);
        bin.add(n10, 30);
        bin.add(n10, 40);
        System.out.println("Imprimir el array...");
        System.out.println(Arrays.toString(bin.toArray()));
        System.out.println("Otro metodo recursivo para imprimir el arbol");
        System.out.println(bin.size());

        bin.print();
    }
}