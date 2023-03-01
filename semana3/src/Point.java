public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point otro) {
        this.x = otro.x;
        this.y = otro.y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = a;  // referencia, copia superficial
        b.x = 33;
        System.out.println(a.x);
    }
}
