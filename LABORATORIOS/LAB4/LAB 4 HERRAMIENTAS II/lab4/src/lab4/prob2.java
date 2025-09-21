package lab4;
import java.util.Scanner;

public class prob2 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		Integer num;
		Integer aux;
		
		
		System.out.println("Ingrese el numero que desea evaluar: ");
		num=data.nextInt();
		aux = num/10;
		
		if(aux==10)
			System.out.println("El numero "+num+ " es multiplo de 10");
		else
			System.out.println("El numero "+num+ " no es multiplo de 10");
		

	}

}
