/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Sección 31
 * Hoja de Trabajo 2
 * Integrantes:
 * Biancka Raxón 24960
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 * 
 * Clase: {@code CalculadoraTest.java}
 * 
 * Clase de prueba para la clase {@code Calculadora}. Esta clase utiliza el framework JUnit
 * para realizar pruebas unitarias de la clase {@code Calculadora}, evaluando diferentes casos
 * para verificar su funcionalidad y manejo de errores en la evaluación de expresiones en notación postfix.
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    /**
     * Instancia de la clase {@code Calculadora} que se utilizará en las pruebas.
     */
    private Calculadora calculadora;

    /**
     * Configuración antes de cada prueba.
     * Se inicializa la instancia de {@code Calculadora} con una pila basada en {@code PilaVector}.
     */
    @BeforeEach
    void setUp() {
        calculadora = new Calculadora(new PilaVector<>());
    }

    /**
     * Prueba unitaria que evalúa expresiones válidas en notación postfix.
     * Se verifica que el resultado sea el esperado para las expresiones de prueba.
     */
    @Test
    void shouldEvaluateValidExpression() {
        assertEquals(7, calculadora.recorrerPila("3 4 +"));
        assertEquals(2, calculadora.recorrerPila("10 5 /"));
        assertEquals(15, calculadora.recorrerPila("5 3 *"));
        assertEquals(1, calculadora.recorrerPila("10 3 %"));
        assertEquals(71, calculadora.recorrerPila("29 42 +"));
    }

    /**
     * Prueba unitaria que verifica que se lance una excepción {@code RuntimeException} 
     * cuando no hay suficientes operandos en la expresión para realizar una operación.
     */
    @Test
    void shouldThrowExceptionWhenNotEnoughOperands() {
        RuntimeException exception = assertThrows(RuntimeException.class, 
            () -> calculadora.recorrerPila("5 +"));
        assertEquals("Error: Hay menos de dos operandos.", exception.getMessage());
    }

    /**
     * Prueba unitaria que verifica que se lance una excepción {@code RuntimeException} 
     * cuando se encuentra un operador inválido en la expresión.
     */
    @Test
    void shouldThrowExceptionWhenOperatorIsInvalid() {
        RuntimeException exception = assertThrows(RuntimeException.class, 
            () -> calculadora.recorrerPila("5 2 @"));
        assertEquals("Error: Operador no válido (@).", exception.getMessage());
    }

    /**
     * Prueba unitaria que verifica que se lance una excepción {@code ArithmeticException} 
     * cuando se intenta realizar una división por cero en la expresión.
     */
    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, 
            () -> calculadora.recorrerPila("5 0 /"));
        assertEquals("Error: Divión entre cero. ", exception.getMessage());
    }

    /**
     * Prueba unitaria que verifica que se lance una excepción {@code RuntimeException} 
     * cuando la expresión no es válida (por ejemplo, si tiene más de un resultado en la pila).
     */
    @Test
    void shouldThrowExceptionWhenExpressionIsInvalid() {
        RuntimeException exception = assertThrows(RuntimeException.class, 
            () -> calculadora.recorrerPila("3 4 + 5"));
        assertEquals("Error: La expresión es inválida.", exception.getMessage());
    }
}
