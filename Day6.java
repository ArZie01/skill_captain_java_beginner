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
public class Day6 {
    public static void main(String args[]) {
        System.out.print("For Loop:");
        for(int i=1; i<=10; i++){
            System.out.print(" "+i);
        }
        
        System.out.println("");
        System.out.print("While Loop:");
        int i=0;
        while(i<=20){
            i+=2;
            System.out.print(" "+i);
        }
        
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.print("Enter a Number Between 1 and 10: ");
            input = scanner.nextInt();
        } while (input < 1 || input > 10);
        
        System.out.println("You entered " + input);
    }
}
