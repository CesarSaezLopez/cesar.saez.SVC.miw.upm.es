package es.upm.miw.iwvg.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import es.upm.miw.iwvg.csl.C52;

public class C52Test {

public String nombre;
    
    @Test
    public void testC52() {
        nombre="mA";
                
        String nombreMetodo = C52.mA();
            
        assertEquals(nombre, nombreMetodo);
            
    }
}
