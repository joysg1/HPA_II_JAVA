/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.prob10;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lab4Prob10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        
        int an;
        
        System.out.println("Input the year: ");
        
        an=data.nextInt();
        
        
        
         if(an%100==0 && an%400==0)
            System.out.println("Si es bisiesto");
         else if(an%4 ==0 && an%100!=0 && an%400!=0)
             System.out.println("Si es bisiesto");
        
        else
            System.out.println("No es bisiesto");
    }
    
}
