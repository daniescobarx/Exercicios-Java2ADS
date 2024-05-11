package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public Carrinho(){}

    public Integer getQuantidade(){
        return this.produtos.size();
    }

    public void adicionar(Produto p){
        this.produtos.add(p);
    }

    public Boolean existsPorNome(String nome){
        for (Produto produto : produtos){
            if (produto.getNome().equalsIgnoreCase(nome)){
                return true;
            }
        }
        return false;
    }

    public Integer getQuantidadePorCategoria(String categoria){
        Integer quantidade = 0;
        for (Produto produto : produtos){
            if (produto.getCategoria().equalsIgnoreCase(categoria)){
                quantidade++;
            }
        }
        return quantidade;
    }

    public void limpar(){
        produtos.clear();
    }

    public void removerPorNome(String nome){
        for (Produto produto : produtos){
            if (produto.getNome().equalsIgnoreCase(nome)){
                produtos.remove(produto);
                break;
            }
        }
    }

    public Produto getPorNome(String nome){
        for (Produto produto : produtos){
            if (produto.getNome().equalsIgnoreCase(nome)){
                return produto;
            }
        }
        return null;
    }

    public Double getValorTotal(){
        Double total = 0.0;
        for (Produto produto : produtos){
            total+= produto.getPreco();
        }
        return total;
    }


}
