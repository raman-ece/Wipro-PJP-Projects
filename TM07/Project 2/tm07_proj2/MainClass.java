package tm07_proj2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Raman
 */
public class MainClass {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int choise = 0;
            MethodClass mc = new MethodClass();
            while (choise!=5) {
                System.out.println("1.Insert" + "\n"
                        + "2.Search" + "\n"
                        + "3.Delete" + "\n"
                        + "4.Display" + "\n"
                        + "5.Exit" + "\n"
                        + "Enter your choice:");
                choise = Integer.parseInt(br.readLine());
                switch (choise) {
                    case 1:
                        System.out.println("Enter the item to be inserted:");
                        mc.insert(br.readLine());
                        break;
                    case 2:
                        System.out.println("Enter the item to search:");
                        mc.search(br.readLine());
                        break;
                    case 3:
                        System.out.println("Enter the item to delete:");
                        mc.delete(br.readLine());
                        break;
                    case 4:
                        System.out.println("The items in the list are:");
                        mc.display();
                        break;
                    case 5:
                        System.out.println("Exiting the application");
                        break;
                    default:
                        System.out.println("Please enter a valid choice");
                }
            }
        } catch (Exception e) {
        }
    }
}
