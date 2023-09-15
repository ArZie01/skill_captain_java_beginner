/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package skillcaptain;

import java.util.ArrayList;

/**
 *
 * @author kurta
 */
public class Day8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       ArrayList myList = new ArrayList();
       
       myList.add("Math");
       myList.add("English");
       myList.add("Science");

       System.out.print("Items: ");
       for(int i=0; i<myList.size(); i++){
           System.out.print(myList.get(i)+ " ");
       }
       
        System.out.println("");
        myList.remove("English");
        System.out.print("Updated Items: ");
        for(int i=0; i<myList.size(); i++){
           System.out.print(myList.get(i)+ " ");
       }
        
        System.out.println("");
        System.out.println("Does my List have English: "+myList.contains("English"));
        
        myList.clear();
        System.out.println("My List: " + myList);
    }
}
