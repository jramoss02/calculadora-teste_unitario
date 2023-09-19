import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Declaração da classe de teste
public class DivisaoTest {
    
    // Teste para a operação de divisão
    @Test
    public void testDivisao() {
        // Cria uma instância da classe Divisao
        Divisao calculadora = new Divisao();

        // Chama o método 'dividir' com os valores 10.0 e 2.0
        double resultado = calculadora.dividir(10.0, 2.0);

        // Verifica se o resultado da divisão é igual a 5.0
        // com uma tolerância de erro de 0.001 (devido a possíveis arredondamentos)
        Assertions.assertEquals(5.0, resultado, 0.001);
    }
    
    // Teste para verificar se uma exceção é lançada ao dividir por zero
    @Test
    public void testDivisaoPorZero() {
        // Cria uma instância da classe Divisao
        Divisao calculadora = new Divisao();

        // Utiliza 'Assertions.assertThrows' para verificar se uma exceção do tipo 'ArithmeticException'
        // é lançada quando tentamos dividir por zero (10.0 / 0.0)
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(10.0, 0.0);
        });
    }
}
