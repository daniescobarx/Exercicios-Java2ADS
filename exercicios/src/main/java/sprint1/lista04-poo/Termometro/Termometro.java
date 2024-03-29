package Termometro;

public class Termometro {

    Double temperaturaAtual;
    Double tempMin;
    Double tempMax;

    void diminuiTemperatura(Double temperaturaDiminuindo){
        temperaturaAtual -= temperaturaDiminuindo;
        if(temperaturaAtual < tempMin){
            temperaturaAtual = tempMin;
        }
    }
    void aumentaTemperatura(Double temperaturaAumentando){
        temperaturaAtual += temperaturaAumentando;
        if(temperaturaAtual > tempMax){
            temperaturaAtual = tempMax;
        }
    }
    void exibeFahreinheit(){
        System.out.println("temperatura atual em Fahreinheit: %.2f".formatted(temperaturaAtual * 1.8 + 32));
    }

}
