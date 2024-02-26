package school.sptech;

public class CalculadoraTroco {
    public static void main(String[] args) {
        Double valorProduto = 9.50;
        Integer qtdProduto = 2;
        Double valorPago = 30.0;
        Double valorTotal = valorProduto*qtdProduto;
        Double troco = valorPago - valorTotal;

        System.out.println("Seu troco será de R$ "+troco);
    }
}
