package school.sptech.ex4;

public class Ex4DescontoProgressivoMetodos {

    // Coloque os métodos aqui
    public double calcularDesconto(Double vUnitario, Integer quantidade) {
        Double desconto = 0.0;
        if (quantidade == 1) {
            desconto = vUnitario * 0.1;
        } else if (quantidade == 2) {
            desconto = vUnitario * 0.2;
        } else if (quantidade >= 3) {
            desconto = vUnitario * 0.3;
        }
        return vUnitario - desconto;
    }
    public static void exibirNotaFiscal(Double vUnitario, Integer quantidade, Double valorComDesconto) {
        System.out.println("------------------------------");
        System.out.println("Valor do produto: R$" + vUnitario);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("------------------------------");
        System.out.println("Valor com desconto: R$" + valorComDesconto);
    }
}