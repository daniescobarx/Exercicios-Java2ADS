package school.sptech;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4DesafioNumeros {
  public static void main(String[] args) {
    List<Integer> listaNumeros = new ArrayList<>();
    List<Integer> listaPar = new ArrayList<>();
    List<Integer> listaImpar = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite 1° Número:");
    Integer numero = sc.nextInt();
    int contador = 1;

    while (!numero.equals(0)){
      listaNumeros.add(numero);
      contador++;
      System.out.println("Digite "+contador+"° Número:");
      numero = sc.nextInt();
    }

    for (int i = 0; i < listaNumeros.size(); i++) {
      Integer num = listaNumeros.get(i);
      if (num % 2 == 0) {
        listaPar.add(num);
      } else {
        listaImpar.add(num);
      }
    }

    int soma = 0;
    int menor = listaNumeros.get(0);
    int maior = listaNumeros.get(0);

    for (int i = 0; i < listaNumeros.size(); i++) {
      Integer num = listaNumeros.get(i);
      soma += num;
      if (num < menor) {
        menor = num;
      }
      if (num > maior) {
        maior = num;
      }
    }

    System.out.print("Pares: ");
    for (int i = 0; i < listaPar.size(); i++) {
      System.out.print(listaPar.get(i));
      if (i < listaPar.size() - 1) {
        System.out.print(", ");
      }
    }
    System.out.println();

    System.out.print("Ímpares: ");
    for (int i = 0; i < listaImpar.size(); i++) {
      System.out.print(listaImpar.get(i));
      if (i < listaImpar.size() - 1) {
        System.out.print(", ");
      }
    }
    System.out.println();

    System.out.println("Soma: " + soma);
    System.out.println("Menor número: " + menor);
    System.out.println("Maior número: " + maior);
  }
}
