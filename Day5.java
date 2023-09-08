/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skillcaptain;

import java.util.Scanner;

/**
 *
 * @author kurta
 */
public class Day5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        float value1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        float value2 = scanner.nextInt();
        
        System.out.print("Enter operation (+,-,*,/): ");
        String operation = scanner.nextLine();
        
        switch(operation){
            case "+":
                float finalvalue = value1 + value2;
                System.out.println("Output:");
                System.out.println(value1 + " + " + value2 + " = " + finalvalue);
                break;
                
            case "-":
                finalvalue = value1 + value2;
                System.out.println("Output:");
                System.out.println(value1 + " - " + value2 + " = " + finalvalue);
                break;
                
            case "*":
                finalvalue = value1 * value2;
                System.out.println("Output:");
                System.out.println(value1 + " * " + value2 + " = " + finalvalue);
                break;
                
            case "/":
                finalvalue = value1 / value2;
                System.out.println("Output:");
                System.out.println(value1 + " - " + value2 + " = " + finalvalue);
                break;
        }
    }
}
