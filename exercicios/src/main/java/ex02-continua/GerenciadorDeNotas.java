package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeNotas {
    Scanner ler = new Scanner(System.in);

    List<Double> lerNotas() {
        System.out.println("Digite o numero de notas");
        Integer qtdNotas = ler.nextInt();

        List<Double> notas = new ArrayList<>();

        if (qtdNotas < 1) {
            System.out.println("Quantidade inválida de notas.");
            return notas;
        }

        System.out.println("Insira as notas: ");
        for (int i = 0; i < qtdNotas; i++) {
            notas.add(ler.nextDouble());
        }

        return notas;
    }

    Double calcularMedia(List<Double> notas) {
        Double soma = 0.0;
        if (notas == null){
            return null;
        }
        for (int i = 0; i < notas.size(); i++) {
            soma += notas.get(i);
        }
        Double media = soma / notas.size();
        return media;
    }

    Boolean verificarResultado(Double media) {
        if (media == null || media <= 0) {
            return null;
        }

        if (media >= 7.0) {
             System.out.println("Aprovado");
            return true;
        }
        return false;
    }





}
