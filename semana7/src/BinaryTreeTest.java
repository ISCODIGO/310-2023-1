import java.util.Arrays;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<Integer> bin = new BinaryTree<>();
        var n10 = bin.add(bin.root(), 10);  // en este caso n10 sera la raiz
        var n20 = bin.add(bin.root(), 20);
        bin.add(n10, 30);
        bin.add(n10, 40);  // este no se inserta ya que los espacios estan ocupados
        System.out.println("Imprimir el array...");
        System.out.println(Arrays.toString(bin.toArray()));

        System.out.println("Cuantos nodos hay: ");
        System.out.println(bin.size());

        System.out.println("Otro metodo recursivo para imprimir el arbol");
        bin.print();
    }
}