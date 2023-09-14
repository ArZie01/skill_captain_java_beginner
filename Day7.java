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
public class Day7 {

    /**
     * @param args the command line arguments 
     */
    public static void main(String args[]) {
        
        //Put 5 integers in an Array
        int[] myArray = new int[5];
        System.out.println("Enter 5 integer numbers: ");
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<5; i++){
            myArray[i]  = scanner.nextInt();
        }
        
        //Print Array
        System.out.print("The array is: ");
        for(int i=0; i<myArray.length; i++){
            System.out.print(myArray[i]+ " ");
        }
        
        //Compute Sum
        int sum = 0;
        for(int i=0; i<myArray.length; i++){
            sum += myArray[i];
        }
        System.out.println("");
        System.out.println("Sum is: " + sum);
        
        //Compute Average
        double j=0;
        for(int i=0; i<myArray.length; i++){
            j += myArray[i];
        }
        double ave=0;
        ave = j/myArray.length;
        System.out.println("Average is: "+ ave);
        
        //Compute Maximum
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("Maximum is: " + max);
        
        //Compute Minimum
        int min = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        System.out.println("Minimum is: " + min);
        
    }
}
