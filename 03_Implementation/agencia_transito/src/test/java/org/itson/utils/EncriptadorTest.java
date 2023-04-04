package org.itson.utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Toled
 */
public class EncriptadorTest {
    
    public EncriptadorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of encriptar method, of class Encriptador.
     */
    @Test
    public void testEncriptarYValidar() {
        System.out.println("encriptar");
        String txt = "SilverFlin1";
        
        String hash = Encriptador.encriptar(txt);
        boolean result = Encriptador.validar(txt, hash);
        boolean expResult = true;
        assertEquals(expResult, result);
    }
    
}
