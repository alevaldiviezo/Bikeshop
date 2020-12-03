/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop;

import Bikes.Bicycle;   // import Bicycle class 
import InputData.InputData;  //Import from InpuData class

/**
 *
 * @author Alejandro
 */
public class Bikeshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] bikes = new String[5];   // Declare an array of 5 elements to store the 5 bicycles
        // Declare variables size as an int and colour as a string
        int size;  
        String colour;
        // loop to repeat five times and generate 5 bikes, as was required in the excercise
        for(int i=0; i<5;i++){
            // call methods from InputData
            size = InputData.getInt("Please specify size of your bike:", 16, 30);  // request getInt method to save the size
            colour = InputData.getText("Now tell us what colour would you like your bike?"); //request getText method to save the colour
        
            Bicycle myBicycle = new Bicycle(size,colour); // generate a new Bicycle with the variables saved
            bikes[i] = myBicycle.cycleBike(); // Save each bicycle as an element of bikes array
            
        }
        for(int i=0;i<5;i++){
            System.out.println(bikes[i]);  // print each element of bikes array
        }
        
        
    }
    
}
