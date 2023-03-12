package recursion;

public class FuncionesLlamado {

    static void a() {
        b();
        System.out.println("A");
    }

    static void b() {
        c();
        System.out.println("B");
    }

    static void c() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        a();
    }
}
