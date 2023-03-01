public class CopyArrayDemo {
    public static void main(String[] args) {
        int n = 200_000_000;
        int[] original = new int[n];
        int[] copia = new int[n];

        // manual
        long inicio = System.currentTimeMillis();
        for(int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }
        System.out.print("Manual...");
        System.out.println(System.currentTimeMillis() - inicio);

        // sistema
        System.out.print("Sistema...");
        long inicio2 = System.currentTimeMillis();
        System.arraycopy(original, 0, copia, 0, original.length);
        System.out.println(System.currentTimeMillis() - inicio2);
    }
}
