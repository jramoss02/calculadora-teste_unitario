import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CALCULADORAJUNITTEST {
    
    // Teste para a operação de Soma
    @Test
    public void SomaTest(){
         // Cria uma instância da classe Soma
        Soma calculadora = new Soma();

        // Chama o método 'somar' com os valores 5 e 3
        int resultado = calculadora.somar(5, 3);

        // Verifica se o resultado da soma é igual a 8
        Assertions.assertEquals(8, resultado);
    }
    
    // Teste para a operação de Divisão
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
    
    // Teste para a operação de Divisão
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
