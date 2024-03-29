package school.sptech.ex6;
public class Ex6ValidacaoNumericaMetodos {

    public void verificarPrimo(Integer numero) {
        if (numero <= 1) {
            System.out.println("Não é primo");
            return;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                System.out.println("Não é primo");
                return;
            }
        }

        System.out.println("É primo");
    }
}
