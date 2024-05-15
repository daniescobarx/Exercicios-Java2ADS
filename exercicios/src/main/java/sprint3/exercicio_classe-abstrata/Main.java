
package school.sptech;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    Quadrado quadrado1 = new Quadrado(5.0);
    quadrado1.setCor("Rosa");
    quadrado1.setEspessura(1);

    Quadrado quadrado2 = new Quadrado(3.0);
    quadrado2.setCor("Branco");
    quadrado2.setEspessura(2);

    Circulo circulo1 = new Circulo(4.0);
    circulo1.setCor("Azul");
    circulo1.setEspessura(1);

    Retangulo retangulo1 = new Retangulo(6.0, 2.0);
    retangulo1.setCor("Preto");
    retangulo1.setEspessura(1);

    Triangulo triangulo1 = new Triangulo(3.0, 4.0);
    triangulo1.setCor("Roxo");
    triangulo1.setEspessura(1);

    Imagem imagem = new Imagem();
    imagem.adicionar(quadrado1);
    imagem.adicionar(quadrado2);
    imagem.adicionar(circulo1);
    imagem.adicionar(retangulo1);
    imagem.adicionar(triangulo1);

    Double somaDasAreas = imagem.calcularSomaDasAreas();
    System.out.println("Soma das áreas: " + somaDasAreas);

    List<Figura> figurasComAreaMaiorQue20 = imagem.buscarPorAreaMaiorQue20();
    System.out.println("Figuras com área maior que 20: " + figurasComAreaMaiorQue20);

    List<Figura> quadrados = imagem.buscarQuadrados();
    System.out.println("Quadrados: " + quadrados);

    List<Figura> circulos = imagem.buscarCirculos();
    System.out.println("Círculos: " + circulos);

    List<Figura> retangulos = imagem.buscarRetangulos();
    System.out.println("Retângulos: " + retangulos);

    List<Figura> triangulos = imagem.buscarTriangulos();
    System.out.println("Triângulos: " + triangulos);
  }
}
