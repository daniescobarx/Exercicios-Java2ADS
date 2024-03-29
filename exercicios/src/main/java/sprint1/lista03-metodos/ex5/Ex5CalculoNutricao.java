package school.sptech.ex5;

import java.util.Scanner;

public class Ex5CalculoNutricao {

  public static void main(String[] args) {
    Ex5CalculoNutricaoMetodos metodo = new Ex5CalculoNutricaoMetodos();

    Scanner ler = new Scanner(System.in);

    System.out.println("Digite o peso");
    Double peso = ler.nextDouble();

    System.out.println("Digite a altura");
    Double altura = ler.nextDouble();

 metodo.calculaIMC(peso, altura);


  }
}
