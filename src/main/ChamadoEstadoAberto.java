public class ChamadoEstadoAberto extends ChamadoEstado{

    private ChamadoEstadoAberto(){};
    private static ChamadoEstadoAberto instance = new ChamadoEstadoAberto();
    public static ChamadoEstadoAberto getInstance() {return instance;}

    public String getEstado(){return "Aberto";}

    public boolean alertar(Chamado chamado){
        chamado.setEstado(ChamadoEstadoAlerta.getInstance());
        return true;
    }

    public boolean resolver(Chamado chamado){
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        return true;
    }

    public boolean fechar(Chamado chamado){
        chamado.setEstado(ChamadoEstadoFechado.getInstance());
        return true;
    }
}