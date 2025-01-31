/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Seccion 31
 * Hoja de Trabajo 2
 * Integrantes:
 * Biancka Raxón 24960
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 * 
 * 
 * Clase: Pila.java
 * Comportamiento esperado por una pila. 
 * 
 * @param <T> el tipo de elementos almacenados en la pila
 */
public interface Pila<T> {

     /**
     * Inserta el elemento en la parte superior de la pila.
     * @param item el elemento a agregar a la pila
     */
    void push(T item);

    /**
     * Elimina y devuelve el elemento superior de la pila.
     * @return el elemento eliminado
     * @throws EmptyStackException si la pila está vacía
     */
    T pop();

    /**
     * Devuelve el elemento de la parte superior de la pila sin eliminarlo.
     * @return el elemento superior de la pila
     * @throws EmptyStackException si la pila está vacía
     */
    T peek();

    /**
     * Verifica si esta vacia la pila
     * @return true si la pila está vacía,false la pila está llena
     */
    boolean isEmpty();

    /**
     * da el numero de elementos en la pila
     * @return tamanio de la pila
     */
    int size();
}