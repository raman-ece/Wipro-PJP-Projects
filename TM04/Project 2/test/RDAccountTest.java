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
public class RDAccountTest {
    
    private RDAccount rd=new RDAccount();
    
    @Test
    public void monthsTest() throws NegativeValueException{
        rd.setNoOfMonths(6);
        assertEquals(6, rd.getNoOfMonths());
    }
    @Test
    public void MonthlyAmountTest() throws NegativeValueException{
        rd.setAmount(10000);
        assertEquals(10000.0, rd.getAmount(),0.0);
    }
    @Test
    public void ageTest() throws NegativeValueException{
        rd.setAge(65);
        assertEquals(65, rd.getAge());
    }
    @Test
    public void InterestRateTest() throws NegativeValueException{
        rd.setNoOfMonths(6);
        rd.setAge(65);
        rd.setInterestRate();
        assertEquals(8.0, rd.getInterestRate(),0.0);
    }
    @Test
    public void InterestCalcTest() throws NegativeValueException{
        rd.setAmount(10000.0);
        rd.setAge(65);
        rd.setNoOfMonths(6);
        rd.setInterestRate();
        double interest=(rd.getAmount()*rd.getInterestRate()/100);
        assertEquals(800, rd.calculateInterest(),0.0);
    }
}
