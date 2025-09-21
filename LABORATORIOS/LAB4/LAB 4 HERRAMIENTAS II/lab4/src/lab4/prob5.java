package lab4;
import java.util.Scanner;
public class prob5 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		char a;
		char b;
		
		System.out.println("Ingrese un caracter: ");
		a=data.next().charAt(0);
		
		System.out.println("Ingrese otro caracter: ");
		b=data.next().charAt(0);
		
		if(Character.isLowerCase(a) && Character.isLowerCase(b))
			System.out.println("Ambos caracteres estan en minuscula. ");
		
		else
			System.out.println("Los dos caracteres no estan en minuscula.");
			

	}

}
