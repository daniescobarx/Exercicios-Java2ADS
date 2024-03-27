package minidesafioEncapusulamentto;

import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        Loja loja01 = new Loja("Dani Store", 15, 18, 100.0);

        loja01.realizarVenda(50.0);
        loja01.realizarVenda(100.0);

        loja01.realizarVendaComDesconto(100.0, 10.0);

        if (loja01.verificarMeta()){
            System.out.println("sua meta foi alcançada");
        }else {
            System.out.println("sua meta ainda não foi alcançada");
        }

        System.out.println(loja01.toString());
    }
}
