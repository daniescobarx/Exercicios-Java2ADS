package school.sptech;

import school.sptech.especialistas.DesenvolvedorMobile;
import school.sptech.especialistas.DesenvolvedorWeb;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Dev> devs;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.devs = new ArrayList<>();
    }

    public void contratar(Dev dev) {
        if (devs.size() < vagas) {
            devs.add(dev);
        }
    }

    public void contratarFullstack(DesenvolvedorWeb dev) {
        if (devs.size() < vagas && dev.isFullstack()) {
            devs.add(dev);
        }
    }

    public Double getTotalSalarios() {
        Double somaSalario = 0.0;
        for (Dev dev : devs) {
            somaSalario += dev.calcularSalario();
        }
        return somaSalario;
    }

    public Integer qtdDesenvolvedoresMobile() {
        Integer qtdDevMobile = 0;
        for (Dev devDaVez : devs) {
            if (devDaVez instanceof DesenvolvedorMobile) {
                qtdDevMobile++;
            }
        }
        return qtdDevMobile;
    }

    public List<Dev> buscarPorMaiorSalarioQue(Double salario) {
        List<Dev> salariosMaioresQue = new ArrayList<>();
        for (Dev dev : devs) {
            if (dev.calcularSalario() >= salario) {
                salariosMaioresQue.add(dev);
            }
        }
        return salariosMaioresQue;
    }

    public Dev buscarMenorSalario() {
        Dev menorSalario = devs.get(0);
        for (Dev dev : devs) {
            if (dev.calcularSalario() < menorSalario.calcularSalario()) {
                menorSalario = dev;
            }
        }
        return menorSalario;
    }

    public List<Dev> buscarPorTecnologia(String tecnologia) {
        List<Dev> auxiliar = new ArrayList<>();

        for (Dev dev : devs) {
            if (dev instanceof DesenvolvedorWeb) {
                DesenvolvedorWeb devWeb = (DesenvolvedorWeb) dev;
                if (devWeb.getBackend().equalsIgnoreCase(tecnologia) || devWeb.getFrontend().equalsIgnoreCase(tecnologia) || devWeb.getSgbd().equalsIgnoreCase(tecnologia)) {
                    auxiliar.add(devWeb);
                }
            } else if (dev instanceof DesenvolvedorMobile) {
                DesenvolvedorMobile devMob = (DesenvolvedorMobile) dev;
                if (devMob.getPlataforma().equalsIgnoreCase(tecnologia) || devMob.getLinguagem().equalsIgnoreCase(tecnologia)) {
                    auxiliar.add(devMob);
                }
            }
        }
        return auxiliar;
    }

    public Double getTotalSalariosPorTecnologia(String tecnologia) {
        Double somaSalario = 0.0;
        List<Dev> aux = buscarPorTecnologia(tecnologia);
        for (Dev dev : aux) {
            somaSalario += dev.calcularSalario();
        }
        return somaSalario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public void setDevs(List<Dev> devs) {
        this.devs = devs;
    }

    @Override
    public String toString() {
        return """
                Nome da consultoria: %s
                Vagas: $d
                Devs: $s""".formatted(nome, vagas, devs);
    }
}
