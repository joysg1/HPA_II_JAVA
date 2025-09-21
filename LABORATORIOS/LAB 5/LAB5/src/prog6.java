import java.util.Scanner;
public class prog6 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		double a;
		int x=0;
		int y=0;
		int z=0;
		int u=0;
		
		while(x<10 || u!=3) {
		x=x+1;
		System.out.println("Ingrese un periodo bisiesto: ");
		a=data.nextDouble();
		
		
		if(a%400==0) {
			System.out.println("Periodo valido");
			y=y+1;
		} 
		else if(a%4==0 && a%100!=0) {
			System.out.println("Periodo valido");
			z=z+1;
		}
		else {
			System.out.println("Periodo no valido");
			
		}
		u=y+z;
		}
		
		
		
		
		
		

	}

}
