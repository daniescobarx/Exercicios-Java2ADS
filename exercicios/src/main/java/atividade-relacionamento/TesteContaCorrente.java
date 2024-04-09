package school.sptech;

import java.util.List;

public class TesteContaCorrente {

  public static void main(String[] args) {
    ContaCorrente conta1 = new ContaCorrente("dani", "1234", "56789");

    conta1.adicionarOperacao("investimento", "guardar dinheiro", 100.0);
    conta1.adicionarOperacao("compras", "compra de mercado", -20.0);
    conta1.adicionarOperacao("salario", "recebimento de salário", 2000.0);

    //por categoria
    System.out.println("Operações de investimento: ");
    List<OperacaoBancaria> operacoesInvestimento = conta1.buscarOperacoesPorCategoria("investimento");
    for (OperacaoBancaria operacaoBancaria : operacoesInvestimento){
      System.out.println(operacaoBancaria);
    }

    //por valor
    System.out.println("\nOperações de valor igual a 2000,00");
    List<OperacaoBancaria> operacaoValor = conta1.buscarOperacoesPorValor(2000.0);
    for (OperacaoBancaria operacaoBancaria : operacaoValor){
      System.out.println(operacaoBancaria);
    }

    //por operacoes de saida
    System.out.println("\nOperações de saída");
    List<OperacaoBancaria> operacaoSaida = conta1.buscarOperacoesSaida();
    for (OperacaoBancaria operacaoBancaria : operacaoSaida){
      System.out.println(operacaoBancaria);
    }

    //por operacoes de entrada
    System.out.println("\n Operações de entrada:");
    List<OperacaoBancaria> operacoesEntrada = conta1.buscarOperacoesEntrada();
    for (OperacaoBancaria operacaoBancaria : operacoesEntrada){
      System.out.println(operacaoBancaria);
    }

    //maior valor
    System.out.println("\nMaior valor de operação: "+conta1.buscarMaiorValor());
    System.out.println("\nMenor valor de operação: "+conta1.buscarMenorValor());

    //saldo
    System.out.println("Saldo da conta: "+ conta1.obterSaldo());

  }
}