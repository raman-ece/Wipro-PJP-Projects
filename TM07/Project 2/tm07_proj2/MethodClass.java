/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tm07_proj2;

import java.util.*;

/**
 *
 * @author Raman
 */
public class MethodClass {

    List<String> al=new ArrayList<String>();
    
    public void insert(String item){
        al.add(item);
        System.out.println("Inserted Successfully");
    }
    public void delete(String item){
        if (al.contains(item)) {
            al.remove(item);
            System.out.println("Deleted Successfully");
        }
        else{
            System.out.println("Item does not exist");
        }
    }
    public void search(String item){
        if(al.contains(item)){
            System.out.println("Item found in the list");
        }
        else System.out.println("Item not found in the list");
    }
    public void display(){
       Iterator i=al.iterator();
       while(i.hasNext()){
           System.out.println(i.next());
       }
    }
    
}
