import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Declaração da classe de teste
public class MultiplicacaoTest {
    
    // Teste para a operação de multiplicação
    @Test
    public void testMultiplicacao() {
        // Cria uma instância da classe Multiplicacao
        Multiplicacao calculadora = new Multiplicacao();

        // Chama o método 'multiplicar' com os valores 4 e 5
        int resultado = calculadora.multiplicar(4, 5);

        // Verifica se o resultado da multiplicação é igual a 20
        Assertions.assertEquals(20, resultado);
    }
}
