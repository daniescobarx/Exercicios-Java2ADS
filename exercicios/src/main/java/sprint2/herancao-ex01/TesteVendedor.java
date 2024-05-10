package school.sptech;

public class TesteVendedor {

  public static void main(String[] args) {
    VendedorComissao vendedorComissao = new VendedorComissao(1, "Ana", 5000.0, 0.1);
    Double salarioVendedorComissao = vendedorComissao.calcularSalario();
    System.out.println("Salário do vendedor comissão: " + salarioVendedorComissao);

    VendedorComissaoMaisFixo vendedorComissaoMaisFixo = new VendedorComissaoMaisFixo(2, "Maria", 8000.0, 0.08, 2000.0);
    Double salarioVendedorComissaoMaisFixo = vendedorComissaoMaisFixo.calcularSalario();
    System.out.println("Salário do vendedor comissão mais fixo: " + salarioVendedorComissaoMaisFixo);
  }
}
