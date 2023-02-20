public class LinearSearch {
    static int iteraciones;
    public static int buscar(int[] a, int valor) {
        iteraciones = 0;
        for (int i = 0; i < a.length; i++) {
            ++iteraciones;
            if (a[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {
                1, 5, 2, 8, 10, 3, 4, 6
        };
        int valor = 1;
        int posicion = LinearSearch.buscar(arr, valor);
        System.out.printf("El valor %d esta en la posicion %d%n", valor, posicion);
        System.out.println(iteraciones);
    }
}


/*

Constante
Logaritmica
Raiz cuadrada
Lineal
Cuadratica
Cubica
Exponencial
Factorial




 */