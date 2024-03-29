package revisaometodos;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.List;

public class TesteVendas {
    public static void main(String[] args) {
        RelatorioMetodos metodos = new RelatorioMetodos();

        List<Double> precos = new ArrayList<>();
        precos.add(10.0);
        precos.add(12.0);
        precos.add(13.0);
        precos.add(15.0);
        precos.add(16.0);
        precos.add(17.0);
        precos.add(18.0);
        precos.add(19.0);
        precos.add(20.0);
        precos.add(21.0);

        Double precoFiltro = 15.0;

        Integer quantidadeVendas = metodos.buscarQuantidadeVendas(precos);
        System.out.println("Quantidade de precos/vendas: " + quantidadeVendas);

        Double totalVendas = metodos.somarVendas(precos);
        System.out.println("Total de vendas: " + totalVendas);

        Boolean existe = metodos.buscarPreco(precos);
        System.out.println(existe);

        Double maiorPreco = metodos.buscarPrecoMaior(precos);
        System.out.println("Preço maior: "+ maiorPreco);

        Double menorPreco = metodos.buscarPrecoMenor(precos);
        System.out.println("Preço menor: "+ menorPreco);

        List<Double> precosdofiltro = metodos.buscarPorPrecoMin(precos, precoFiltro);
        System.out.println("Precos acima do minimo (15.0): "+precosdofiltro);

//        metodos.exibirMinimo(precosdofiltro);


    }
}
