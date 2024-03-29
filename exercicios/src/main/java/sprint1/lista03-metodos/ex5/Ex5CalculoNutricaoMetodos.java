package school.sptech.ex5;

public class Ex5CalculoNutricaoMetodos {
    void calculaIMC(Double peso, Double altura){
      //IMC = Peso ÷ (Altura × Altura)
      Double imc = peso/(altura* altura);

        String imcFormatado = String.format("%.2f", imc);
        System.out.println("O IMC é " + imcFormatado);
    }
}
