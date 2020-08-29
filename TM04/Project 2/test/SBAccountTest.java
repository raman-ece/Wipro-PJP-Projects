/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Raman
 */
public class SBAccountTest {
    
    private SBAccount sb=new SBAccount();
    
    @Test
    public void AmountTest() throws NegativeValueException{
        sb.setAmount(10000);
        assertEquals(10000.0,sb.getAmount(),0.0);
    }
    @Test
    public void RateTest() throws NegativeValueException{
        sb.setInterestRate(8.0);
        assertEquals(8.0, sb.getInterestRate(),0.0);
    }
    @Test
    public void InterestTest() throws NegativeValueException{
        sb.setAmount(10000);
        sb.setInterestRate(8.0);
        double interest=(sb.getAmount()*sb.getInterestRate()/100);
        assertEquals(800,interest,0.0);
    }
}
