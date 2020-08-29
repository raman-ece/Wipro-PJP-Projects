
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 *
 * @author Raman
 */
abstract class Account{
    double interestRate;
    double amount;
 public abstract double calculateInterest();
}

class NegativeValueException extends Exception{
    public NegativeValueException(){
        super();
        System.out.println("Please enter non-negative values");
    }
}

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

public class InterestCalculator {
    static void menu(){
        System.out.println(" MENU \n"+
                           "--------\n"+
                              "1. Interest Calculator - SB\n"+
                              "2. Interest Calculator - FD\n"+
                              "3. Interest Calculator - RD\n"+
                              "4. Exit");
    }
    
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            
            int choise=-1;
            while (choise!=4) {   
                menu();
                System.out.println("Enter Your Option(1..4) :");
                choise=Integer.parseInt(br.readLine());
                switch (choise){
                    case 1:
                        SBAccount sb=new SBAccount();
                        System.out.println("Enter User Type(Normal or NRI): ");
                        String usertype=br.readLine();
                        while (!usertype.equals("Normal") || !usertype.equals("NRI")) {                            
                            
                            if (usertype.equals("Normal")) {
                            sb.setInterestRate(4);
                            break;
                        }
                        else if(usertype.equals("NRI")){
                            sb.setInterestRate(6);
                            break;
                        }
                            System.out.println("Please Enter valid Usertype");
                            usertype=br.readLine();
                        }
                        
                        
                        System.out.println("Enter Amount in your account: ");
                        double amount=Double.parseDouble(br.readLine());
                        sb.setAmount(amount);
                        System.out.println("Interest Gained : "+sb.calculateInterest());
                        break;
                    case 2:
                        FDAccount fd=new FDAccount();
                        System.out.println("Enter the FD amount: ");
                        double fdamount=Double.parseDouble(br.readLine());
                        fd.setAmount(fdamount);
                        System.out.println("Enter the number of days: ");
                        int fddays=Integer.parseInt(br.readLine());
                        fd.setNoOfDays(fddays);
                        System.out.println("Enter your age: ");
                        int fdage=Integer.parseInt(br.readLine());
                        fd.setAgeOfACHolder(fdage);
                        fd.setInterestRate();
                        System.out.println("Interest Gained: "+fd.calculateInterest());
                        break;
                    case 3:
                        RDAccount rd=new RDAccount();
                        System.out.println("Enter Amount: ");
                        double rdamount=Double.parseDouble(br.readLine());
                        rd.setAmount(rdamount);
                        System.out.println("Enter Number of Months: ");
                        int months=Integer.parseInt(br.readLine());
                        rd.setNoOfMonths(months);
                        System.out.println("Enter your age: ");
                        
                        int age=Integer.parseInt(br.readLine());
                        rd.setAge(age);
                        rd.setInterestRate();
                        System.out.println("Interest Gained: "+rd.calculateInterest());
                        break;
                    case 4:
                        System.out.println("Thanks for using Interest Calculator");
                        break;
                    default:
                        System.out.println("Please Enter Valid Option");
                }
            }
        } catch (IOException | NumberFormatException | NegativeValueException e) {
        }
    }
    
}
