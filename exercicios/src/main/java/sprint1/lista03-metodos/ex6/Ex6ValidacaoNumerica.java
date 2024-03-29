package school.sptech.ex6;

import java.util.Scanner;

public class Ex6ValidacaoNumerica {

  public static void main(String[] args) {
    Ex6ValidacaoNumericaMetodos metodos = new Ex6ValidacaoNumericaMetodos();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Digite um número:");
      Integer numero = scanner.nextInt();

      if (numero < 0) {
        System.out.println("Fim da execução");
        break;
      }

      metodos.verificarPrimo(numero);

    }
  }
  }

