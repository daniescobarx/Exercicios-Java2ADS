package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {
        Integer numeroEscolhido = ThreadLocalRandom.current().nextInt(0, 11);
        System.out.println("Número escolhido: "+numeroEscolhido);

        Integer tentativas = 0;
        int soma = 0;
        int numeroSorteado;

       do{
           numeroSorteado = ThreadLocalRandom.current().nextInt(0,11);
           soma+=numeroSorteado;
           System.out.println("Número sorteado: "+
                   numeroSorteado);
           tentativas+=1;
       }while (numeroSorteado!=numeroEscolhido);

        if (tentativas <= 3) {
            System.out.println("Você é MUITO sortudo");
        } else if (tentativas >= 4 && tentativas <= 10) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
        System.out.println("A soma dos numeros é "+soma);
    }
}
