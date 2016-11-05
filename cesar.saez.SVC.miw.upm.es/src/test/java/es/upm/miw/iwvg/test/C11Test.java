package es.upm.miw.iwvg.test;

import static org.junit.Assert.*;
import org.junit.Test;
import es.upm.miw.iwvg.csl.C11;

public class C11Test {
    public String nombre1;
    public String nombre2;
    
    @Test
    public void testC11() {
        nombre1="m1";
        nombre2="m2";
        
        String nombreMetodo1 = C11.m1();
        String nombreMetodo2 = C11.m2();
        
        assertEquals(nombre1, nombreMetodo1);
        assertEquals(nombre2, nombreMetodo2);     
    }
}
