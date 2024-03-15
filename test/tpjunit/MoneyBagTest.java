/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tpjunit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thyler
 */
public class MoneyBagTest {
    
    private static Money f12CHF;
    private static Money f14CHF;
    private static Money f7USD;
    private static Money f21USD;
    private static MoneyBag fMB1;
    private static MoneyBag fMB2;
            
    static {
        f12CHF= new Money(12, "CHF");
        f14CHF= new Money(14, "CHF");
        f7USD= new Money( 7, "USD");
        f21USD= new Money(21, "USD");
        fMB1= new MoneyBag(f12CHF, f7USD);
        fMB2= new MoneyBag(f14CHF, f21USD);
    }
    
    public MoneyBagTest() {
    }

    @org.junit.Test
    public void testBagEquals() {
        assertTrue(!fMB1.equals(null));
        assertEquals(fMB1, fMB1);
        assertTrue(!fMB1.equals(f12CHF));
        assertTrue(!f12CHF.equals(fMB1));
        assertTrue(!fMB1.equals(fMB2));
    }
    
    
    
}

