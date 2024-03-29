package Empresa;

public class TesteEmpregado {
    public static void main(String[] args) {

        Empregado empregado1 = new Empregado();
        empregado1.nome = "Isaac";
        empregado1.salario = 31441.1;
        empregado1.cargo = "Consultor SAP";
        empregado1.reajustarSalario(8);

        Empregado empregado2 = new Empregado();
        empregado2.nome = "Guilherme";
        empregado2.salario = 5668.7;
        empregado2.cargo = "Analista de Sistemas - QA";
        empregado2.reajustarSalario(17);
    }
}
