import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Declaração da classe de teste
public class SomaTest {
    
    // Teste para a operação de soma
    @Test
    public void testSoma() {
        // Cria uma instância da classe Soma
        Soma calculadora = new Soma();

        // Chama o método 'somar' com os valores 5 e 3
        int resultado = calculadora.somar(5, 3);

        // Verifica se o resultado da soma é igual a 8
        Assertions.assertEquals(8, resultado);
    }
}
