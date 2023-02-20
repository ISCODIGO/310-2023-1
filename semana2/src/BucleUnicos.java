public class BucleUnicos {
    public static void main(String[] args) {
        long[] tiempos = new long[6];
        int n = 100;  // tamaño del problema

        // funcion constante (no hay instrucciones complejas)
        tiempos[0] = System.nanoTime();
        int suma = 1 + 2;
        tiempos[0] = System.nanoTime() - tiempos[0];

        // lineal
        tiempos[1] = System.nanoTime();
        for (int i = 1; i <= n; i++) {}
        tiempos[1] = System.nanoTime() - tiempos[1];

        // otro lineal
        tiempos[2] = System.nanoTime();
        for (int i = 1; i <= n; i+=2) {}
        tiempos[2] = System.nanoTime() - tiempos[2];

        // logaritmico
        tiempos[3] = System.nanoTime();
        for (long i = 1; i < n; i*=2) {}
        tiempos[3] = System.nanoTime() - tiempos[3];

        // raiz cuadrada
        tiempos[4] = System.nanoTime();
        for(int i = 0; i < Math.sqrt(n); i++) {}
        tiempos[4] = System.nanoTime() - tiempos[4];

        tiempos[5] = System.nanoTime();
        for (int i = 0; i < n; i++) {
            if (i == 1) {
                break;
            }
        }
        tiempos[5] = System.nanoTime() - tiempos[5];

        System.out.printf("Funcion constante %d ns%n", tiempos[0]);
        System.out.printf("Funcion lineal %d ns%n", tiempos[1]);
        System.out.printf("Funcion otro lineal %d ns%n", tiempos[2]);
        System.out.printf("Funcion logaritmico %d ns%n", tiempos[3]);
        System.out.printf("Funcion raiz cuadrada %d ns%n", tiempos[4]);
    }
}