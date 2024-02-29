package revisaometodos;

import java.util.ArrayList;
import java.util.List;



public class RelatorioMetodos {
    Integer buscarQuantidadeVendas(List<Double> precos){
        return precos.size();
    }

    Double somarVendas(List<Double> precos){
        double total = 0.0;
        for (int i = 0; i < precos.size(); i++){
            total+= precos.get(i);
        }
        return total;
    }

    boolean buscarPreco(List<Double> precos){
        double precoBuscar = 20.0;
        boolean existe = false;

        for (int i = 0; i < precos.size(); i++){
            if (precos.get(i).equals(precoBuscar)){
                existe = true;
                return existe;
            }
        }
        return existe;
    }

    Double buscarPrecoMaior(List<Double> precos){
        double maiorPreco = precos.get(0);
        for (int i = 0; i < precos.size(); i++){
            double precoAtual = precos.get(i);
            if (precoAtual > maiorPreco){
                maiorPreco = precoAtual;
            }
        }
        return maiorPreco;
    }

    Double buscarPrecoMenor(List<Double> precos){
        double menorPreco = precos.get(0);
        for (int i = 0; i < precos.size(); i++){
            double precoAtual = precos.get(i);
            if (precoAtual < menorPreco){
                menorPreco = precoAtual;
            }
        }
        return menorPreco;
    }

  List<Double> buscarPorPrecoMin(List<Double> precos, Double precoFiltro){
       List<Double> precosFiltrados = new ArrayList<>();
       for (int i = 0; i < precos.size(); i++){
           if (precos.get(i) >= precoFiltro){
               precosFiltrados.add(precos.get(i));
           }
       }
      return precosFiltrados;
  }

//  void exibirMinimo(List<Double> precosFiltrados){
//        for (int i = 0 ; i < precosFiltrados.size(); i++){
//            System.out.println("precos: " +  precosFiltrados.get(i));
//        }
//  }
}
