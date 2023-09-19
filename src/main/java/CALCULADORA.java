import java.util.Scanner;

public class CALCULADORA {

    public static void main(String[] args) {
        // Cria um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");

            // Lê a escolha do usuário como um número inteiro
            int escolha = scanner.nextInt();

            // Verifica se o usuário escolheu sair
            if (escolha == 5) {
                System.out.println("Encerrando a calculadora.");
                break; // Sai do loop
            }

            // Solicita ao usuário que digite os números para a operação
            System.out.println("Digite o primeiro número:");
            double numero1 = scanner.nextDouble();

            System.out.println("Digite o segundo número:");
            double numero2 = scanner.nextDouble();

            // Realiza a operação com base na escolha do usuário
            switch (escolha) {
                case 1:
                    Soma soma = new Soma();
                    // Exibe o resultado da soma
                    System.out.println("Resultado da soma: " + soma.somar((int) numero1, (int) numero2));
                    break;
                case 2:
                    Subtracao subtracao = new Subtracao();
                    // Exibe o resultado da subtração
                    System.out.println("Resultado da subtração: " + subtracao.subtrair((int) numero1, (int) numero2));
                    break;
                case 3:
                    Multiplicacao multiplicacao = new Multiplicacao();
                    // Exibe o resultado da multiplicação
                    System.out.println("Resultado da multiplicação: " + multiplicacao.multiplicar((int) numero1, (int) numero2));
                    break;
                case 4:
                    try {
                        Divisao divisao = new Divisao();
                        // Exibe o resultado da divisão
                        System.out.println("Resultado da divisão: " + divisao.dividir(numero1, numero2));
                    } catch (ArithmeticException e) {
                        // Trata exceção de divisão por zero
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                default:
                    // Se o usuário escolher uma opção inválida
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }
}
