import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomaTest {
    
    @Test
    public void testSoma() {
        Soma calculadora = new Soma();
        int resultado = calculadora.somar(5, 3);
        Assertions.assertEquals(8, resultado);
    }
}
