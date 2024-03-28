package school.sptech.ex1;

public class TesteRecursosHumanos {

  public static void main(String[] args) {
    RecursosHumanos rh = new RecursosHumanos();
    Colaborador colaborador1 = new Colaborador("Isaac", "Consultor SAP", 1800.0);

    rh.promover(colaborador1, "Engenheiro de Software", 5000.0);
    rh.reajustarSalario(colaborador1, 10.0);

    System.out.println(colaborador1.getNome());
    System.out.println(colaborador1.getCargo());
    System.out.println(colaborador1.getSalario());
  }
}
