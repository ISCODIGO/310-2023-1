package recursion;

public class IntroRecursion {
    static void abc() {
        abc();
    }
    static void xyz(int contador) {
        System.out.println("llamada recursiva: " + contador);
        if (contador >= 10) {
            return;
        }
        xyz(++contador);
    }
    public static void main(String[] args) {
        // abc();
        xyz(0);
    }
}