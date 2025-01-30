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
}
