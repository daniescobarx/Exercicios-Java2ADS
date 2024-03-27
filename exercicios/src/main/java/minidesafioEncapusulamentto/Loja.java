package minidesafioEncapusulamentto;

public class Loja {
    private String nomeLoja;
    private Integer qtdVendas = 0;
    private Integer qtdMetaVendas = 0;
    private  Double valorTotalVendas = 0.0;

    public Loja(String nomeLoja, Integer qtdVendas, Integer qtdMetaVendas, Double valorTotalVendas) {
        this.nomeLoja = nomeLoja;
        this.qtdVendas = qtdVendas;
        this.qtdMetaVendas = qtdMetaVendas;
        this.valorTotalVendas = valorTotalVendas;
    }

    public void realizarVenda(Double valorVenda){
        qtdVendas++;
        valorTotalVendas += valorVenda;
    }

    public void realizarVendaComDesconto(Double valorVenda, Double valorDesconto){
        valorVenda -= valorDesconto;
        realizarVenda(valorVenda);
    }

    public Boolean verificarMeta() {
        return qtdVendas >= qtdMetaVendas;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public Integer getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(Integer qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public Integer getQtdMetaVendas() {
        return qtdMetaVendas;
    }

    public void setQtdMetaVendas(Integer qtdMetaVendas) {
        this.qtdMetaVendas = qtdMetaVendas;
    }

    public Double getValorTotalVendas() {
        return valorTotalVendas;
    }

    public void setValorTotalVendas(Double valorTotalVendas) {
        this.valorTotalVendas = valorTotalVendas;
    }

    @Override
    public String toString() {
        return "Loja: " + nomeLoja +
                "\nQuantidade de vendas: " + qtdVendas +
                "\nMeta de vendas: " + qtdMetaVendas +
                "\nValor total de vendas: " + valorTotalVendas;
    }
}



