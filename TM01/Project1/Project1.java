
public class Project1 {
    public static void main(String[] args){
        
       String[][] emp={{"Emp No","Emp Name","Join Date","Designation","Department","Basic","HRA","IT"},
                       {"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
                       {"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
                       {"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
                       {"1004","Chahat","29/01/2013","r","Front Desk","6000","12000","2000"},
                       {"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
                       {"1006","Suman","01/01/2000","e","Manufacturing","9000","12000","4400"},
                       {"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"},};
       String s=args[0];
       boolean flag=true;
        for (int i = 0; i < emp.length; i++) {
            if ((emp[i][0]).equals(s)) {
                flag=false;
                break;
            }
        }
        if(!flag)
        {
        for (int i = 0; i < emp.length; i++) {
            if((emp[i][0]).equals(s))
            {
            
                String s1=emp[i][3];
                int DA=0;
                String desig="";
                switch (s1)
                        {
                    case "e":
                    {
                        desig="Engineer";
                         DA=20000;
                        break;
                    }
                     case "c":
                    {
                        desig="Consultant";
                         DA=32000;
                        break;
                    }
                     case "k":
                    {
                        desig="Clerk";
                         DA=12000;
                        break;
                    }
                     case "r":
                    {
                        desig="Receptionist";
                        DA=15000;
                        break;
                    }
                     case "m":
                    {
                        desig="Manager";
                         DA=40000;
                        break;
                    }
                }
                int basic=Integer.parseInt(emp[i][5]);
                int hra=Integer.parseInt(emp[i][6]);
                int it=Integer.parseInt(emp[i][7]);
                int salary=basic+hra+it+DA;
                System.out.print(emp[0][0]+"  ");
                System.out.print(emp[0][1]+"  ");
                System.out.print(emp[0][4]+"  ");
                System.out.print(emp[0][3]+"  ");
                System.out.print("Salary");
                System.out.println("");
                System.out.print(emp[i][0]+"     ");
                System.out.print(emp[i][1]+"   ");
                System.out.print(emp[i][4]+"          ");
                System.out.print(desig+"    ");
                System.out.print(salary);
            
                
                }
           
            }
        }
        else{
            System.out.println("There is no employee with empid:"+s);
        }
        }
    }

