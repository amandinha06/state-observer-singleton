public class ChamadoEstadoResolvido extends ChamdoEstado{

    private ChamadoEstadoResolvido(){};
    private static ChamadoEstadoResolvido instance = new ChamadoEstadoResolvido();
    public static ChamadoEstadoResolvido getInstance() {return instance;}

    public String getEstado(){return "Resolvido";}

    public boolean fechar(Chamado chamado){
        chamado.setEstado(ChamadoEstadoFechado.getInstance());
        return true;
    }
}