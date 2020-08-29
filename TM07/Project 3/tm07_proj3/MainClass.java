/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tm07_proj3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class MainClass {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<MethodClass> set = new HashSet<>();
		
		for (int i = 0; i < 8; i++) {
			System.out.println("Enter a card:");
			MethodClass card = new MethodClass();
			
			card.setSymbol(sc.nextLine().charAt(0));
			card.setNumber(sc.nextInt());
			sc.nextLine();
			
			set.add(card);
		}
		System.out.println("Four symbols gathered in eight cards.");
		System.out.println("Cards in Set are:");
		
		
		for (MethodClass card : set) 
			System.out.println(card.getSymbol() + " " + card.getNumber());		
		
		sc.close();
	}
}
