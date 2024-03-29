package school.sptech;
import java.util.concurrent.ThreadLocalRandom;

    public class Votacao {
        public static void main(String[] args) {
            int mussarela = 0;
            int calabresa = 0;
            int quatroQueijos = 0;

            for (int i = 0; i < 10; i++){

                int randomNumber = ThreadLocalRandom.current().nextInt(1, 4);

                if(randomNumber == 1){
                    mussarela = mussarela + 1;
                }

                if(randomNumber == 2){
                    calabresa = calabresa + 1;
                }

                if(randomNumber == 3){
                    quatroQueijos = quatroQueijos + 1;
                }
            }

            System.out.println("Mussarela: " + mussarela +"\nCalabresa: " + calabresa + "\nQuatro Queijos: "  + quatroQueijos);

            if(mussarela > calabresa && mussarela > quatroQueijos){
                System.out.println("Sabor favorito: Mussarela");
            }

            if(calabresa > mussarela && calabresa > quatroQueijos){
                System.out.println("Sabor favorito: Calabresa");
            }

            if(quatroQueijos  > calabresa && quatroQueijos > mussarela){
                System.out.println("Sabor favorito: Quatro Queijo");
            }
        }
    }
