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
public class PilaVector<T> implements Pila<T> {

    private Vector<T> pila;

    public PilaVector(){ this.pila = new Vector<T>(); }
    
    @Override
    public void push(T item) {
        pila.add(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new RuntimeException("Pila vacia");
        return pila.remove(pila.size() - 1);
    }

    @Override
    public T peek(){
        if (isEmpty()) throw new RuntimeException("Pila vacia");
        return pila.lastElement();
    }

    @Override
    public boolean isEmpty() {
        return pila.isEmpty();
    }

    @Override
    public int size() {
        return pila.size();
    }
}
