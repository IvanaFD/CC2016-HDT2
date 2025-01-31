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
 * Clase: CalculadoraTest.java
 * Clase de prueba para la clase Calculadora con JUnit
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora(new PilaVector<>());
    }

    @Test
    void shouldEvaluateValidExpression() {
        assertEquals(7, calculadora.recorrerPila("3 4 +"));
        assertEquals(2, calculadora.recorrerPila("10 5 /"));
        assertEquals(15, calculadora.recorrerPila("5 3 *"));
        assertEquals(1, calculadora.recorrerPila("10 3 %"));
        assertEquals(71, calculadora.recorrerPila("29 42 +"));
    }

    @Test
    void shouldThrowExceptionWhenNotEnoughOperands() {
        RuntimeException exception = assertThrows(RuntimeException.class, 
            () -> calculadora.recorrerPila("5 +"));
        assertEquals("Error: Hay menos de dos operandos.", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenOperatorIsInvalid() {
        RuntimeException exception = assertThrows(RuntimeException.class, 
            () -> calculadora.recorrerPila("5 2 @"));
        assertEquals("Error: Operador no válido (@).", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, 
            () -> calculadora.recorrerPila("5 0 /"));
        assertEquals("Error: Divión entre cero. ", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenExpressionIsInvalid() {
        RuntimeException exception = assertThrows(RuntimeException.class, 
            () -> calculadora.recorrerPila("3 4 + 5"));
        assertEquals("Error: La expresión es inválida.", exception.getMessage());
    }
}
