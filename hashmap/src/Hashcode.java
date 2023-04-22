public class Hashcode {
    public static void main(String[] args) {
        String s = "hola";
        System.out.println(s.hashCode());

        for (char letra : "hola".toCharArray()) {
            System.out.printf("Letra: %c Ascii:%d%n", letra, (int)letra);
        }

        System.out.println((char)127);

        System.out.println(330%128);
        System.out.println(321%128);
    }
}
