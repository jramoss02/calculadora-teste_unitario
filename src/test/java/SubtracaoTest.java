import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtracaoTest {
    
    @Test
    public void testSubtracao() {
        Subtracao calculadora = new Subtracao();
        int resultado = calculadora.subtrair(10, 3);
        Assertions.assertEquals(7, resultado);
    }
}
