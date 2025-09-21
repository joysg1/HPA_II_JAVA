/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numberdivision;
import java.util.Scanner;
import java.lang.Exception;

/**
 *
 * @author 7040 i5 lab7
 */
public class NumberDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a,b;
        Scanner data= new Scanner(System.in);
        System.out.println("Ingrese el 1er dato: ");
        a=data.nextLine();
        System.out.println("Ingrese el 2do dato: ");
        b=data.nextLine();
        conv(a,b);
        
    }
    
    
    public static void conv(String a, String b){
    
    int div=0;  
    int val1=0;
    int val2=0;
    try{
    val1 = Integer.parseInt(a);
    
    
    }
    catch(Exception e){
        System.out.println("ERROR El dato 1 no corresponde a un numero.");
    
    
    
    
    }
    
    try{
    
    val2= Integer.parseInt(b);
    }
    
    catch(Exception e){
    System.out.println("ERROR El dato 2 no corresponde a un numero.");
    
    }
    
    try{
    div=val1/val2;
    System.out.println("Division = "+div);
    }
    
    catch(Exception e){
    System.out.println("ERROR Esta dividiendo por 0");
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
