package lab4;
import java.util.Scanner;


public class prob4 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		char a1;
		char b1;
		
		
		
		System.out.println("Ingrese un caracter: ");
		a1=data.next().charAt(0);
		System.out.println("Ingrese otro caracter: ");
		b1=data.next().charAt(0);
		
		int ascii = a1;
		int ascii2= b1;
		
		if(ascii==ascii2)
			System.out.println(a1 + " = " +b1 + " Caracteres iguales.");
		
		
		
		else
			System.out.println("Los caractres "+a1 + " y "+b1 + " no son iguales.");
		
	}

}
