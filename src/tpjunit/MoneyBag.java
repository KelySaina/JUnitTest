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

public class MoneyBag implements IMoney {
    private Vector<Money> fMoneis = new Vector<Money>();
    
    public MoneyBag(Money m1, Money m2) {
        appendMoney(m1);
        appendMoney(m2);
    }
    
    public MoneyBag(Money bag[]) {
        for (int i = 0; i < bag.length; i++)
            appendMoney(bag[i]);
    }

    
    private void appendMoney(Money m) {
        if (fMoneis.isEmpty()) {
            fMoneis.add(m);
        } else {
            int i = 0;
            while ((i < fMoneis.size()) && (!(fMoneis.get(i).currency().equals(m.currency()))))
                i++;
            if (i >= fMoneis.size()) {
                fMoneis.add(m);
            } else {
                fMoneis.set(i, new Money(fMoneis.get(i).amount() + m.amount(), m.currency()));
            }
        }
    }

    @Override
    public IMoney add(IMoney aMoney) {
        return aMoney.addMoneyBag(this);
    }

    public IMoney addMoney(Money m) {
        appendMoney(m);
        return this;
    }

    public IMoney addMoneyBag(MoneyBag aMoneyBag) {
        for (int i = 0; i < aMoneyBag.fMoneis.size(); i++)
            appendMoney(aMoneyBag.fMoneis.get(i));
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Check for same object
      
        if (o == null || getClass() != o.getClass()) return false; // Check for null or different class
      
        MoneyBag moneyBag = (MoneyBag) o; // Cast to MoneyBag

        return fMoneis.equals(moneyBag.fMoneis); // Compare the contents of the bags
    }    
}
