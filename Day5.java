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
        float value1 = scanner.nextFloat();

        System.out.print("Enter second number: ");
        float value2 = scanner.nextFloat();

        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        float finalvalue = 0;
        
        switch(operation){
            case '+':
                finalvalue = value1 + value2;
                break;
                
            case '-':
                finalvalue = value1 - value2;
                break;
                
            case '*':
                finalvalue = value1 * value2;
                break;
                
            case '/':
                if(value2==0){
                    System.out.println("Undefined");
                }else{
                    finalvalue = value1 / value2;
                }
                break;
                
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Output:");
        System.out.println(value1 +" " + operation + " " + value2 + " = " + finalvalue);
    }
}
