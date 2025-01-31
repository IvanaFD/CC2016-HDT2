import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora(new PilaVector<>());
    }

    @Test
    void testSuma() {
        assertEquals(71, calc.recorrerPila("29 42 +"));
    }

    @Test
    void testResta() {
        assertEquals(-5990, calc.recorrerPila("10 6000 -"));
    }
}
