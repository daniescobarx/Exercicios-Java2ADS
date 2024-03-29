package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3ListaFrutas {
  public static void main(String[] args) {
    List<String> listaFrutas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome da fruta 1:");
    String fruta = scanner.nextLine();
    int contador = 1;

    while (!fruta.equals("0")) {
      listaFrutas.add(fruta);
      contador++;
      System.out.println("Digite o nome da fruta " + contador + ":");
      fruta = scanner.nextLine();
    }

    System.out.println("Digite um nome para pesquisar:");
    String frutaPesquisada = scanner.nextLine();

    boolean encontrada = false;

    for (int i = 0; i < listaFrutas.size(); i++) {
      String frutaLista = listaFrutas.get(i);
      if (frutaLista.equals(frutaPesquisada)) {
        encontrada = true;
        break;
      }
    }

    if (encontrada) {
      System.out.println("A fruta " + frutaPesquisada + " existe na lista");
    } else {
      System.out.println("Não existe a fruta " + frutaPesquisada + " na lista");
    }
  }
}
