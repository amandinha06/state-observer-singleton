import java.util.Observable;

public class Chamado extends Observable{
    private String titulo;
    private ChamadoEstado estado;

    public Chamado() {
        this.estado = ChamadoEstadoAberto.getInstance();
        Operador.getInstance().cadastrar(this);
    }

    public void setEstado(ChamadoEstado estado){
        ChamadoEstado anterior = this.estado;
        this.estado = estado;
        definirStatus(anterior);
    }

    public void definirStatus(){
        setChanged();
        notifyObservers(anterior);
    }

    public boolean alertar() {return estado.alertar(this);}

    public boolean resolver() {return estado.resolver(this);}

    public boolean fechado() {return estado.fechado(this);}

    public String getNomeEstado() {return estado.getEstado();}

    public String getTitulo() { return titulo;}

    public void setTitulo(String titulo){this.titulo = titulo;}

    public ChamadoEstado getEstado() {return estado;}

    @Override
    public String toString(){
        return "Chamado: " + titulo + " | Status: " + estado;
    }
}