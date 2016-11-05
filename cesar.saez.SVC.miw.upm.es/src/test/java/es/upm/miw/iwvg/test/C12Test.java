package es.upm.miw.iwvg.test;

import static org.junit.Assert.*;
import org.junit.Test;
import es.upm.miw.iwvg.csl.C12;

public class C12Test {
    
    public String nombre;
    
    @Test
    public void testC12() {
        nombre="mA";       
        
        String nombreMetodo = C12.mA();        
        
        assertEquals(nombre, nombreMetodo);
            
    }
}
