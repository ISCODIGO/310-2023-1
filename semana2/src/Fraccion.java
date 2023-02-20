import java.util.Arrays;

public class Fraccion implements Comparable<Fraccion> {
    private int denominador;
    private int numerador;

    public Fraccion(int numerador, int denominador) {
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public Fraccion sumar(Fraccion otra) {
        int d = this.denominador * otra.denominador;
        return new Fraccion(
                this.numerador * otra.denominador + otra.numerador * this.denominador,
                d
        );
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.numerador, this.denominador);
    }

    @Override
    public int compareTo(Fraccion o) {
        double v1 = (double) this.numerador / this.denominador;
        double v2 = (double) o.numerador / o.denominador;

        if (v1 == v2) return 0;
        else if (v1 < v2) {
            return -1;
        }
        else return 1;
    }

    public static void main(String[] args) {
        var f1 = new Fraccion(1, 2);
        var f2 = new Fraccion(1, 3);
        var f3 = f1.sumar(f2);

        Fraccion[] fraccions = {
                f3, f1, f2
        };

        Arrays.sort(fraccions);
        System.out.println(Arrays.toString(fraccions));
        System.out.println(10+"hola");
    }
}
