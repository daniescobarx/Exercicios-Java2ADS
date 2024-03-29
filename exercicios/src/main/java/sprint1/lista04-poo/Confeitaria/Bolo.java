package Confeitaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bolo {
    Scanner lerTexto = new Scanner(System.in);
    Scanner lerValor = new Scanner(System.in);

    Double valor;
    String sabor;
    Integer quantidadeVendida;
    void comprarBolo(){

            System.out.println("Digite o sabor do bolo:");
            sabor = lerTexto.nextLine();

            System.out.println("Digite o valor:");
            valor = lerValor.nextDouble();

            System.out.println("Digite a quantidade:");
            quantidadeVendida = lerValor.nextInt();

            switch (sabor) {
                case "Morango":
                case "Chocolate":
                case "Abacaxi":
                    break;
                default:
                    System.out.println("Sabor inválido! Escolha entre: Morango, Chocolate ou Abacaxi");
            }

        if(quantidadeVendida > 100){
            System.out.println("O Pedido ultrapassou o limite diário para este bolo.");
        }else{
            quantidadeVendida += quantidadeVendida;
        }

        if(valor < 50 || valor > 30){
            System.out.println("Valor inválido! Escolha um valor entre 30 e 50.");
            return;
        }

    }
    void exibirRelatorio(){
        System.out.println("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$%.2f".formatted(sabor, quantidadeVendida, (valor * quantidadeVendida)));
    }

}


