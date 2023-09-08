/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package skillcaptain;

import java.util.Scanner;

/**
 *
 * @author kurta
 */
public class Day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input Your Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Input Your Age: ");
        int age = scanner.nextInt();
        
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
