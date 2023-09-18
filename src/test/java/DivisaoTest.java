import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisaoTest {
    
    @Test
    public void testDivisao() {
        Divisao calculadora = new Divisao();
        double resultado = calculadora.dividir(10.0, 2.0);
        Assertions.assertEquals(5.0, resultado, 0.001); // Tolerância de erro de 0.001
    }
    
    @Test
    public void testDivisaoPorZero() {
        Divisao calculadora = new Divisao();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(10.0, 0.0);
        });
    }
}
