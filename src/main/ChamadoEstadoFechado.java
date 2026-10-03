public class ChamadoEstadoFechado extends ChamadoEstado{

    private ChamadoEstadoFechado(){};
    private static ChamadoEstadoFechado instance = new ChamadoEstadoFechado();
    public static ChamadoEstadoFechado getInstance() {return instance;}

    public String getEstado(){return "Fechado";}
}
