/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbw.notenblatt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 5ia16tefilipovic
 */
public class VerarbeitungTest {
    
    public VerarbeitungTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of fileEinlesenSchueler method, of class Verarbeitung.
     */
    @Test
    public void testFileEinlesenSchueler() throws Exception {
        System.out.println("fileEinlesenSchueler");
        Verarbeitung instance = new Verarbeitung();
        instance.fileEinlesenSchueler();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fileEinlesenLehrer method, of class Verarbeitung.
     */
    @Test
    public void testFileEinlesenLehrer() throws Exception {
        System.out.println("fileEinlesenLehrer");
        Verarbeitung instance = new Verarbeitung();
        instance.fileEinlesenLehrer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fileAusgebenSchueler method, of class Verarbeitung.
     */
    @Test
    public void testFileAusgebenSchueler() {
        System.out.println("fileAusgebenSchueler");
        Verarbeitung instance = new Verarbeitung();
        instance.fileAusgebenSchueler();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fileAusgebenLehrer method, of class Verarbeitung.
     */
    @Test
    public void testFileAusgebenLehrer() {
        System.out.println("fileAusgebenLehrer");
        Verarbeitung instance = new Verarbeitung();
        instance.fileAusgebenLehrer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Verarbeitung.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Verarbeitung.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
