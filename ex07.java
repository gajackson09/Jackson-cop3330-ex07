/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this program calculates the area of a room
import java.util.Scanner;
public class ex07{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      //asks user for input 
      System.out.print("What is the length of the room in feet? ");
        double length = input.nextDouble();
      System.out.print("What is the width of the room in feet? ");
        double width = input.nextDouble();
      System.out.println("You entered dimension of "+length+" by "+width+" feet");

      //finds the area for the room  
      double area = length * width;
      final double conversionFactor = area*0.09290304;
      
      //this prints out the 
      System.out.println("The area is:");
      System.out.println(area+" square feet");
      System.out.println(conversionFactor+" square meters");
   }//end of main
}//end of class