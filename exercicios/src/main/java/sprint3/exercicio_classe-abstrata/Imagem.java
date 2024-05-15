package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public Imagem() {
        figuras = new ArrayList<>();
    }

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        Double somaDasAreas = 0.0;
        for (Figura figura : figuras) {
            somaDasAreas += figura.calcularArea();
        }
        return somaDasAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> figurasComAreaMaiorQue20 = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20) {
                figurasComAreaMaiorQue20.add(figura);
            }
        }
        return figurasComAreaMaiorQue20;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> quadrados = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura instanceof Quadrado) {
                quadrados.add(figura);
            }
        }
        return quadrados;
    }

    public List<Figura> buscarCirculos() {
        List<Figura> circulos = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura instanceof Circulo) {
                circulos.add(figura);
            }
        }
        return circulos;
    }

    public List<Figura> buscarRetangulos() {
        List<Figura> retangulos = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura instanceof Retangulo) {
                retangulos.add(figura);
            }
        }
        return retangulos;
    }

    public List<Figura> buscarTriangulos() {
        List<Figura> triangulos = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura instanceof Triangulo) {
                triangulos.add(figura);
            }
        }
        return triangulos;
    }
}
