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
public class testPila {
    
    public testPila() {
    }
    
    @BeforeClass
    public static void setUP()
    {
        assertEquals(true, pila.empty());
        assertEquals(true, pila.push("uno"));
        assertEquals(true, pila.push("dos"));
        assertEquals(true, pila.push("tres"));
            assertEquals(true, pila.push("uno"));
            assertEquals(true, pila.push("dos"));
            assertEquals(true, pila.push("tres"));
            assertEquals(true, pila.push("uno"));
            assertEquals(true, pila.push("dos"));
            assertEquals(true, pila.push("tres"));
            assertEquals(true, pila.push("uno"));
            assertEquals(false, pila.push("uno"));
        
    }
        
    @Test
    public void testPilaNOVacia()
    {
        assertEquals(false, pila.empty());
    }

    
    
     @Test
    public void testPilaTop() throws pila.StackEmptyException
    {
        assertEquals("uno", pila.top());
        
    }
    
    @AfterClass
    public static void testPilaPop() throws pila.StackEmptyException
    {
        //assertEquals("tres", pila.pop());
        //assertEquals("uno", pila.pop());
        assertEquals("uno", pila.pop());
    }
    
    
}
