public class BuclesMultiples {
    public static void main(String[] args) {
        int n = 100;  // tamaño del problema
        long[] tiempos = new long[3];

        // lineal
        tiempos[0] = System.nanoTime();
        for (int i = 0; i < n; i++) {}
        for (int j = 0; j < n; j++) {}
        tiempos[0] = System.nanoTime() - tiempos[0];

        // cuadratico
        tiempos[1] = System.nanoTime();
        for (int m = 0; m < n; m++) {
            for (int mm = 0; mm < n; mm++) {}
        }
        tiempos[1] = System.nanoTime() - tiempos[1];


        // cubico
        tiempos[2] = System.nanoTime();
        for (int p = 0; p < n; p++) {
            for (int pp = 0; pp < n; pp++) {
                for (int ppp = 0; ppp < n; ppp++) {}
            }
        }
        tiempos[2] = System.nanoTime() - tiempos[2];

        System.out.printf("Funcion lineal %d ns%n", tiempos[0]);
        System.out.printf("Funcion cuadratico %d ns%n", tiempos[1]);
        System.out.printf("Funcion cubico %d ns%n", tiempos[2]);
    }
}
