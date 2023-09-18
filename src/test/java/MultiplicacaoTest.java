import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicacaoTest {
    
    @Test
    public void testMultiplicacao() {
        Multiplicacao calculadora = new Multiplicacao();
        int resultado = calculadora.multiplicar(4, 5);
        Assertions.assertEquals(20, resultado);
    }
}
