package school.sptech.ex3;

import java.util.Scanner;

public class Ex3Idade {

  public static void main(String[] args) {
    Ex3IdadeMetodos metodo = new Ex3IdadeMetodos();
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite a idade: ");
    Integer idadeUsuario = ler.nextInt();

    metodo.classificaIdade(idadeUsuario);

  }
}
