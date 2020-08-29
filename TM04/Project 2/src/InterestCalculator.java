
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 *
 * @author Raman
 */

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
