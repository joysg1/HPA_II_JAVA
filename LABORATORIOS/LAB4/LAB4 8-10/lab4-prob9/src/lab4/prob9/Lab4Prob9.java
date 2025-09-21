/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.prob9;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lab4Prob9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner data= new Scanner(System.in);
        
        int mes,dia;
        
        
        do{
        System.out.println("Ingrese el numero del mes: ");
        mes=data.nextInt();
        
        switch(mes){
            case 1: 
                System.out.println("Enero");
                System.out.println("30 dias");
                break;
            case 2:
                System.out.println("Febrero");
                System.out.println("28 dias");
                
                break;
            case 3:
                System.out.println("Marzo");
                System.out.println("31 dias");
                break;
                
            case 4:
                System.out.println("Abril");
                System.out.println("30 dias");
                break;
                
                
            case 5:
                System.out.println("Mayo");
                System.out.println("31 dias");
                break;
                
            case 6:
                System.out.println("Junio");
                 System.out.println("30 dias");
                break;
                
            case 7:
                System.out.println("Julio");
                System.out.println("31 dias");
                break;
                
                
            case 8:
                System.out.println("Agosto");
                System.out.println("31 dias");
                break;
                
                
                
            case 9:
                System.out.println("Septiembre");
                 System.out.println("30 dias");
                break;
                
                
                
            case 10:
                System.out.println("Octubre");
                System.out.println("31 dias");
                break;
                
                
            case 11:
                System.out.println("Noviembre");
                 System.out.println("30 dias");
                break;
                
                
            case 12:
                System.out.println("Diciembre");
                System.out.println("31 dias");
                break;
                
             
        
        
        
        
        
        
        
        
        
        
        }
        }while(mes<1 || mes>12);
       
                 
             
                 
             
                 
        
       
        
        
        
        
        
        
        
        
        
    }
    
}
