package Bot;

import java.util.ArrayList;
import java.util.List;

public class Bot {
    public static final ArrayList<String> DuvidaLogar = new ArrayList<>(List.of(new String[]{"como faço para logar?", "como faço login?"}));
    public static final ArrayList<String> DuvidaNotas = new ArrayList<>(List.of(new String[]{"como vejo minhas notas?", "onde eu vejo minhas notas?"}));
    public static Duvidas comoLogar = new Duvidas(DuvidaLogar, "Não sei bro, vtmnc, todo dia isso namoral");
    public static Duvidas comoVerNotas = new Duvidas(DuvidaLogar, "Não sei bro, vtmnc, todo dia isso namoral");

    public static void responde(String duvida){
        duvida = duvida.toLowerCase();
        if(comoLogar.getDuvidas().contains(duvida)){
            System.out.println(comoLogar.getResposta());
        } else if (comoVerNotas.getDuvidas().contains(duvida)) {
            System.out.println(comoVerNotas.getResposta());
        }
    }
}
