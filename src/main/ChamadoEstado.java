public abstract class ChamadoEstado{

    public abstract String getEstado();

    public boolean alertar(Chamado chamado){return false;}

    public boolean resolver(Chamado chamado){return false;}

    public boolean fechar(Chamado chamado){return false;}
}