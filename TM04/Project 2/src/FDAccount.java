/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raman
 */
class FDAccount extends Account{


    int noOfDays;
    int ageOfACHolder;
    @Override
    public double calculateInterest() {
        interestRate=getInterestRate();
        amount=getAmount();
        double interest=(amount*interestRate)/100;
         return interest;
    }

    public int getNoOfDays() {
        
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) throws NegativeValueException {
        if(noOfDays<0){
            throw new NegativeValueException();
        }
        else{
        this.noOfDays = noOfDays;
    }
    }

    public int getAgeOfACHolder() {
        return ageOfACHolder;
    }

    public void setAgeOfACHolder(int ageOfACHolder) throws NegativeValueException {
        if (ageOfACHolder<0) {
            throw new NegativeValueException();
        }
        else{
        this.ageOfACHolder = ageOfACHolder;
    }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate() {
       if(getAmount()>10000000){
           if (getNoOfDays()>=7 && getNoOfDays()<=14) {
               this.interestRate=6.50;
           }
           else if (getNoOfDays()>=15 && getNoOfDays()<45) {
               this.interestRate=6.75;
           }
           else if (getNoOfDays()>=45 && getNoOfDays()<=60) {
               this.interestRate=8.00;
           }
           else if (getNoOfDays()>=61 && getNoOfDays()<=184) {
               this.interestRate=8.50;
           }
           else if (getNoOfDays()>=184 && getNoOfDays()<=365) {
               this.interestRate=10.00;
           }
       }
       else{
           if (getNoOfDays()>=7 && getNoOfDays()<=14) {
               if (getAgeOfACHolder()<60) {
                   this.interestRate=4.50;
               }
               else{
                   this.interestRate=5.00;
               }
           }
           else if (getNoOfDays()>=15 && getNoOfDays()<45) {
               if (getAgeOfACHolder()<60) {
                   this.interestRate=4.75;
               }
               else{
                   this.interestRate=5.25;
               }
           }
           else if (getNoOfDays()>=45 && getNoOfDays()<=60) {
             if (getAgeOfACHolder()<60) {
                   this.interestRate=7.00;
               }
               else{
                   this.interestRate=7.50;
               }
           }
           else if (getNoOfDays()>=61 && getNoOfDays()<=184) {
             if (getAgeOfACHolder()<60) {
                   this.interestRate=7.50;
               }
               else{
                   this.interestRate=8.00;
               }
           }
           else if (getNoOfDays()>=184 && getNoOfDays()<=365) {
             if (getAgeOfACHolder()<60) {
                   this.interestRate=8.00;
               }
               else{
                   this.interestRate=8.50;
               }
           }
       }
    }
    

    public double getAmount() {
        return amount;
    }

    public void setAmount(double fdamount)throws NegativeValueException {
        if (fdamount<0) {
            throw new NegativeValueException();
        }
        else{
        this.amount = fdamount;
    }
    }
    
}
