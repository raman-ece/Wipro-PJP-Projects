
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



/**
 *
 * @author Raman
 */
public class MainClass {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String,List<String>> ts=new TreeMap<>();
        try {
            System.out.println("Enter the number of Emloyees");
            int n=Integer.parseInt(br.readLine());
            
            int c=1;
          String name="";
            
            for(c=1;c<=n;c++) {
                ArrayList<String> al=new ArrayList<>();
               // name="";
                System.out.println("Enter the Employee "+c+" details :");
                System.out.println("Enter the First name");
                name=br.readLine();
                System.out.println("Enter the Second name");
                al.add(br.readLine());
                System.out.println("Enter Mobile");
                al.add(br.readLine());
                System.out.println("Enter Email");
                al.add(br.readLine());
                System.out.println("Enter Address");
                al.add(br.readLine());
                ts.put(name, al);
            }
             Set set=ts.entrySet();
        Iterator i=set.iterator();
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n",
                    "Firstname","Lastname","Mobile","Email","Address");

for (Map.Entry<String, List<String>> entry : ts.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();
          String Secondname=values.get(0);
          String Mobile=values.get(1);
          String Email=values.get(2);
          String Address=values.get(3);
           System.out.format("%-15s %-15s %-15s %-30s %-15s\n",
                    key,Secondname,Mobile,Email,Address);
        }
        } catch (Exception e) {
        }
    }
 
}
