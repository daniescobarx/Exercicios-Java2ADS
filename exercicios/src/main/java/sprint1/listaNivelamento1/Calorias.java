package school.sptech;

public class Calorias {
    public static void main(String[] args) {

        int minAquecendo = 5;
        int minAerobico = 20;
        int minMusculacao = 30;

        int calcCalorias = (minAquecendo * 12) + (minAerobico * 20) + (minMusculacao * 25);
        int calcMin = minAquecendo + minAerobico + minMusculacao;

        System.out.println("Olá, Jorge. Você fez um total de " + calcMin + " minutos de exercícios e perdeu cerca de " + calcCalorias + " calorias.");
    }
}