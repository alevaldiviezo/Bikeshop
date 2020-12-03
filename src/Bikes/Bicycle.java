package Bikes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public class Bicycle {
    
    //PROPERTIES As have been specified in the excercise
    // Declare the properties
    private int size;
    private String colour;
    
    //CONSTRUCTORS As have been specified in the excercise
    public Bicycle(int size, String colour){
        //Construct the variables
        this.size = size;
        this.colour = colour;
    }
    
    //METHOD As has been specified in the excercise
    public String cycleBike(){
    // Create a method that generates a string whith the text required and include the variable
        
    String msg = "I am cycling the "+ this.colour +" bike";
    
    return msg; //return the string created before
}
    
}
