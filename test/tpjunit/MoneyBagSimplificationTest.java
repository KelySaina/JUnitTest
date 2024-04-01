/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpjunit;

/**
 *
 * @author KS
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoneyBagSimplificationTest {

    @Test
    public void testSingleValueSimplification() {
        // [-12 CHF] + {[12 CHF] [7 USD]} = [7 USD]
        Money m1 = new Money(12, "CHF");
        Money m2 = new Money(7, "USD");
        MoneyBag bag = new MoneyBag(m1, m2);
        assertEquals(new Money(7, "USD"), bag.addMoney(new Money(-12, "CHF")));
    }
    
    @Test
    public void testMultipleNonZeroValues() {
        // [10 USD] + [20 CHF] = {[10 USD], [20 CHF]}
        Money m1 = new Money(10, "USD");
        Money m2 = new Money(20, "CHF");
        MoneyBag bag = new MoneyBag(m1, m2);
        assertEquals(bag, bag.addMoney(new Money(0, "USD"))); // Aucune simplification nécessaire
    }

    @Test
    public void testAllZeroValues() {
        // [0 USD] + [0 CHF] = {[0 USD], [0 CHF]}
        Money m1 = new Money(0, "USD");
        Money m2 = new Money(0, "CHF");
        MoneyBag bag = new MoneyBag(m1, m2);
        assertEquals(bag, bag.addMoney(new Money(0, "USD"))); // Aucune simplification nécessaire
    }
}

