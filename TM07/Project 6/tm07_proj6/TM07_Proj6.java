
package tm07_proj6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raman
 */
public class TM07_Proj6 {
static List<String> al=new ArrayList<String>();
    public static void one(String s1,String s2){
      StringBuilder sb = new StringBuilder();
		for (int i = 1; i < s1.length(); i += 2) {
			sb.append(s2);
			sb.append(s1.charAt(i));
		}
	String alt=sb.toString();
        al.add(alt);
    }
    
    public static void two(String S1,String S2){
        int occurrence = S1.split(S2, -1).length - 1;
		if (occurrence > 1)
			al.add(S1.substring(0, S1.lastIndexOf(S2)) + new StringBuilder(S2).reverse());
                if (occurrence > 1)
			al.add(S1.substring(0, S1.indexOf(S2)) + S1.substring(S1.indexOf(S2) + S2.length(), S1.length()));
    }
    
    public static void four(String S1,String S2){
        int partLength = S2.length() % 2 == 0 ? S2.length() / 2 : S2.length() / 2 + 1;
		al.add(S2.substring(0, partLength) + S1 + S2.substring(partLength, S2.length()));
    }
    public static void five(String S1,String S2){
      StringBuilder  sb = new StringBuilder();
		for (int i = 0; i < S1.length(); i++) {
			if (S2.indexOf(S1.charAt(i)) != -1)
				sb.append('*');
			else
				sb.append(S1.charAt(i));
		}
		al.add(sb.toString());
    }
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        try{
        String S1="JAVAJAVA";
        String S2="VA";
            one(S1, S2);
            two(S1, S2);
            four(S1, S2);
            five(S1, S2);
            System.out.println(al);
        }
        catch(Exception e){
            
        }
    }
    
}
