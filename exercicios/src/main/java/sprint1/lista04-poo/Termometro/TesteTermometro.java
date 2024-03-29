package Termometro;

public class TesteTermometro {
    public static void main(String[] args) {

        Termometro termometro = new Termometro();
        termometro.temperaturaAtual = 18.5;
        termometro.tempMin = 2.1;
        termometro.tempMax = 51.9;

        termometro.aumentaTemperatura(9.1);
        System.out.println(termometro.temperaturaAtual);

        termometro.diminuiTemperatura(5.2);
        System.out.println(termometro.temperaturaAtual);

        termometro.exibeFahreinheit();
    }
}
