import java.util.Scanner;

public class prog_3 {

	public static void main(String[] args) {
		
		Scanner data= new Scanner(System.in);
		int a[]= new int [10];
		int i;
		
		for(i=0; i<10; i++) {
			System.out.println("Ingrese el numero #" +(i+1));
			a[i]=data.nextInt();
			
			
			
			
			
		}
		System.out.println();
		
		sum(a);
		
		System.out.println();
		
		res(a);
		
		System.out.println();
		
		mul(a);
		
		System.out.println();
		
		div(a);
		

	}
	
	public static void sum(int b[]) {
		int i,suma=0;
		for(i=0; i<10; i++) {
			suma=suma+b[i];
			
			
				
			
		}
		System.out.println("Suma de todos los elmentos= " +suma);
				
		
		
	}
	
	
	public static void res(int b[]) {
		int i, rest=0;
		for(i=0; i<10; i++) {
			rest=rest-b[i];
		}
		System.out.println("Resta de todos los elmentos= "+rest);
		
		
		
		
		
	}
	
	
	public static void mul(int b[]) {
		int i, mult=1;
		for(i=0; i<10; i++) {
			mult=mult*b[i];
			
		}
		System.out.println("Multuplicacion de todos los elementos= "+mult);
		
		
		
		
		
		
	}
	
	
	public static void div(int b[]) {
		int i, divs=1;
		for(i=0; i<10; i++) {
			
			divs=divs/b[i];
			
		}
		System.out.println("Division de todos los elementos= "+divs);
		
		
		
	}
	
	
	
	

}
