/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.softwareengineerlevelthree;

import java.util.Scanner;

/**
 *
 * @author the-brain
 */
public class SoftwareEngineerLevelThree {

    public static void main(String[] args) {
     
//        Custom();   
//       LogicalOperator()
//        Relational();
//     BitwiseOperator();
//LoopControl();
           Arrays();
    }
    
    
    public static void Custom() {
        
       int Assignment_op = 2;
//       Assignment_op %= 2 ;
       Assignment_op = Assignment_op % 2 ;
       
       
       
       System.out.println("Hello World!"  + Assignment_op);
        
        
        
        
    }
    
    
    public static void LogicalOperator(){
    
//        &&(and) , ||(or), ! (not)


 Boolean A = true;
 Boolean B = false;
 Boolean C = true;
 
 Boolean IsTrueOrFalse = !(A || B) && C;
 
 System.out.println(IsTrueOrFalse);
 
    
    }
    
    
    public static void Relational(){
        
//        == , >= , <= ,> ,< ,!= 


boolean IsTrue;

int A =  5000;
int B = 5000;

IsTrue = A >=  B ;// (A > B || A == B)
IsTrue = A <=  B ;// (A < B || A == B
IsTrue = A != B ;// (A !=  B)

System.out.println(IsTrue);
    
    
    }
    
    
    
    
    public static void BitwiseOperator(){
        
//        & , | , ~


  int  BinaryNumbers =  2 & 3;
  BinaryNumbers =  (2 | 3);
    
  System.out.println(BinaryNumbers);
    
    }
    
    
    
    
    public static void LoopControl(){
        
      
            //WHILE LOOPING
            
            
      int i = 0;   //Initial
      
      while(i < 10 /* Condition*/){
          
          
        System.out.println("Hi, I am Looping " + i); //Code Here
        
        
        //Update
         i = i + 1 ;
      }
      
            
//    FOR LOOP

     //Initial     Condition   Update
for(int j = 0;   j < 10;   j  = j +1){
    
    
    System.out.println("Hi, I am Looping " + j); //Code Here
    
    for(int k = 0;   k < 10;   k  = k +1){
    
    
    System.out.println("Hi, I am Looping " + k); //Code Here


}


}


                    //DO WHILE LOOP
        Scanner DoWhileInput = new Scanner(System.in);
        int z ;
        
      do {
          
          /*code*/ 
          System.out.println("What is your Favourite Number");
          z = DoWhileInput.nextInt();
          
          System.out.println("Your Favourite Number is " + z); 
       
      }while(z != 0 /*condition*/);

        
    }
    
    
    public static void Arrays(){
        
        
     int[][] CollectionOfInteger = { 
                                     {100, 101, 102},
                                     {103, 104 ,105}, 
                                     {100,106, 107 }
                                   };
     
     
     
     for(int row = 0; row < CollectionOfInteger.length; row = row + 1 ){
     
         for(int col = 0; col < CollectionOfInteger.length; col = col + 1 ){
     
         System.out.print(CollectionOfInteger[row][col] + " ");
          
     
     }  
         System.out.println();
         System.out.println();
         System.out.println();
     
     }  
//       int row = 0;
//       int col =0;
//       while(row< CollectionOfInteger.length){
//       
//            
//            
//            while(col< CollectionOfInteger.length){
//       
//            System.out.println(CollectionOfInteger[row][col]);
//            
//            col = col + 1 ;
//            
//             
//       
//       }
//            
//        row = row + 1 ;   
//       
//       }
       
      
    
    
    
    
    
    }
    
  
    
 
    
    
    
    
    
}
