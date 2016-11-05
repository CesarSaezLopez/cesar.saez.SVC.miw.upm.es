package es.upm.miw.iwvg.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import es.upm.miw.iwvg.csl.C22;

public class C22Test {
    
    public String nombre;
    
    @Test
    public void testC22() {
        nombre="mA";
                
        String nombreMetodo = C22.mA();
            
        assertEquals(nombre, nombreMetodo);
            
    }
}
