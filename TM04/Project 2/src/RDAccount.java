/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raman
 */
class RDAccount extends Account{

    int age;
    int noOfMonths;
    double monthlyAmount;
    
    @Override
    public double calculateInterest() {
        double interest;
        interestRate=getInterestRate();
        amount=getAmount();
        interest=(amount*interestRate)/100;
          return interest;
    }

    public int getNoOfMonths() {
        return noOfMonths;
    }

    public void setNoOfMonths(int noOfMonths) throws NegativeValueException{
        if (noOfMonths<0) {
            throw new NegativeValueException();
        }
        else{
            this.noOfMonths=noOfMonths;
        }
    }

    public double getMonthlyAmount() {
        return monthlyAmount;
    }

    public void setMonthlyAmount(double monthlyAmount) throws NegativeValueException{
        if (monthlyAmount<0) {
            throw new NegativeValueException();
        }
        else{
            this.monthlyAmount=monthlyAmount;
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate() {
        if (getNoOfMonths() >= 6 && getNoOfMonths() < 9) {
			this.interestRate = 7.5;
		} else if (getNoOfMonths() >= 9 && getNoOfMonths() < 12) {
			this.interestRate = 7.75;
		} else if (getNoOfMonths() >= 12 && getNoOfMonths() < 15) {
			this.interestRate = 8;
		} else if (getNoOfMonths() >= 15 && getNoOfMonths() < 18) {
			this.interestRate = 8.25;
		} else if (getNoOfMonths() >= 18 && getNoOfMonths() <= 21) {
			this.interestRate = 8.5;
		} else if (getNoOfMonths()>= 21) {
			this.interestRate = 8.75;
		}
		
        if (getAge()>60) {
            this.interestRate=this.interestRate+0.50;
        }
		
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double rdamount) throws NegativeValueException{
        if (amount<0) {
            throw new NegativeValueException();
        }
        else{
            this.amount=rdamount;
        }
    }
    
    public void setAge(int age) throws NegativeValueException{
        if (age<0) {
            
            throw new NegativeValueException();
        }
        else{
            this.age=age;
        }
    }
    
    public int getAge(){
       return this.age;
    }
    
}
