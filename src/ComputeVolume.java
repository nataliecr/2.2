/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Natalie
 */
import java.util.Scanner;

public class ComputeVolume {
  public static void main(String[] args){
      final double PI = 3.14159;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the radius and length of a cylinder: ");
      double radius = input.nextDouble();
      double length = input.nextDouble();
      
      double area = radius * radius * PI;
      double volume = area * length;
      
      System.out.println("The area is " + area);
      System.out.println("The volume is " + volume);
  } // main   
} // ComputeVolume
