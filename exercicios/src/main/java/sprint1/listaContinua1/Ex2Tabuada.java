package school.sptech;

import java.util.Scanner;

public class Ex2Tabuada {

  public static void main(String[] args) {
    System.out.println("-----------------------------------------");
    System.out.println("----------Selecione a Operação-----------");
    System.out.println("1 - Soma---------------------------------");
    System.out.println("2 - Multiplicaçao------------------------");
    System.out.println("3 - Divisão------------------------------");
    System.out.println("4 - Subtraçao----------------------------");
    System.out.println("5 - Potenciacao--------------------------");
    System.out.println("6 - Resto de divisao---------------------\n");

    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o número correspondente a operação desejada:");
    Integer operacao = ler.nextInt();
    System.out.println("Digite um número inteiro");
    Integer numeroInt = ler.nextInt();

    if (operacao.equals(1)) {
      for (int i = 1; i <= 10; i++) {
        Integer resultado = numeroInt + i;
        System.out.println(numeroInt + " + " + i + " = " + resultado);
      }
    }else if (operacao.equals(2)) {
      for (int i = 1; i <= 10; i++) {
        Integer resultado = numeroInt * i;
        System.out.println(numeroInt + " * " + i + " = " + resultado);
      }
    } else if (operacao.equals(3)) {
      for (int i = 1; i <= 10; i++) {
        Integer resultado = numeroInt / i;
        System.out.println(numeroInt + " / " + i + " = " + resultado);
      }
    }else if (operacao.equals(4)) {
      for (int i = 1; i <= 10; i++) {
        Integer resultado = numeroInt - i;
        System.out.println(numeroInt + " - " + i + " = " + resultado);
      }
    }else if (operacao == 5) {
      for (int i = 1; i <= 10; i++) {
        double resultado = Math.pow(numeroInt, i);
        System.out.println(numeroInt + " ^ " + i + " = " + resultado);
      }
    }else if (operacao.equals(6)) {
      for (int i = 1; i <= 10; i++) {
        Integer resultado = numeroInt % i;
        System.out.println(numeroInt + " % " + i + " = " + resultado);
      }
    }else{
      System.out.println("selecione uma operação valida");
      return;
    }
  }
}