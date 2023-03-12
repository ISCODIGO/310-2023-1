package pila;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> pila = new MyStack<>();

        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }


        //System.out.println(pila.top());
    }
}
