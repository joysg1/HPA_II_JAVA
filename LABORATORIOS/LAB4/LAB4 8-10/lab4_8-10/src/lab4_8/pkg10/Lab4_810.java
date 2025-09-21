/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_8.pkg10;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lab4_810 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner data= new Scanner(System.in);
        
        int H,M,S;
        do{
        System.out.println("Ingrese la hora en formato de 24 horas: ");
        H=data.nextInt();
    }while(H<0 || H>23);
        
        
        do{
        System.out.println("Ingrese los minutos: ");
        M=data.nextInt();
    }while(M<0 || M>59);
        
        
        
        do{
        System.out.println("Ingrese los segundos: ");
        S=data.nextInt();
    }while(S<0 || S>59);
        
        
        System.out.println("La hora ingresada es: "+ H+ ":" +M +":" + S);
        
        
        
    
}
    

}
