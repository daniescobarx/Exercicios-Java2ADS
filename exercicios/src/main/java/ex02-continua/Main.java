package school.sptech;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    GerenciadorDeNotas metodo = new GerenciadorDeNotas();

    List<Double> notas = metodo.lerNotas();

    Double media = metodo.calcularMedia(notas);
    System.out.println(media);

    Boolean resultado = metodo.verificarResultado(media);
    System.out.println(resultado);

  }
}