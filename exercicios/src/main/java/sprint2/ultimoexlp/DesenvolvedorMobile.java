package school.sptech.especialistas;

import school.sptech.Dev;

public class DesenvolvedorMobile  extends Dev {

    private String plataforma;
    private String linguagem;
    private Integer horasPrototipacao;

    public DesenvolvedorMobile(String nome, Integer qtdHoras, Double valorHora, String plataforma, String linguagem, Integer horasPrototipacao) {
        super(nome, qtdHoras, valorHora);
        this.plataforma = plataforma;
        this.linguagem = linguagem;
        this.horasPrototipacao = horasPrototipacao;
    }

    public DesenvolvedorMobile() {
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + horasPrototipacao * 200;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public Integer getHorasPrototipacao() {
        return horasPrototipacao;
    }

    public void setHorasPrototipacao(Integer horasPrototipacao) {
        this.horasPrototipacao = horasPrototipacao;
    }

    @Override
    public String toString() {
        return """
            DesenvolvedorMobile{
                plataforma='%s',
                linguagem='%s',
                horasPrototipacao=%d,
                nome='%s',
                qtdHoras=%d,
                valorHora=%.2f
            } %s""".formatted(plataforma, linguagem, horasPrototipacao, nome, qtdHoras, valorHora, super.toString());

    }
}
