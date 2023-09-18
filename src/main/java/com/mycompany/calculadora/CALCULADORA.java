import java.util.Scanner;

public class CALCULADORA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();

            if (escolha == 5) {
                System.out.println("Encerrando a calculadora.");
                break;
            }

            System.out.println("Digite o primeiro número:");
            double numero1 = scanner.nextDouble();

            System.out.println("Digite o segundo número:");
            double numero2 = scanner.nextDouble();

            switch (escolha) {
                case 1:
                    Soma soma = new Soma();
                    System.out.println("Resultado da soma: " + soma.somar((int) numero1, (int) numero2));
                    break;
                case 2:
                    Subtracao subtracao = new Subtracao();
                    System.out.println("Resultado da subtração: " + subtracao.subtrair((int) numero1, (int) numero2));
                    break;
                case 3:
                    Multiplicacao multiplicacao = new Multiplicacao();
                    System.out.println("Resultado da multiplicação: " + multiplicacao.multiplicar((int) numero1, (int) numero2));
                    break;
                case 4:
                    try {
                        Divisao divisao = new Divisao();
                        System.out.println("Resultado da divisão: " + divisao.dividir(numero1, numero2));
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
