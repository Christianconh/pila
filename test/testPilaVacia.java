/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author christian
 */
public class testPilaVacia {
    
    @Test
    public void testPilaVacia() {
        assertEquals(true, pila.empty());
    }
    
    @Test(expected = RuntimeException.class)
    public void testPilaPop()
    {
        pila.pop();
    }
    
    @Test(expected = RuntimeException.class)
    public void testPilaTop()
    {
        pila.top();
    }
    
    
    
   
}
