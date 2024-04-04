package school.sptech.ex2;

public class TesteTreinadorPokemon {
    public static void main(String[] args) {
        Pokemon mimikyu = new Pokemon("mimikyu","Ghost/Fairy", 50.0, 50 );
        TreinadorPokemon iris = new TreinadorPokemon("Iris", 50.0);

        System.out.println("Pokemon: " + mimikyu);
        System.out.println("Treinador: " + iris);

        iris.treinarPokemon(mimikyu);
        System.out.println("Pokemon após ser treinado:");
        System.out.println(mimikyu);

        iris.evoluirPokemon(mimikyu, "Raichu");
        System.out.println("Após ser evoluido");
        System.out.println(mimikyu);
        System.out.println(iris);
    }
}
