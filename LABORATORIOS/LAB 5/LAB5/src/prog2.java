import java.util.Scanner;
public class prog2 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		int x=0;
		int a=0;
		
		while(x<10) {
			x=x+1;
			System.out.println("Ingrese el valor de a " + "#" +x);
			a=data.nextInt();
			if(a<0) {
				System.out.println("El numero es negativo");
			    System.out.println("\n");}
			else if(a>0) {
				System.out.println("El numero es positivo");
			    System.out.println("\n");}
			else {
				System.out.println("El numero es 0");
			    System.out.println("\n");}
			
			
			
			
			
			
			
			
			
			
			
		}

	}

}
