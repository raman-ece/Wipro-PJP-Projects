/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raman
 */
class SBAccount extends Account{
  
    
    @Override
    public double calculateInterest() {
        amount=getAmount();
        interestRate=getInterestRate();
        double interest= (amount*interestRate)/100;
         return interest;
    }

    public void setInterestRate(double interestrate) throws NegativeValueException {
        if (interestrate<0) {
            throw new NegativeValueException();
        }
        else{
        this.interestRate=interestrate;    
    }
    }
    
    public double getInterestRate(){
        return interestRate;
    }
    
    void setAmount(double amount) throws NegativeValueException{
        if (amount<0) {
            throw new NegativeValueException();
        }
        else{
        this.amount=amount;
        }
    }
    double getAmount(){
        return amount;
    }
    
    
}
