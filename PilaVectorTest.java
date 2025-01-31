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
 * 
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PilaVectorTest {
    private PilaVector<Integer> pila;

    @BeforeEach
    void setUp() {
        pila = new PilaVector<>();
    }

    @Test
    void testPusPop(){
        pila.push(10);
        assertEquals(10, pila.pop());
    }

    @Test 
    void testPeek(){
        pila.push(5);
        assertEquals(5, pila.peek());
        
    }

}
