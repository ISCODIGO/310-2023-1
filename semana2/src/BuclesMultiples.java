public class BuclesMultiples {
    public static void main(String[] args) {
        int n = 10;
        long v1 = System.nanoTime();

        // lineal
        //for (int i = 0; i < n; i++) {}
        //for (int i = 0; i < n; i++) {}

        // cuadratico
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {}
        }*/


        // cubico
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {}
            }
        }

        long v2 = System.nanoTime();
        System.out.printf("Tiempo %d ns", (v2-v1));
    }
}
