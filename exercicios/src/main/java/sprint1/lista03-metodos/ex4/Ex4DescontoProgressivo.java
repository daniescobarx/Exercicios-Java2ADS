package school.sptech.ex4;

import java.util.Scanner;

public class Ex4DescontoProgressivo {

  public static void main(String[] args) {
    Ex4DescontoProgressivoMetodos metodo = new Ex4DescontoProgressivoMetodos();
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite o valor unitário do produto");
    Double vUnitario = ler.nextDouble();

    System.out.println("Digite a quantidade");
    Integer quantidade = ler.nextInt();

    double valorComDesconto = metodo.calcularDesconto(vUnitario, quantidade);

    metodo.exibirNotaFiscal(vUnitario, quantidade, valorComDesconto);
  }
}
