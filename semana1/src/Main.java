/*

En esta implementacion de un conjunto se indican los rangos necesarios para
establecer un conjunto asumiento que son finitos y que no admiten el concepto
de extremos abiertos.

Por ejemplo: [1, 5] serian los enteros 1, 2, 3, 4, 5.

 */
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        var A = new ConjuntoV2(0, 2);
        System.out.println("A = " + A);

        var B = new ConjuntoV2(2, 10);
        System.out.println("B = " + B);

        var C = A.union(B);
        System.out.println("A union B = " + C);

        var D = A.interseccion(B);
        System.out.println("A interseccion B = " + D);

        var x = new ConjuntoV2(0, 2);
        var y = new ConjuntoV2(0, 3);
        var z = new ConjuntoV2(1, 3);

        System.out.println("x.compareTo(y) -> " + x.compareTo(y));
        System.out.println("z.compareTo(x) -> " + z.compareTo(x));
        System.out.println("x.compareTo(x) -> " + x.compareTo(x));

        ConjuntoV2[] conjuntos = new ConjuntoV2[3];
        conjuntos[0] = y;
        conjuntos[1] = z;
        conjuntos[2] = x;

        Arrays.sort(conjuntos);
        System.out.println("Conjuntos ordenados -> " +  Arrays.toString(conjuntos));

        var r1 = new Rango(1, 2);
        var r2 = new Rango(2, 3);

        System.out.println(r1.incluido(r2));
    }
}