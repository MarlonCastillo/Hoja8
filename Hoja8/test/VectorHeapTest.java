import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marlon
 */
public class VectorHeapTest {
    
    /**
     *
     */
    public VectorHeapTest() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }

    /**
     *
     */
    @Test
    public void addTest(){
        Paciente paciente1 = new Paciente("marlon","dolor","A");
        Paciente paciente2 = new Paciente("josue","estomago","D");
        Paciente paciente3 = new Paciente("pedro","gripe","E");
        VectorHeap<Paciente> cola = new VectorHeap<Paciente>();
        cola.add(paciente1);
        cola.add(paciente2);
        cola.add(paciente3);
    }
    
    /**
     *
     */
    @Test
    public void removeTest(){
        Paciente paciente1 = new Paciente("marlon","dolor","A");
        Paciente paciente2 = new Paciente("josue","estomago","D");
        Paciente paciente3 = new Paciente("pedro","gripe","E");
        VectorHeap<Paciente> cola = new VectorHeap<Paciente>();
        cola.add(paciente1);
        cola.add(paciente2);
        cola.add(paciente3);
        
        paciente1=cola.remove();
        paciente2=cola.remove();
        paciente3=cola.remove();
        
        assertEquals("A",paciente1.getCodigo());
        assertEquals("D",paciente2.getCodigo());
        assertEquals("E",paciente3.getCodigo());
    }

}
