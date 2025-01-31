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
 */
public interface Pila<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}