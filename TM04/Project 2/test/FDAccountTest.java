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
 * @author Raman
 */
public class FDAccountTest {
    
    private FDAccount fd=new FDAccount();
    
   @Test
   public void NOofDaysTest() throws NegativeValueException{
       fd.setNoOfDays(91);
       assertEquals(91, fd.getNoOfDays());
   }
 @Test
 public void AgeofAccHolderTest() throws NegativeValueException{
     fd.setAgeOfACHolder(65);
     assertEquals(65, fd.getAgeOfACHolder());
 }
 @Test
 public void GetInterestrateTest() throws NegativeValueException{
     fd.setAmount(10000.0);
     fd.setAgeOfACHolder(65);
     fd.setNoOfDays(91);
     fd.setInterestRate();
     assertEquals(8, fd.getInterestRate(),0.0);
     
 }
 
 @Test
 public void CalaculateInterestTest() throws NegativeValueException{
      fd.setAmount(10000.0);
     fd.setAgeOfACHolder(65);
     fd.setNoOfDays(91);
     fd.setInterestRate();
     Double interest=(fd.getAmount()*fd.getInterestRate()/100);
     assertEquals(800, interest,0.0);
 }
}
