package pila;

public class EquilibrioParentesis {
    static boolean detectar(String s) {
        MyStack<Character> pila = new MyStack<>();

        for(char c : s.toCharArray()) {
            if (c != '(' && c != ')') {
                continue;
            }

            if (c == '(') {
                pila.push(c);
            }

            if (c == ')') {
                if (pila.isEmpty()) return false;
                pila.pop();
            }
        }

        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "(())";
        System.out.println(detectar(s1));
        String s2 = "(()";
        System.out.println(detectar(s2));
        String s3 = "(()())()";
        System.out.println(detectar(s3));
        System.out.println(detectar("(3 + (1-2) * 4) / (3 + 4)"));
    }
}
