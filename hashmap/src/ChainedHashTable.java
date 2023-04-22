import java.util.*;

public class ChainedHashTable<K, V> implements Map<K, V> {
    final int CAPACIDAD = 128;
    Object[] tabla;
    int size;

    class ChainedEntry<K, V> implements Map.Entry<K, V> {
        K clave;
        V valor;

        public ChainedEntry(K clave, V valor) {
            this.clave = clave;
            this.valor = valor;
        }

        @Override
        public K getKey() {
            return this.clave;
        }

        @Override
        public V getValue() {
            return this.valor;
        }

        @Override
        public V setValue(V value) {
            return this.valor = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;  // original

            if (o == null || getClass() != o.getClass()) return false;

            ChainedEntry<?, ?> that = (ChainedEntry<?, ?>) o;
            return Objects.equals(clave, that.clave) && Objects.equals(valor, that.valor);
        }

        @Override
        public int hashCode() {
            return Objects.hash(clave, valor);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    protected List<Entry<K, V>> getSubMap(Object key) {
        int indice = key.hashCode() % CAPACIDAD;
        return tabla[indice] == null ? null : (List<Entry<K,V>>) tabla[indice];
    }

    @Override
    public boolean containsKey(Object key) {
        List<Entry<K, V>> subMap = getSubMap(key);

        if (subMap != null && subMap.)
        for (int i = 0; i < subMap.size(); i++) {

        }
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        LinkedList<Entry<K, V>> lista;
        int indice = key.hashCode() % CAPACIDAD;

        if (tabla[indice] != null) {  // hay lista
            lista = (LinkedList<Entry<K, V>>) tabla[indice];
            Entry<K, V> aux = lista.get(0);
            for (int i = 0; i < lista.size(); i++) {
                if (aux.getKey().equals(key)) {  // clave ya existe, modificar el valor
                    V valorAnterior = aux.getValue();
                    aux.setValue(value);
                    return valorAnterior;
                }
            }
        } else {  // lista creada
            lista = new LinkedList<>();
            tabla[indice] = lista;
        }

        // Aqui se crea una nueva entrada
        ChainedEntry<K, V> entrada = new ChainedEntry<>(key, value);
        lista.add(entrada);
        size++;
        return value;
    }

    public ChainedHashTable() {
        clear();
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {
        tabla = new L
        size = 0;
    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
