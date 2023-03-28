package tree;

import java.util.Arrays;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<Integer> bin = new BinaryTree<>();

        var n10 = bin.add(bin.root(), 10);  // root
        var n20 = bin.add(bin.root(), 20);  // root.left
        var n30 = bin.add(bin.root(), 30);  // root.right
        var n40 = bin.add(bin.root(), 40);  // no se inserta, espacios ocupados
        var n50 = bin.add(bin.root().left(), 50);  // root.left.left

        System.out.println("Cuantos nodos hay: ");
        System.out.println(bin.size());

        System.out.println("Otro metodo recursivo para imprimir el arbol");
        bin.print();

        System.out.println("Recorrido por profundidad (preorden)...");
        bin.dfsPreorder();
        System.out.println("Recorrido por anchura...");
        bin.bfsTraversal();
    }
}