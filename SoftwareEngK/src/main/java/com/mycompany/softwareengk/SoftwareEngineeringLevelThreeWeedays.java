/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.softwareengk;

import java.util.Scanner;

/**
 *
 * @author the-brain
 */
public class SoftwareEngineeringLevelThreeWeedays {

 

    public static void main(String[] args) {
       
        
//        Logical(&& , || , ! ,)  And Relational(== , != , < , >, <= , >= ,.equal) Operator

//Write A program That Takes Three Numbers And Checks Which is The Gereatest


//  Scanner Engineer = new Scanner(System.in);
//  
//    try {
//  
//  System.out.println("Input First Number") ;
//  int FirstNumber = Engineer.nextInt();
//  
//  System.out.println("Input Second Number") ;
//  int SecondNumber = Engineer.nextInt();
//  
//  System.out.println("Input Third Number") ;
//  int ThirdNumber = Engineer.nextInt();
//  
//  Boolean First = (FirstNumber >SecondNumber &&  FirstNumber >ThirdNumber);
//  Boolean Second  = (SecondNumber > FirstNumber && SecondNumber >ThirdNumber ) ;
//  Boolean  Third =  (ThirdNumber > FirstNumber && ThirdNumber >SecondNumber ) ;
//  
//
//      
//  if(First){
//      
//      System.out.println("First Number Is The Largest");
//      
//  }else if(Second){
//  
//   System.out.println("Second Number Is The Largest");
//   
//  }else if(Third){
//  
//   System.out.println("Third Number Is The Largest");
//   
//  }else {
//  
//   System.out.println("Do It The Right Way!!!");
//  }
//  }catch(Exception e){ 
//  
//  System.out.println("Integer Only " + e.toString());
//  }
  
    
    
//    == , != , < , >, <= , >=


//Write A program to Whether a person can vote or not

//Scanner voter = new Scanner(System.in);
//
// System.out.println("What is Your  Age ?");
// 
//int age = voter.nextInt();
//
//Boolean vote  = 18 >= 18 ;
//
//System.out.println("If True ,can vote else cant "+ vote);




//Write a program to check whether a number is an even or odd


//Scanner EvenOdd  = new Scanner(System.in);
//
//System.out.println("Please Input A Number");
//float Number  =  EvenOdd.nextFloat();
//
//System.out.println(Number);
//
// float EvenNumber = Number % 2;
// 
// 
// Boolean IsEven = EvenNumber == 0;
// 
// System.out.println(IsEven);
// 
 
// Write A program to Display the last digit of any number


//Scanner DigitOfNumber  = new Scanner(System.in);
//
//System.out.println("Enter A Number ");
//int num = DigitOfNumber.nextInt();
//
//System.out.println(num%10);





//
//Scanner MotionDetector = new Scanner(System.in);
//
// System.out.println("Type Number Of People");
//  int NumberOfPeople = MotionDetector.nextInt();
//  
//  Boolean Bright = NumberOfPeople==3;
//  Boolean Dim = NumberOfPeople==2;
//  Boolean Dimmer = NumberOfPeople==1;
//  Boolean Off = NumberOfPeople== 0;
//  
//  System.out.println("Is The light Bright ? " + Bright );
//  System.out.println("Is The light Dim ? " + Dim );
//  System.out.println("Is The light Dimmer ? " + Dimmer );
//  System.out.println("Is The light Off ? " + Off );



//If Statement

//String MyName = "h";
//String MyPassword = "w";
//
//Scanner NamePass = new Scanner(System.in);
//
//System.out.print("Please enter your name ");
//String Name = NamePass.next();
//System.out.print("Please enter your password");
//String Password = NamePass.next();




//boolean Condition1 = false;
//boolean Condition2 = false;
//boolean Condition3 = false;
//boolean Condition4 = false;
//boolean Condition5 = false;
//
//
//
//if(Condition1){
//
//    System.out.println("Condition1");
//
//}else if(Condition2){
//
//System.out.println("Condition2");
//}else if(Condition3){
//
//    System.out.println("Condition3");
//
//}else if(Condition4){
//
//System.out.println("Condition4");
//}else if(Condition5){
//
//    System.out.println("Condition5");
//
//}else{
//    
//    System.out.println("Condition not Satisfied");
//
//}  

//Nested If Statement

//if (true) {
//    
//    System.out.println("First Nested Loop");
//
//    
//    if(true){
//        
//        System.out.println("Second Nested Loop");
//        
//        if(false){
//        
//        System.out.println("Third Nested Loop");
//        
//        }
//         
//    }
    
    
//    Switch Case

//Scanner User =new Scanner(System.in);
//
//System.out.println("UserIput");
//System.out.println("AnotherUserInput");
//System.out.println("MoreUserInput");
//
//System.out.println("Make Your Choice");
//String  InputFromUser = User.nextLine();
//
//
//switch(InputFromUser){
//
//    case "UserIput": System.out.println("UserIput");
//       break; // To break the loop
//       
//    case "AnotherUserInput": System.out.println("AnotherUserInput");
//       break; // To break the loop
//       
//    case "MoreUserInput": System.out.println("MoreUserInput");
//       break; // To break the loop
//       
//    default: //What to if InputFromUser is not "userIput","AnotherUserInput",
//        //"moreUserInput"
//        System.out.println("Wrong Choice Try Again Next Time");
//        
//   
//
//
//}
//
//
String[] MyArray = {"12","123"};

System.out.println(FunMeaning1(MyArray)[1]);
System.out.println(FunMeaning2());
}


  static String[] FunMeaning1(String[] args ){

      String[] MyArray = args ;


 return MyArray;
}
  
 
  static int FunMeaning2(){



return 1 ;

}
    
    
    
    
    
 static void MyLoops(){
    
    
    //WHILE LOOP
    
//     int i = -9;  //initial
//     
//     while(i < 11 /* Condition */) {
//    
//         System.out.println(i + " I am loop");//Code Here 
//         
//          i = i + 2; //Update
//          System.out.println(i + " Update");//Code Here 
//    }
     
     //FOR
     
//     for(int j = 1; /* initial */ j <=10; /* Condition*/ j= i +1 /* Update */){
//     
//     
//          System.out.println(j + " I am loop");//Code Here     
//     
//     }
     
     //Do While
     
//     Scanner UserInput = new Scanner(System.in);
//     
//     String  k;
//     do{
//         
//        System.out.println("1. Start Game");
//        System.out.println("2. Resume Game");
//        System.out.println("3. Setting");
//        System.out.println("4. Training");
//        System.out.println("x. Exit");
//        System.out.println("");
//        System.out.println("Enter An Option");
//        k =  UserInput.nextLine();
//         
//     
//     }while(   ! "x".equals(k)/*condition*/) ;
     
     
     
     
     
  
}




    
    
    
}
