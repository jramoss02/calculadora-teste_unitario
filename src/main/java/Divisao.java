/**
 * @author José Ramos
 * @version 1.03
 * @since Release 1.02
 *
 * Classe responsável por realizar operações de divisão.
 */
public class Divisao {
    /**
     * Realiza a operação de divisão de dois números.
     * @param a O dividendo.
     * @param b O divisor.
     * @return O resultado da divisão.
     * @throws ArithmeticException se o divisor for zero.
     */
    public double dividir(double a, double b) {
        // Verifica se o divisor (b) é igual a zero
        if (b == 0) {
            // Se for zero, lança uma exceção do tipo ArithmeticException
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        
        // Se o divisor não for zero, realiza a divisão e retorna o resultado
        return a / b;
    }
}
