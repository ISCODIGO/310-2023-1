/*

Este archivo es un intento de revisar las posibles operaciones que son
necesarias en una Lista.

Al final se utilizara la que esta disponible en la biblioteca estandar
de Java.

 */
public interface List<T> {
    public void add(T nuevo);
    public T remove(int posicion);
    public int size();

    /**
     * Busca la posicion de un elemento
     * @param elemento
     * @return retorna la primera posicion. -1 si no lo encuentra
     */
    public int search(T elemento);

    /**
     * Intercambia el valor anterior por el nuevo en la misma posicion
     * @param anterior
     * @param nuevo
     */
    public void update(T anterior, T nuevo);

    public void clear();
}
