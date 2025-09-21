package lab4;
import java.util.Scanner;

public class prob7 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Ingrese el primer numero: ");
		a=data.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		b=data.nextInt();
		System.out.println("Ingrese el tercer numero: ");
		c=data.nextInt();
		
		if(a>b && a>c)
			System.out.println(a + " Es el numero mayor.");
		else if(b>a && b>c)
			System.out.println(b + " Es el numero mayor.");
		else
			System.out.println(c + " Es el numero mayor.");
			
		
		
		

	}

}
