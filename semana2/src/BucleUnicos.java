public class BucleUnicos {
    public static void main(String[] args) {
        long inicio = System.nanoTime();
        // funcion constante (no hay instrucciones complejas)
        //int suma = 40_000_0000 + 50_000_000;
        int n = 2000_000_000;

        // lineal
        //for (int i = 1; i <= n; i++) {}

        // otro lineal
        //for (int i = 1; i <= n; i+=2) {}

        // logaritmico
        //for (long i = 1; i < n; i*=2) {}

        // raiz cuadrada
        //for(int i = 0; i < Math.sqrt(n); i++) {}

        for (int i = 0; i < n; i++) {
            if (i == 1) {
                break;
            }
        }


        long fin = System.nanoTime();
        System.out.printf("Tiempo %d ns", fin-inicio);
    }
}