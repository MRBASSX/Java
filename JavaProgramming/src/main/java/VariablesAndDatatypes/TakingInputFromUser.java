/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VariablesAndDatatypes;

/**
 *
 * @author the-backup
 * 
 */

import java.util.Scanner;

public class TakingInputFromUser {
    
    public static void main(String [] args){
        
        Scanner Abass = new Scanner(System.in);
        
      
        System.out.println("Input First Number ?");
        float First = Abass.nextFloat();
        
        System.out.println("Input Second Number ?");
        float Second = Abass.nextFloat();
        
    
        System.out.println("The Sum Of " + First + " + " + Second + " == "+ (Second + First));
        System.out.println("The modulo Of " + First + " % " + Second + " == "+ (Second % First));


     
    }
    
}
