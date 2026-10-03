import java.util.Observable;
import java.util.Observer;

public class Operador implements Observer{
    private String ultimaNotificacao;

    private Operador(){};
    private static Operador instance = new Operador();
    public static Operador getInstance() {return instance;}

    public String getUltimaNotificacao(){return this.ultimaNotificacao;}

    public void cadastrar(Chamado chamado) {
        chamado.addObserver(this);
    }

    public void update(Observable chamado, Object anterior){
        ChamadoEstado estadoAnterior = (ChamadoEstado) anterior;
        this.ultimaNotificacao = "estado anterior: " + estadoAnterior.getEstado() + " = chamado atualizado: " + chamado.toString();
    }

}