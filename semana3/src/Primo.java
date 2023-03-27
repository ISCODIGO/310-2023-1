public class Primo {
    /**
     * Primera version de la deteccion de numeros primos. En este caso es O(n)
     * @param n numero a probar
     * @return true si es primo
     */
    public static boolean version1(long n) {
        int iteraciones = 0;
        boolean esPrimo = false;
        // true -> si es primo n
        int divisores = 0;

        long limite = (long) (Math.sqrt(n) + 1);
        for(long i = 2; i < n - 1; i++) {
            iteraciones++;
            if (n % i == 0) {
                divisores++;
            }
        }

        if (divisores == 0) {
            esPrimo = true;
        }

        System.out.printf("%d iteraciones%n", iteraciones);
        return esPrimo;
    }

    /**
     * Una mejora con respecto a la version 1. Se omite el calculo para numeros pares. Se evita el conteo innecesario
     * de divisores. Sigue siendo O(n)
     * @param n numero a probar
     * @return true si es primo
     */
    public static boolean version2(long n) {
        int iteraciones = 1;  // esto para que las evaluaciones previas sean contabilizadas
        boolean esPrimo = true;  // true -> si es primo n

        // manejo de numeros pares
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for(long i = 3; i < n - 1; i += 2) {
            iteraciones++;
            if (n % i == 0) {
                esPrimo = false;
                break;
            }
        }

        System.out.printf("%d iteraciones%n", iteraciones);
        return esPrimo;
    }

    /**
     * En este caso se determina que no es necesario evaluar todos numeros solamente hasta llegar a la raiz cuadrada del
     * numero evaluado. Esto hace que la complejidad se reduzca a O(n^1/2)
     * @param n numero a probar
     * @return true si es primo
     */
    public static boolean version3(long n) {
        int iteraciones = 0;
        boolean esPrimo = true;  // true -> si es primo n

        long limite = (long) Math.sqrt(n) + 1;
        for(long i = 2; i < limite; i++) {
            iteraciones++;
            if (n % i == 0) {
                esPrimo = false;
                break;
            }
        }

        System.out.printf("%d iteraciones%n", iteraciones);
        return esPrimo;
    }
}
