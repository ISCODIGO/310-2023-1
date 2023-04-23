import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagramas {

    static boolean sonAnagramas(String s1, String s2) {
        // ordenar
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        // comparar
        return Arrays.equals(c1, c2);
    }
    static List<List<String>> solucionar1(String[] palabras) {
        List<List<String>> lista = new ArrayList<>();
        for (int i = 0; i < palabras.length - 1; i++) {
            List<String> sublista = new ArrayList<>();
            sublista.add(palabras[i]);
            for (int j = i + 1; j < palabras.length; j++) {
                if (sonAnagramas(palabras[i], palabras[j])) {
                    sublista.add(palabras[j]);
                    i = j+1;
                    break;
                }
            }
            lista.add(sublista);
        }
        return lista;
    }

    public static List<List<String>> solucionar2(String[] palabras) {
        List<List<String>> lista = new ArrayList<>();
        HashMap<String, List<String>> mapa = new HashMap<>();

        for (String palabra : palabras) {
            char[] arr = palabra.toCharArray();
            ArrayList<String> sublista;
            Arrays.sort(arr);
            String clave = String.valueOf(arr);
            if (mapa.containsKey(clave)) {
                sublista = (ArrayList<String>) mapa.get(clave);
                sublista.add(palabra);
            } else {
                sublista = new ArrayList<>();
                sublista.add(palabra);
                mapa.put(clave, sublista);
            }
        }

        return List.copyOf(mapa.values());
    }

    public static void main(String[] args) {
        String[] entrada = {"hola", "ala", "cal", "acl", "uno"};

        var solucion = solucionar2(entrada);
        System.out.println(solucion);
    }
}
