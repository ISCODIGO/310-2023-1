/*

En esta segunda version se utiliza un arreglo de booleans para indicar que
valores estan activos y cuales no. Esta implementacion parece ser mas sencilla
de implementar a pesar de utilizar una mayor cantidad de datos.

 */
public class ConjuntoV2 implements Conjunto<ConjuntoV2>, Comparable<ConjuntoV2> {
    private final boolean[] elementos;
    int inicio;
    int fin;

    public ConjuntoV2(int inicial, int fin) {
        this.inicio = Math.min(inicial, fin);
        this.fin = Math.max(inicial, fin);
        elementos = new boolean[this.fin + 1];

        // dibujar los elementos dentro del array
        for(int i = this.inicio; i <= this.fin; i++) {
            elementos[i] = true;
        }
    }

    public ConjuntoV2 union(ConjuntoV2 otro) {
        int _ini = Math.min(this.inicio, otro.inicio);
        int _fin = Math.max(this.fin, otro.fin);
        var nuevo = new ConjuntoV2(_ini, _fin);
        // dibujo propio
        for(int i = _ini; i <= _fin; i++) {
            if (this.elementos.length > i && otro.elementos[i]
                    || otro.elementos.length > i && otro.elementos[i]) {
                nuevo.elementos[i] = true;
            } else {
                nuevo.elementos[i] = false;
            }
        }
        return nuevo;
    }

    public ConjuntoV2 interseccion(ConjuntoV2 otro) {
        int _ini = Math.min(this.inicio, otro.inicio);
        int _fin = Math.max(this.fin, otro.fin);
        var nuevo = new ConjuntoV2(_ini, _fin);
        // dibujo propio
        for(int i = _ini; i <= _fin; i++) {
            if (this.elementos.length > i
                    && this.elementos[i]
                    && otro.elementos.length > i
                    && otro.elementos[i]) {
                nuevo.elementos[i] = true;
            } else {
                nuevo.elementos[i] = false;
            }
        }
        return nuevo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        boolean primerLinea = true;
        for(int i = 0; i < elementos.length; i++) {
            if (this.elementos[i]) {
                if (!primerLinea) {
                    sb.append(", ");
                } else {
                    primerLinea = false;
                }
                sb.append(i);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public int compareTo(ConjuntoV2 o) {
        if (this.inicio == o.inicio && this.fin == o.fin) {
            return 0;
        } else if (this.inicio < o.inicio) {
            return -1;
        } else if (this.inicio > o.inicio) {
            return 1;
        } else {
            if (this.fin < o.fin) {
                return -1;
            }

            return 1;  // caso: this.fin > o.fin
        }
    }
}
