import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChamadoTest {

    Chamado chamado;

    @BeforeEach
    public void setUp() {
        chamado = new Chamado();
        chamado.setTitulo("Login");
    }

    // Chamado aberto

    @Test
    public void deveAlertarChamadoAberto(){
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        assertTrue(chamado.alertar());
        assertEquals(ChamadoEstadoAlerta.getInstance(), chamado.getEstado());
    }

    @Test
    public void deveResolverChamadoAberto(){
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        assertTrue(chamado.resolver());
        assertEquals(ChamadoEstadoResolvido.getInstance(), chamado.getEstado());
    }

    @Test
    public void deveFecharChamadoAberto(){
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        assertTrue(chamado.fechado());
        assertEquals(ChamadoEstadoFechado.getInstance(), chamado.getEstado());
    }

    // Chamado em alerta

    @Test
    public void deveResolverChamadoEmAlerta(){
        chamado.setEstado(ChamadoEstadoAlerta.getInstance());
        assertTrue(chamado.resolver());
        assertEquals(ChamadoEstadoResolvido.getInstance(), chamado.getEstado());
    }

    @Test
    public void deveFecharChamadoEmAlerta(){
        chamado.setEstado(ChamadoEstadoAlerta.getInstance());
        assertTrue(chamado.fechado());
        assertEquals(ChamadoEstadoFechado.getInstance(), chamado.getEstado());
    }

    @Test
    public void naoDeveAlertarChamadoEmAlerta(){
        chamado.setEstado(ChamadoEstadoAlerta.getInstance());
        assertFalse(chamado.alertar());
    }

    // Chamado resolvido

    @Test
    public void deveFecharChamadoResolvido(){
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        assertTrue(chamado.fechado());
        assertEquals(ChamadoEstadoFechado.getInstance(), chamado.getEstado());
    }

    @Test
    public void naoDeveAlertarChamadoResolvido(){
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        assertFalse(chamado.alertar());
    }

    @Test
    public void naoDeveResolverChamadoResolvido(){
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        assertFalse(chamado.resolver());
    }

    // Chamado fechado

    @Test
    public void naoDeveAlertarChamadoFechado(){
        chamado.setEstado(ChamadoEstadoFechado.getInstance());
        assertFalse(chamado.alertar());
    }

    @Test
    public void naoDeveResolverChamadoFechado(){
        chamado.setEstado(ChamadoEstadoFechado.getInstance());
        assertFalse(chamado.resolver());
    }

    @Test
    public void naoDeveFecharChamadoFechado(){
        chamado.setEstado(ChamadoEstadoFechado.getInstance());
        assertFalse(chamado.fechado());
    }

}