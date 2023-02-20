public class Primo {
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

    public static boolean version2(long n) {
        int iteraciones = 1;  // esto para que las evaluaciones previas sean contabilizadas
        boolean esPrimo = true;  // true -> si es primo n

        // manejo de numeros pares
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        long limite = (long) (Math.sqrt(n) + 1);
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
