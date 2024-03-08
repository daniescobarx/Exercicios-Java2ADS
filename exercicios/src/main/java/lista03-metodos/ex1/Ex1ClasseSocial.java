package school.sptech.ex1;

import java.util.Scanner;

public class Ex1ClasseSocial {
    public static void main(String[] args) {
        Ex1ClasseSocialMetodos metodos = new Ex1ClasseSocialMetodos();
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua renda: ");
        Double renda = ler.nextDouble();

        Double qtdSalariosMinimos = metodos.calcularQtdSalariosMinimos(renda);
        String classe = metodos.classeSocial(qtdSalariosMinimos);

        System.out.println("Você recebe aproximadamente " + qtdSalariosMinimos + " salários-mínimos.");
        System.out.println("Você pertence a classe social: " + classe + ".");
    }
}
