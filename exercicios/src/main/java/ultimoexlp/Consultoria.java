package school.sptech;

import school.sptech.especialistas.DesenvolvedorMobile;
import school.sptech.especialistas.DesenvolvedorWeb;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Consultoria{

    private String nome;
    private Integer vagas;
    private List<Dev> devs;

    public Consultoria(String nome, Integer vagas){
        this.vagas = vagas;
        this.devs = new ArrayList<>();
    }

    public Consultoria() {
    }

    public void contratar(Dev dev){
        if(devs.size() < vagas){
            devs.add(dev);
        }
    }

    public void contratarFullStack(DesenvolvedorWeb dev){
        if(devs.size() < vagas){
            if(dev.isFullstack()){
                contratar(dev);
            }
        }
    }

    public Double getTotalSalarios(){
        Double total = 0.0;
        for (int i = 0; i < devs.size(); i++) {
            total += devs.get(i).calcularSalario();
        }
        return total;
    }

    public Integer qtdDesenvolvedoresMobile(){
        int contador = 0;
        for (Dev dev : devs) {
            if(dev instanceof DesenvolvedorMobile){
                contador++;
            }
        }
        return contador;
    }

    public List<Dev> buscarPorSalarioMaiorQue(Double salario){
        List<Dev> novaLista = new ArrayList<>();
        for (int i = 0; i < devs.size(); i++) {
            if(devs.get(i).calcularSalario() > salario){
                novaLista.add(devs.get(i));
            }
        }
        return novaLista;
    }

    public Dev buscarMenorSalario(){
        if(devs.isEmpty()){
            return null;
        }
        Double devTeste = devs.get(0).calcularSalario();
        Integer indexDev = 0;
        for (int i = 0; i < devs.size(); i++) {
            if(devs.get(i).calcularSalario() < devTeste){
                devTeste = devs.get(i).calcularSalario();
                indexDev = i;
            }
        }
        return devs.get(indexDev);
    }

    public List<Dev> buscarPorTecnologia(String tecnologia) {
        List<Dev> devsEncontrados = new ArrayList<>();
        for (Dev dev : devs) {
            // Verifica se alguma das tecnologias corresponde ao valor informado
            if (dev instanceof DesenvolvedorWeb devWeb) {
                if (devWeb.getBackend().equalsIgnoreCase(tecnologia) ||
                        devWeb.getFrontend().equalsIgnoreCase(tecnologia) ||
                        devWeb.getSgbd().equalsIgnoreCase(tecnologia)) {
                    devsEncontrados.add(dev);
                }
            } else if (dev instanceof DesenvolvedorMobile devMobile) {
                if (devMobile.getPlataforma().equalsIgnoreCase(tecnologia) ||
                        devMobile.getLinguagem().equalsIgnoreCase(tecnologia)) {
                    devsEncontrados.add(dev);
                }
            }
        }
        return devsEncontrados;
    }

    public Double getTotalSalariosPorTecnologia(String tecnologia) {
        double totalSalarios = 0.0;
        for (Dev dev : devs) {
            // Verifica se alguma das tecnologias corresponde ao valor informado
            if (dev instanceof DesenvolvedorWeb devWeb) {
                if (devWeb.getBackend().equalsIgnoreCase(tecnologia) ||
                        devWeb.getFrontend().equalsIgnoreCase(tecnologia) ||
                        devWeb.getSgbd().equalsIgnoreCase(tecnologia)) {
                    totalSalarios += dev.calcularSalario();
                }
            } else if (dev instanceof DesenvolvedorMobile devMobile) {
                if (devMobile.getPlataforma().equalsIgnoreCase(tecnologia) ||
                        devMobile.getLinguagem().equalsIgnoreCase(tecnologia)) {
                    totalSalarios += dev.calcularSalario();
                }
            }
        }
        return totalSalarios;
    }



}
