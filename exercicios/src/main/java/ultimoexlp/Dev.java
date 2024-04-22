package school.sptech;

public class Dev {
    protected String nome;
    protected Integer qtdHoras;
    protected Double valorHora;

    public Dev(String nome, Integer qtdHoras, Double valorHora) {
        this.nome = nome;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    public Dev() {
    }


    public Double calcularSalario(){
        return qtdHoras * valorHora;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return """
                Dev{
                nome = %s
                qtdHoras = %d
                valorHora = %.2f
                }""".formatted(nome,qtdHoras,valorHora);
    }
}
