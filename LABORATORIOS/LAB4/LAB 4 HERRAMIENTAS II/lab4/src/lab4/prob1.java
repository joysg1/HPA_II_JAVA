package lab4;
import java.util.Scanner;

public class prob1 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		Integer num;
		
		System.out.println("Ingrese el numero que desea evaluar: ");
		num=data.nextInt();
		
		if(num%2 ==0)
			System.out.println("El numero "+ num + " es par.");
		else
			System.out.println("El numero "+ num + " es impar.");
		

	}

}
