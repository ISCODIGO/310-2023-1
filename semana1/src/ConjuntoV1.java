/*

En esta implementacion de un conjunto se indican los rangos necesarios para
establecer un conjunto asumiento que son finitos y que no admiten el concepto
de extremos abiertos.

Por ejemplo: [1, 5] serian los enteros 1, 2, 3, 4, 5.

El problema resulta que las operaciones de union e interseccion puede resultar
complicadas de implementar en esta version.
*/

import java.util.ArrayList;

public class ConjuntoV1 {
    // posibles atributos
    // valor inicial y final
    private ArrayList<Rango> rangos;

    public ConjuntoV1() {
        this.rangos = new ArrayList<>();
    }



    public void agregarRango(Rango rango) {
        // debe revisar si ya existe ese rango
        for (var r : this.rangos) {
            //if (r.)
        }
    }

    public static ConjuntoV1 union(ConjuntoV1 a, ConjuntoV1 b) {
        return null;
    }

}

class Rango {
    int inicial;
    int fin;

    public Rango(int inicial, int fin) {
        this.inicial = Math.min(inicial, fin);
        this.fin = Math.max(inicial, fin);
    }

    public boolean incluido(Rango otro) {
        return (this.inicial >= otro.inicial && this.fin <= otro.fin);
    }
}