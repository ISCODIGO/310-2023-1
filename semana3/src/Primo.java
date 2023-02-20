public class Primo {
    public static boolean detectar(long n) {
        int iteraciones = 0;
        boolean esPrimo = true;
        // true -> si es primo n
        int divisores = 0;

        long limite = (long) (Math.sqrt(n) + 1);
        for(long i = 2; i < limite; i++) {
            iteraciones++;
            if (n % i == 0) {
                esPrimo = false;
                break;
            }
        }

        System.out.println(iteraciones);
        return esPrimo;
    }
}
