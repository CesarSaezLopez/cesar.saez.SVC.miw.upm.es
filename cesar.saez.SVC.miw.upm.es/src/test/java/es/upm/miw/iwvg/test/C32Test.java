package es.upm.miw.iwvg.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import es.upm.miw.iwvg.csl.C32;

public class C32Test {

    public String nombre;
    
    @Test
    public void testC32() {
        nombre="mA";
                
        String nombreMetodo = C32.mA();
            
        assertEquals(nombre, nombreMetodo);
    }
}
