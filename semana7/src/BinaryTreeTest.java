import java.util.Arrays;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<Integer> bin = new BinaryTree<>(10);
        try {
            var n20 = bin.add(bin.root(), 20);
            var n30 = bin.add(bin.root(), 30);
            //var n40 = bin.add(bin.root(), 40);  // este no se inserta ya que los espacios estan ocupados
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Imprimir el array...");
        System.out.println(Arrays.toString(bin.toArray()));

        System.out.println("Cuantos nodos hay: ");
        System.out.println(bin.size());

        System.out.println("Otro metodo recursivo para imprimir el arbol");
        bin.print();
    }
}