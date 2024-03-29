package listaNivelamento;

import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {
    public static void main(String[] args) {
        Integer numeroSorteado;
        Integer soma = 0;
        Integer numeroDaSorte= 0;

        do{
            numeroSorteado = ThreadLocalRandom.current().nextInt(0,11);
            System.out.println(numeroSorteado);
            soma+= numeroSorteado;
        } while (!numeroSorteado.equals(numeroDaSorte));
        System.out.println("A soma dos números é: "+soma);
    }
}

