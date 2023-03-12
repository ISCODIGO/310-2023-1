package recursion;

public class SumaEnteros {
    static int sumar(int n) {
        if (n == 1) return 1;  // caso base
        return n + sumar(n-1);  // caso recursivo
    }

    public static void main(String[] args) {
        System.out.println(sumar(5));
    }
}
