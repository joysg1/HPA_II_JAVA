import java.util.Scanner;
public class prog5 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		int x=0;
		int a=0;
		
		
		System.out.println("Ingrese un numero par: ");
		a=data.nextInt();
		if(a%2!=0) {
			System.out.println("Numero invalido");
			
		}
		else {
			System.out.println("Listado de numeros hasta 2: ");
			System.out.println(a);
			System.out.println("\n");
			while(a!=2) {
				
				a=a-2;
				System.out.println(a);
				System.out.println("\n");
				
				
				
				
				
			}
			
			
		}
		

	}

}
