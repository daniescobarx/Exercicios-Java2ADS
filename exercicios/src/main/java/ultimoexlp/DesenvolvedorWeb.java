package school.sptech.especialistas;

import school.sptech.Dev;

public class DesenvolvedorWeb extends Dev {
    private String backend;
    private String frontend;
    private String sgbd;
    private Integer horasMentoria;

    public DesenvolvedorWeb(String nome, Integer qtdHoras, Double valorHora, String backend, String frontend, String sgbd, Integer horasMentoria) {
        super(nome, qtdHoras, valorHora);
        this.backend = backend;
        this.frontend = frontend;
        this.sgbd = sgbd;
        this.horasMentoria = horasMentoria;
    }

    public DesenvolvedorWeb() {
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + horasMentoria * 300;
    }

    public Boolean isFullstack(){
        return (!(backend.equals("") || frontend.equals("") || sgbd.equals("")));
    }

    public String getBackend() {
        return backend;
    }

    public void setBackend(String backend) {
        this.backend = backend;
    }

    public String getFrontend() {
        return frontend;
    }

    public void setFrontend(String frontend) {
        this.frontend = frontend;
    }

    public String getSgbd() {
        return sgbd;
    }

    public void setSgbd(String sgbd) {
        this.sgbd = sgbd;
    }

    public Integer getHorasMentoria() {
        return horasMentoria;
    }

    public void setHorasMentoria(Integer horasMentoria) {
        this.horasMentoria = horasMentoria;
    }

    @Override
    public String toString() {
        return """
        DesenvolvedorWeb{
            backend='%s',
            frontend='%s',
            sgbd='%s',
            horasMentoria=%d,
            nome='%s',
            qtdHoras=%d,
            valorHora=%.2f
        } %s""".formatted(backend, frontend, sgbd, horasMentoria, nome, qtdHoras, valorHora, super.toString());

    }
}
