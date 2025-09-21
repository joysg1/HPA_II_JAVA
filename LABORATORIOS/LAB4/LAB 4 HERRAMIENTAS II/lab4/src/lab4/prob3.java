package lab4;
import java.util.Scanner;

public class prob3 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		char letra;
		
		System.out.println("Ingrese el caracter que desea evaluar: ");
		letra = data.next().charAt(0);
		
		if(Character.isUpperCase(letra))
			System.out.println("El caracter "+ letra + " esta en mayuscula.");
		
		else
			System.out.println("El caracter "+ letra + " esta en minuscula.");
		

	}

}
