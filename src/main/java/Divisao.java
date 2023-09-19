public class Divisao {
    // Método para realizar a divisão de dois números
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
