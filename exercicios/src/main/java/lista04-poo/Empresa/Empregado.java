package Empresa;

public class Empregado {
    String nome;
    Double salario;
    String cargo;
    void reajustarSalario (Integer porcentagemReajuste){
        System.out.println("""
                Nome: %s
                
                Salario: %.2f
                
                Cargo: %s""".formatted(nome, salario * 1.15, cargo));
    }
}
