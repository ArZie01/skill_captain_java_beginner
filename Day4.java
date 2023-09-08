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
public class Day4 {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input two integer values");
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        
        if (value1>value2){
            System.out.println("The value " + value1 + " is larger than " + value2 + ".");
        }else if(value1<value2){
            System.out.println("The value " + value1 + " is smaller than " + value2 + ".");
        }else{
            System.out.println("The value " + value1 + " is equal to " + value2 + ".");
        }
        
    }
}
