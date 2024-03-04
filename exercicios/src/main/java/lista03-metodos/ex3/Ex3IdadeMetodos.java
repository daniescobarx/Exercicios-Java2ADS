package school.sptech.ex3;
public class Ex3IdadeMetodos {

    // mensagem correspondente à faixa etária, nao retorna (void)
    public void classificaIdade(Integer idadeUsuario) {

        if (idadeUsuario >= 0 && idadeUsuario <= 2) {
            System.out.println("Bebê");
        } else if (idadeUsuario >= 3 && idadeUsuario <= 11) {
            System.out.println("Criança");
        } else if (idadeUsuario >= 12 && idadeUsuario <= 19) {
            System.out.println("Adolescente");
        } else if (idadeUsuario >= 20 && idadeUsuario <= 30) {
            System.out.println("Jovem");
        } else if (idadeUsuario >= 31 && idadeUsuario <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
