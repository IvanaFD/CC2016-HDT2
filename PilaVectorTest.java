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
