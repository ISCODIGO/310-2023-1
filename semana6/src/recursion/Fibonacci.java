package recursion;

public class Fibonacci {

    static long instrucciones = 0;  // calcular cuantas recursiones ocurren

    static long calculoLento(long n) {
        // caso base
        if (n == 0 || n == 1) {
            instrucciones++;
            return n;
        }

        // caso recursivo
        instrucciones++;
        return calculoLento(n-1) + calculoLento(n-2);
    }

    static long calculoRapido(int n, long[] cache) {
        // caso base
        if (n == 0 || n == 1) {
            instrucciones++;
            return n;
        }

        // no esta calculado el valor
        if (n > 0 && cache[n] == 0) {
            instrucciones++;
            cache[n] = calculoRapido(n-1, cache) + calculoRapido(n-2, cache);
        }

        // caso recursivo
        instrucciones++;
        return cache[n];
    }

    public static void main(String[] args) {
        int N = 45;

        System.out.println("Para un N=" + N);
        System.out.printf("%-20s%-15s%-15s%n", "Version", "Resultado", "Instrucciones");

        // creacion del cache para evitar calculos innecesarios
        var lista = new long[N+1];
        lista[0] = 0;
        lista[1] = 1;

        instrucciones = 0;
        System.out.printf("%-20s%-15d%-15d%n", "Con memoria O(n)", calculoRapido(N, lista), instrucciones);

        instrucciones = 0;
        System.out.printf("%-20s%-15d%-15d%n", "Sin memoria O(2^n)", calculoLento(N), instrucciones);

    }
}
