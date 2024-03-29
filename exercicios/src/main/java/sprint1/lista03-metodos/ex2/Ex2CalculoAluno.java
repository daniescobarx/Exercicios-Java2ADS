package school.sptech.ex2;

import java.util.Scanner;

public class Ex2CalculoAluno {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("digite a primeira nota");
    Double nota1 = ler.nextDouble();

    System.out.println("digite a segunda nota");
    Double nota2 = ler.nextDouble();

    double mediaFinal = Ex2CalculoAlunoMetodos.calcularMedia( nota1, nota2);

    System.out.println("Média: "+mediaFinal);

  }
}
