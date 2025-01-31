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
 * Clase: PilaVectorTest.java
 * Clase de prueba para la clase PilaVector con JUnit
 * 
 * Métodos probados:
 * - {@link PilaVector#push(Object)}
 * - {@link PilaVector#pop()}
 * - {@link PilaVector#peek()}
 * 
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PilaVectorTest {

    /**
     * Instancia de la pila para ser utilizada en las pruebas.
     */
    private PilaVector<Integer> pila;


    /**
     * Configuración inicial antes de cada prueba.
     * Se crea una nueva instancia de {@link PilaVector}.
     */
    @BeforeEach
    void setUp() {
        pila = new PilaVector<>();
    }


    /**
     * Prueba el método {@link PilaVector#push(Object)} y {@link PilaVector#pop()}.
     * Se agrega un elemento a la pila y luego se elimina, verificando que el 
     * valor devuelto sea el mismo que el agregado.
     */
    @Test
    void testPusPop(){
        pila.push(10);
        assertEquals(10, pila.pop());
    }


    /**
     * Prueba el método {@link PilaVector#peek()}.
     * Se agrega el elemento a la pila y luego se verifica que el valor 
     * en la parte superior de la pila sea el mismo sin eliminarlo de la pila.
     */
    @Test 
    void testPeek(){
        pila.push(5);
        assertEquals(5, pila.peek());
        
    }

}
