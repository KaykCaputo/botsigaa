package Bot;

import java.util.ArrayList;
import java.util.List;

public class Duvidas {
    private ArrayList<String> duvidas = new ArrayList<String>();
    private String resposta;

    Duvidas(ArrayList<String> _duvidas, String _resposta){
        this.duvidas = _duvidas;
        this.resposta = _resposta;
    }

    public ArrayList<String> getDuvidas() {
        return duvidas;
    }

    public String getResposta() {
        return resposta;
    }
}
