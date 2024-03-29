package school.sptech;

import java.util.Scanner;

public class Ex1CalculadoraMedia {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite a primeira nota:\n");
    Double nota1 = ler.nextDouble();
    System.out.println("Digite a segunda nota:\n");
    Double nota2 = ler.nextDouble();

    Double media = (nota1 * 0.4 + nota2 * 0.6);
    System.out.println("Média: " + String.format("%.1f", media));

  }
}
