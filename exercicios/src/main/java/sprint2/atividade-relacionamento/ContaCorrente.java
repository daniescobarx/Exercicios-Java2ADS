package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    private String titular;
    private String agencia;
    private String numero;
    private List<OperacaoBancaria> operacoes;

    public ContaCorrente(String titular, String agencia, String numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        operacoes = new ArrayList<>();
    }
    public ContaCorrente(){}

    public void adicionarOperacao(String categoria, String descricao, Double valor) {
        if (categoria == null || categoria.trim().isEmpty() || descricao == null || descricao.trim().isEmpty()) {
            System.out.println("Erro: Categoria ou descrição inválida");
            return;
        }
        if (valor == null || valor == 0.0) {
            System.out.println("Erro: Valor da operação inválido, nulo ou 0");
            return;
        }

        OperacaoBancaria novaOperacao = new OperacaoBancaria(categoria, descricao, valor);
        operacoes.add(novaOperacao);
    }


    public List<OperacaoBancaria> buscarOperacoesPorCategoria(String categoria) {
        List<OperacaoBancaria> Encontradas = new ArrayList<>();

        for (OperacaoBancaria operacao : operacoes) {
            if (operacao.getCategoria().equalsIgnoreCase(categoria)) {
                Encontradas.add(operacao);
            }
        }
        return Encontradas;
    }

    public List<OperacaoBancaria> buscarOperacoesPorValor(Double valor) {
        List<OperacaoBancaria> Encontradas = new ArrayList<>();
        for (OperacaoBancaria operacao : operacoes) {
            if (operacao.getValor().equals(valor)) {
                Encontradas.add(operacao);
            }
        }
        return Encontradas;
    }

    public List<OperacaoBancaria> buscarOperacoesSaida() {
        List<OperacaoBancaria> Saida = new ArrayList<>();
        for (OperacaoBancaria operacao : operacoes) {
            if (operacao.getValor() < 0) {
                Saida.add(operacao);
            }
        }
        return Saida;
    }

    public List<OperacaoBancaria> buscarOperacoesEntrada() {
        List<OperacaoBancaria> Entrada = new ArrayList<>();
        for (OperacaoBancaria operacao : operacoes) {
            if (operacao.getValor() > 0) {
                Entrada.add(operacao);
            }
        }
        return Entrada;
    }

    public List<OperacaoBancaria> buscarOperacoesPorDescricao(String descricao) {
        List<OperacaoBancaria> operacoesEncontradas = new ArrayList<>();
        if (descricao == null) {
            System.out.println("descrição inválida");
            return operacoesEncontradas;
        }
        for (OperacaoBancaria operacao : operacoes) {
            if (operacao.getDescricao() != null && operacao.getDescricao().toLowerCase().contains(descricao.toLowerCase())) {
                operacoesEncontradas.add(operacao);
            }
        }
        return operacoesEncontradas;
    }


    public Double buscarMaiorValor() {
        if (operacoes.isEmpty()) {
            return 0.0;
        }

        double maiorValor = operacoes.get(0).getValor();
        for (OperacaoBancaria operacao : operacoes) {
            if (operacao.getValor() > maiorValor) {
                maiorValor = operacao.getValor();
            }
        }
        return maiorValor;
    }

    public Double buscarMenorValor() {
        if (operacoes.isEmpty()) {
            return 0.0;
        }

        double menorValor = operacoes.get(0).getValor();
        for (OperacaoBancaria operacao : operacoes) {
            if (operacao.getValor() < menorValor) {
                menorValor = operacao.getValor();
            }
        }
        return menorValor;
    }

    public Double obterSaldo() {
        double saldo = 0.0;
        for (OperacaoBancaria operacao : operacoes) {
            saldo += operacao.getValor();
        }
        return saldo;
    }



    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


}
