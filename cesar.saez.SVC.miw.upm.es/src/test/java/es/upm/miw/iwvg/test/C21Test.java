package es.upm.miw.iwvg.test;

import static org.junit.Assert.*;
import org.junit.Test;
import es.upm.miw.iwvg.csl.C21;

public class C21Test {
       
        public String nombre1;
        public String nombre2;
        
        @Test
        public void testC21() {
            nombre1="m1";
            nombre2="m2";
            
            String nombreMetodo1 = C21.m1();
            String nombreMetodo2 = C21.m2();
            
            assertEquals(nombre1, nombreMetodo1);
            assertEquals(nombre2, nombreMetodo2);     
        }
}    
