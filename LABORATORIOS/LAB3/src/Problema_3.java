import java.util.Scanner;
public class Problema_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double u=3.1416;
		final int co=2;
		Scanner data = new Scanner( System.in );
		double r,h,al,vol;
		
		
		
		
		System.out.println("Introduzca el radio del cilindro: ");
		r=data.nextDouble();
		System.out.println("Introduzca la altura del cilindro: ");
		h=data.nextDouble();
		al= co * u * r * h;
		System.out.println("El area lateral del cilindro es: "+ al);
		vol=u*r*r*h;
		System.out.println("El volumen del cilindro es: "+vol);
		
		
		
		
		
		
		

	}

}
