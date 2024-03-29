package school.sptech;
public class Potencia {
    public static void main(String[] args) {
        Integer b = 4;
        Integer e = 3;

        int resultado = 1;

        for (int i = 0; i < e; i++ ){
            resultado *= b;
        }
        System.out.println("Resultado: "+ resultado);
    }
}
