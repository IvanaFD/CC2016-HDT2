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
 * Clase: PilaVector
 * Da una implementacion de Pila<T> usando Vector<T>. 
 */
import java.util.Vector;

/**
 * Implementación de una pila genérica utilizando la clase {@link Vector}.
 * @param <T> el tipo de elementos almacenados en la pila
 */
public class PilaVector<T> implements Pila<T> {

    private Vector<T> pila;


     /**
     * Constructor que inicializa la pila como un {@link Vector}.
     */
    public PilaVector(){ this.pila = new Vector<T>(); }
    

    /**
     * Insertar un elemento en la parte superior de la pila.
     *
     * @param item elemento a agregar
     */
    @Override
    public void push(T item) {
        pila.add(item);
    }


    /**
     * Elimina y devuelve el elemento en la parte superior de la pila.
     *
     * @return elemento eliminado de la pila
     * @throws RuntimeException si la pila está vacía
     */
    @Override
    public T pop() {
        if (isEmpty()) throw new RuntimeException("Pila vacia");
        return pila.remove(pila.size() - 1);
    }


    /**
     * Devuelve el elemento en la parte superior de la pila .
     *
     * @return elemento de la parte superior de la pila
     * @throws RuntimeException si la pila está vacía
     */
    @Override
    public T peek(){
        if (isEmpty()) throw new RuntimeException("Pila vacia");
        return pila.lastElement();
    }


    /**
     * Verificar si la pila está vacía.
     * @return true si la pila no tiene elementos, false en caso contrario
     */
    @Override
    public boolean isEmpty() {
        return pila.isEmpty();
    }


    /**
     * Devuelve el número de elementos que hay en pila.
     * @return tamaño de la pila
     */
    @Override
    public int size() {
        return pila.size();
    }
}
