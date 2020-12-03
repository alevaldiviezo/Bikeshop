/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputData;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class InputData {
    
    //methods to input data from the user
    
    public static String getText(String prompt){
        //display mesage using prompt
        // get text input from user
        //if not text - output error and ask again
        Scanner myData = new Scanner(System.in);
        
        String userData;
        boolean valid1=false;
        
        do{
            System.out.println(prompt); //Show a message to the user
            userData= myData.nextLine(); //get the data from the user
            
            if(userData.matches("[A-Za-z]+")) {
                valid1 = true;   // if the data introduced is a text this is valid
            
            } else {
            System.out.println("Try Again please, just text");  // if the data introduced is not a text show an error message

            
        }

        }while(!valid1); //If the data introduced is not a text(not valid) repeat the loop
        
        return userData;  //return the data introduced
    }
    
    public static int getInt(String prompt, int minSize, int maxSize){
        //display mesage using prompt
        // get int input from user
        //if not an int - output error and ask again
        Scanner myData = new Scanner(System.in);
        boolean valid =false;
        int userData = 0; // set it to a false value to start the loop
        
        do{
            System.out.println(prompt); // Show message
            System.out.println("must be between "+minSize+" and "+maxSize); //Inform the allowed range
            
            try{
                userData = Integer.parseInt(myData.nextLine());  //if the data introduced is an int, this is valid.
                valid = true;
            }
            catch (Exception e){
                System.out.println("Should be a number!"); //if valid is false show an error message
            }
        }while((!valid) || (userData < minSize) || (userData > maxSize));  // while the data is not an int value or is out of the range specified repeat the loop
        
        return userData;  //return the data introduced
        
    }
    
}
