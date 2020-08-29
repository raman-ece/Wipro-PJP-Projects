
package tm07_proj5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        List<String> al=new ArrayList<>();
        List<String> st=new ArrayList<>();
        List<Double> unique=new ArrayList<>();
        MethodClass mc=new MethodClass();
        try {
            int T=Integer.parseInt(br.readLine());
            int c=1;
            double volume;
            while (c<=T) {                
                System.out.println("Enter box "+c +" details");
                System.out.println("Enter Length");
                al.add(br.readLine());
                System.out.println("Enter Width");
                al.add(br.readLine());
                System.out.println("Enter Height");
                al.add(br.readLine());
                c++;
            }
            
            for(int i=0;i<al.size();i=i+3){
                volume=Double.parseDouble(al.get(i))*Double.parseDouble(al.get(i+1))*Double.parseDouble(al.get(i+2));
                if (unique.contains(volume)) {
                    continue;
                }
                else {
                    unique.add(volume);
                    st.add(al.get(i));st.add(al.get(i+1));st.add(al.get(i+2));
                    mc.insert(volume);
                }
               // System.out.println("Volume ="+volume);
            }
            System.out.println("Unique Boxes in the set are:");
            for (int i = 0; i < unique.size(); i++) {
                
                for (int j = 0; j < st.size(); j=j+3) {
                    Double temp=Double.parseDouble(st.get(j))*Double.parseDouble(st.get(j+1))*Double.parseDouble(st.get(j+2));
                    if ((unique.get(i)/temp)==1) {
                        System.out.print("Length = "+st.get(j)+" ");
                        System.out.print("Width = "+st.get(j+1)+" ");
                        System.out.print("Height = "+st.get(j+2)+" ");
                        System.out.print("Volume ="+unique.get(i)+" ");
                    }
                }
                System.out.println("");
            }
        } catch (Exception e) {
        }
    }
}
