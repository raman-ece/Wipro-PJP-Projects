/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pblapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Raman
 */
class Video extends VideoStore{
    String videoName;
    boolean checkout;
    int ratig;

    public Video(String name) {
        
        this.videoName=name;
    }
    
    
    
    String getName(){
       return this.videoName;
    }
    
    void doCheckout(){
        
    }
    void doReturn(){
        
    }
    void receiveRating (int rating){
        
    }
    int getRating(){
        return 0;
    }
    boolean getCheckout(){
        
        return true;
    }
}

class VideoStore{
    
     String[][] video=new String[50][3];

    
    void addVideo(String name){
        Video obc=new Video(name);
        for (int i = 0; i < video.length; i++) {
            if (video[i][0]==null) {
              video[i][0]=obc.getName();
              video[i][1]="false";
              video[i][2]="0";
                break;
            }
            
        }
    }
    void doCheckout(String name){
        for (int i = 0; i < video.length; i++) {
            if(video[i][0].equals(name)){
               video[i][1]=true+"";
               break;
            }
            else{
                continue;
            }
        }
    }
    void doReturn(String name){
        for (int i = 0; i < video.length; i++) {
            if(video[i][0].equals(name)){
               video[i][1]=false+"";
               break;
            }
            else{
                continue;
            }
        }
    }
    void receiveRating(String name,int rating){
        for (int i = 0; i < video.length; i++) {
            if(video[i][0].equals(name)){
                video[i][2]=rating+"";
                break;
            }
            else{
                continue;
            }
       }
        
    }
    void listInventory(){
        System.out.println("-----------------------------------------\n"
                + "VIDEO | CheckOut Status | Rating");
        for (int i = 0; i < video.length; i++) {
            if (video[i][0]==null) {
                continue;
            }
            else{
            for (int j = 0; j < video[i].length; j++) {
                
                System.out.print(video[i][j]+"         ");
                
            }
            System.out.println("");}
        }
        System.out.println("-----------------------------------------");
    }
}

public class VideoLauncher{
    public static void menu(){
        System.out.println("");
        System.out.println("MAIN Menu\n"
        +"=============\n"
        +"1. Add Videos:\n"
        +"2. Check Out Video:\n"
        +"3. Return Video:\n"
        +"4. Receive Rating:\n"
        +"5. List Inventory:\n"
        +"6. Exit:\n"
        +"Enter your choise(1....6): ");
        
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int choise=-1;
         menu();
          
          VideoStore obj=new VideoStore();
         while(choise!=6){
             choise=Integer.parseInt(br.readLine());
             switch(choise){
                 case 1:
                     System.out.println("Enter the name of the video you want to add:");
                     String name=br.readLine();
                     obj.addVideo(name);
                     System.out.println("video '" +name+ "' added Successfully");
                     menu();
                 break;
                 case 2:
                     System.out.println("Enter the name of the video you want to chechout:");
                     String check=br.readLine();
                     obj.doCheckout(check);
                     System.out.println("Video '"+check+"' checked out successfully.");
                     menu();
                     break;
                 case 3:
                     System.out.println("Enter the name of the video you want to return:");
                     String ret=br.readLine();
                     obj.doReturn(ret);
                     System.out.println("Video '"+ret+"' returned successfully.");
                     menu();
                 break;
                 case 4:
                     System.out.println("Enter the name of the video you want to rate:");
                     String rate=br.readLine();
                     System.out.println("Enter the rating for this video:");
                     int rating=Integer.parseInt(br.readLine());
                     obj.receiveRating(rate, rating);
                     System.out.println("Rating "+rating+" has been mapped to the video '"+rate+"'");
                     menu();
                 break;
                 case 5:
                     obj.listInventory();
                     menu();
                 break;
                 case 6:
                    
                 break;
                 default: 
                     System.out.println("Please select valid option");
                     menu();
                 break;
             }
             
         }
         System.out.println("Exiting.....Thanks for using the application!");
    }
}
