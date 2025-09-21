package lab4;
import java.util.Scanner;

public class prob6 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		int h;
		int m;
		
		do {
			System.out.println("Ingrese la hora en formato de 24 h: ");
			h=data.nextInt();
												
		}while(h<0  || h>23);
		
	  do {
		  System.out.println("Ingrese los minutos: ");
		  m=data.nextInt();
		  
		  
		  
	  }while(m<0  || m>59);

	
	
	if(h>12) {
		h=h-12;
		System.out.println("La hora es: "+ h + ":"+m);

	
	}
	
	else if(h==0) {
		h=h+12;
		System.out.println("La hora es: "+ h + ":"+m);
		
	
	}
	
	else
		
		System.out.println("La hora es: "+ h + ":"+m);
	
}
	
}	
