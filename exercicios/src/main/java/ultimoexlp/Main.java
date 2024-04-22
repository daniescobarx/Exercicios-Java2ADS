package school.sptech;

import school.sptech.Consultoria;
import school.sptech.especialistas.DesenvolvedorMobile;
import school.sptech.especialistas.DesenvolvedorWeb;
import school.sptech.Dev;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Consultoria consultoria = new Consultoria("Tech Solutions", 1000);

    Dev dev1 = new Dev("João", 160, 50.0);
    Dev dev2 = new DesenvolvedorWeb("Maria", 160, 60.0, "Java", "Angular", "MySQL", 10);
    Dev dev3 = new DesenvolvedorMobile("Pedro", 160, 55.0, "Android", "Java", 15);

    consultoria.contratar(dev1);
    consultoria.contratarFullStack((DesenvolvedorWeb) dev2);
    consultoria.contratar(dev3);

    System.out.println("Total de salários: " + consultoria.getTotalSalarios());
    System.out.println("Quantidade de desenvolvedores mobile: " + consultoria.qtdDesenvolvedoresMobile());
    System.out.println("Desenvolvedor com menor salário: " + consultoria.buscarMenorSalario());

    List<Dev> devsComSalarioMaiorQue5000 = consultoria.buscarPorSalarioMaiorQue(5000.0);
    System.out.println("Desenvolvedores com salário maior que 5000: " + devsComSalarioMaiorQue5000);

    List<Dev> devsJava = consultoria.buscarPorTecnologia("Java");
    System.out.println("Desenvolvedores que trabalham com Java: " + devsJava);

    double totalSalariosJava = consultoria.getTotalSalariosPorTecnologia("Java");
    System.out.println("Total de salários dos desenvolvedores que trabalham com Java: " + totalSalariosJava);
  }
}
