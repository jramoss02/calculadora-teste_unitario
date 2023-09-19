import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Declaração da classe de teste
public class SubtracaoTest {
    
    // Teste para a operação de subtração
    @Test
    public void testSubtracao() {
        // Cria uma instância da classe Subtracao
        Subtracao calculadora = new Subtracao();

        // Chama o método 'subtrair' com os valores 10 e 3
        int resultado = calculadora.subtrair(10, 3);

        // Verifica se o resultado da subtração é igual a 7
        Assertions.assertEquals(7, resultado);
    }
}
