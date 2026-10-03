public class ChamadoEstadoAlerta extends ChamdoEstado{

    private ChamadoEstadoAlerta(){};
    private static ChamadoEstadoAlerta instance = new ChamadoEstadoAlerta();
    public static ChamadoEstadoAlerta getInstance() {return instance;}

    public String getEstado(){return "Alerta";}

    public boolean resolver(Chamado chamado){
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        return true;
    }

    public boolean fechar(Chamado chamado){
        chamado.setEstado(ChamadoEstadoFechado.getInstance());
        return true;
    }
}