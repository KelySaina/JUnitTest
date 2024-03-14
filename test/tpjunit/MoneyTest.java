/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tpjunit;
import static org.junit.Assert.*;

/**
 *
 * @author KS
 */
public class MoneyTest {
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @org.junit.Test
    public void testSimpleAdd() {
        Money m12CHF = new Money(12, "CHF"); // création de données
        Money m14CHF = new Money(14, "CHF");
        Money expected = new Money(26, "CHF");
        Money result = m12CHF.add(m14CHF); // exécution de la méthode testée
        assertTrue(expected.equals(result)); // comparaison
    }
    
    @org.junit.Test
    public void testEquals() {
        Money m12CHF= new Money(12, "CHF");
        Money m14CHF= new Money(14, "CHF");
        assertTrue(!m12CHF.equals(null)); 
        assertEquals(m12CHF, m12CHF);
        assertEquals(m12CHF, new Money(12, "CHF"));
        assertTrue(!m12CHF.equals(m14CHF));
    }
    
}
