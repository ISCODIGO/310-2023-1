public class NTreeTest {
    public static void main(String[] args) {
        NTree arbol = new NTree(10);
        var n20 = arbol.add(arbol.root, 20);
        var n30 = arbol.add(arbol.root, 30);
        var n40 = arbol.add(arbol.root, 40);

        arbol.add(n20, 50);
        arbol.add(n20, 60);

        arbol.traverse(arbol.root);
    }
}
