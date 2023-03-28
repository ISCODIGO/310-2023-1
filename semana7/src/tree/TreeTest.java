package tree;

public class TreeTest {
    public static void main(String[] args) {
        Tree<Integer> arbol = new Tree<>();
        arbol.add(arbol.root(), 10);  // root
        var n20 = arbol.add(arbol.root(), 20);
        var n30 = arbol.add(arbol.root(), 30);
        var n40 = arbol.add(n20, 40);

        arbol.add(n20, 50);
        arbol.add(n20, 60);

        arbol.traverse(arbol.root());
    }
}
