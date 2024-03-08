package school.sptech.ex1;

public class Ex1ClasseSocialMetodos {
  public Double calcularQtdSalariosMinimos(Double renda) {
    Double salarioMinimo = 1045.0;
    return renda / salarioMinimo;
  }

  public String classeSocial(Double qtdSalariosMinimos) {
    String classeSocialUser = null;

    if (qtdSalariosMinimos > 20) {
      classeSocialUser = "A";
    } else if (qtdSalariosMinimos > 10 && qtdSalariosMinimos <=20) {
      classeSocialUser = "B";
    } else if (qtdSalariosMinimos > 4 && qtdSalariosMinimos <=10) {
      classeSocialUser = "C";
    } else if (qtdSalariosMinimos > 2 && qtdSalariosMinimos <=4) {
      classeSocialUser = "D";
    } else {
      classeSocialUser = "E";
    }

    return classeSocialUser;
  }
}
