package school.sptech;

public class TesteCarrinho {

    public static void main(String[] args) {
        Produto banana = new Produto("banana", "fruta", 5.0);
        Produto maça = new Produto("maçã", "fruta", 3.0);
        Produto abacaxi = new Produto("abacaxi", "fruta", 7.0);
        Produto pao = new Produto("pão", "padaria", 2.5);

        Carrinho carrinhoJoao = new Carrinho("João");

        carrinhoJoao.adicionar(banana);
        carrinhoJoao.adicionar(maça);
        carrinhoJoao.adicionar(abacaxi);
        carrinhoJoao.adicionar(pao);

        System.out.println("Quantidade de produtos no carrinho: " + carrinhoJoao.getQuantidade());
        System.out.println("Quantidade de produtos da categoria 'fruta' no carrinho: " + carrinhoJoao.getQuantidadePorCategoria("fruta"));
        System.out.println("Valor total do carrinho: " + carrinhoJoao.getValorTotal());

        carrinhoJoao.removerPorNome("banana");

        System.out.println("Novo valor total do carrinho após remover a banana: " + carrinhoJoao.getValorTotal());

        System.out.println("Existe um produto com o nome 'abacaxi' no carrinho? " + carrinhoJoao.existsPorNome("abacaxi"));

        carrinhoJoao.limpar();

        System.out.println("Quantidade de produtos no carrinho após limpar: " + carrinhoJoao.getQuantidade());
    }
}
