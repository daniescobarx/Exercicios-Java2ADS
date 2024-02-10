package school.sptech;

public class ContadorVariado {
    public static void main(String[] args) {

        double valorTotal = 0;

        for(int i = 0; valorTotal <= 4.9; i++){
            valorTotal = (0.15 + valorTotal);
            System.out.printf("%.2f \n", valorTotal);
        }

    }
}
