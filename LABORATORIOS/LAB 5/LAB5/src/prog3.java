import java.util.Scanner;
public class prog3 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		int x=0;
		int tab=0;
		int prod=0;
		
		System.out.println("Ingrese el numero de la tabla de multiplicar que desea: ");
		tab=data.nextInt();
		System.out.println("Tabla del "+tab);
		
		while(x<12) {
			x=x+1;
			prod=x*tab;
			System.out.println(tab + " X " + x +" = " +prod);
			System.out.println("\n");
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		

	}

}
