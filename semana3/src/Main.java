public class Main {
    public static void main(String[] args) {
        //long numero = 773689258747609L;  // este es muy grande para las 2 primeras versiones
        long numero = 889843837;
        System.out.println("Primera version lineal...");
        Primo.version1(numero);
        System.out.println("Segunda version lineal (mejorada)...");
        Primo.version2(numero);
        System.out.println("Tercera version raiz cuadrada...");
        Primo.version3(numero);
    }
}