/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpjunit;
import java.util.Vector;

/**
 *
 * @author KS
 */
public class MoneyBag {
    private Vector<Money> fMonies = new Vector<Money>();
    
    MoneyBag(Money m1, Money m2) {
        appendMoney(m1);
        appendMoney(m2);
    }
    
    MoneyBag(Money bag[]) {
        for (int i = 0; i < bag.length; i++)
        appendMoney(bag[i]);
    }
    
    private void appendMoney(Money m) {
        if (fMonies.isEmpty()) {
            fMonies.add(m);
        } else {
            int i = 0;
            while ((i < fMonies.size())
            && (!(fMonies.get(i).currency().equals(m.currency()))))
            i++;
            if (i >= fMonies.size()) {
                fMonies.add(m);
            } else {
                fMonies.set(i, new Money(fMonies.get(i).amount() +
                m.amount(),m.currency()));
            }
        }
    }
}
