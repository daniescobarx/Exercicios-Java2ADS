package school.sptech.ex2;

public class TreinadorPokemon {
    private String nome;
    private Double nivel;

    public TreinadorPokemon(String nome, Double nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }
    public TreinadorPokemon() {

    }

    public void treinarPokemon(Pokemon pokemon){
        pokemon.setForca(pokemon.getForca() * 1.1);
        pokemon.setDoces(pokemon.getDoces() + 10);
    }

    public void evoluirPokemon(Pokemon pokemon, String novaEvolucao){
        if(pokemon.getDoces() >= 50 ){
        pokemon.setNome(novaEvolucao);
        pokemon.setDoces(pokemon.getDoces()-50);
        this.nivel+=10;
        }
        System.out.println("Não foi possivel realizar operação");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNivel() {
        return nivel;
    }

    public void setNivel(Double nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Treinador Pokemon" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel
                ;
    }
}
