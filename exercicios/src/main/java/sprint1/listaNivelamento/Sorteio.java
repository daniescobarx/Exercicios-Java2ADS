package school.sptech;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Integer numeroSorte = 7;
        Integer sorteado;
        //inicia null para ser atribuido apenas uma vez;
        Integer posicao = null;
        Integer numerosPares = 0;
        Integer numerosImpares = 0;

        for (int i = 0; i <=200; i ++){
            sorteado = ThreadLocalRandom.current().nextInt(1, 100);
            if (sorteado.equals(numeroSorte) && posicao == null){
                posicao = i;
            }
            if (sorteado% 2 == 0){
                numerosPares++;
            }else{
                numerosImpares++;
            }
        }
        System.out.println("O numero da sorte foi sorteado pela primeira vez na "+ posicao+"º tentativa");
        System.out.println("Quantidade de números pares: "+ numerosPares);
        System.out.println("Quantidade de números impares: "+numerosImpares);

    }
}
