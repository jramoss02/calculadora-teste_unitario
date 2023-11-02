# Calculadora teste unitario
![TESTE](https://github.com/jramoss02/calculadora-teste_unitario/assets/77749469/a91d8569-dc98-4ef2-a90d-07f5c269b867)

> Demonstração do projeto.

## 🖊️ Introdução

Este é um projeto de calculadora simples em Java que permite realizar operações de soma, subtração, multiplicação e divisão entre dois números. A calculadora é executada a partir de um programa principal, que interage com o usuário por meio de um menu de escolha de operações.

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:

* Versão mais recente instalada das linguagens e ferramentas: `<Javascript>`
* Você tem uma máquina `<Windows / Linux / Mac>`

## 🛠️ Construído com


* [Netbeans](https://netbeans.apache.org/) - IDE utilizada.
* [Java](https://www.java.com/pt-BR/) - Linguagem de programação utilizada.
* [JUnit](https://junit.org/junit5/) - Framework.


# 📄 Documentação da Calculadora Java

## Classe Principal (Calculadora.java)

### `public class CALCULADORA`

A classe principal que contém o método `main` para executar a calculadora. É responsável por exibir o menu de operações, receber a escolha do usuário e executar as operações selecionadas.

#### Métodos

- `public static void main(String[] args)`: O método principal da aplicação. Ele exibe um menu para o usuário e direciona as operações com base na escolha do usuário.

## Classes de Operações

### `public class Divisao`

Uma classe que lida com operações de divisão. Ela possui um método para realizar a divisão de dois números.

#### Métodos

- `public double dividir(double a, double b)`: Realiza a divisão dos números `a` e `b` e retorna o resultado. Lança uma exceção `ArithmeticException` se o divisor for zero.

### `public class Multiplicacao`

Uma classe que lida com operações de multiplicação. Ela possui um método para realizar a multiplicação de dois números inteiros.

#### Métodos

- `public int multiplicar(int a, int b)`: Realiza a multiplicação dos números inteiros `a` e `b` e retorna o resultado.

### `public class Soma`

Uma classe que lida com operações de soma. Ela possui um método para realizar a soma de dois números inteiros.

#### Métodos

- `public int somar(int a, int b)`: Realiza a soma dos números inteiros `a` e `b` e retorna o resultado.

### `public class Subtracao`

Uma classe que lida com operações de subtração. Ela possui um método para realizar a subtração de dois números inteiros.

#### Métodos

- `public int subtrair(int a, int b)`: Realiza a subtração dos números inteiros `a` e `b` e retorna o resultado.

## Classe de Teste (CALCULADORAJUNITTEST.java)

### `public class CALCULADORAJUNITTEST`

Uma classe de teste JUnit para testar as operações de soma, subtração, multiplicação e divisão das classes correspondentes.

#### Métodos de Teste

- `public void SomaTest()`: Teste para a operação de soma, verificando se a soma de dois números inteiros está correta.
- `public void testDivisao()`: Teste para a operação de divisão, verificando se a divisão de dois números está correta e se uma exceção é lançada corretamente em caso de divisão por zero.
- `public void testMultiplicacao()`: Teste para a operação de multiplicação, verificando se a multiplicação de dois números inteiros está correta.
- `public void testSubtracao()`: Teste para a operação de subtração, verificando se a subtração de dois números inteiros está correta.

## 🤝 Colaboradores

Pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/77749469?v=4" width="100px;"/><br>
        <sub>
          <b>José Ramos</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
