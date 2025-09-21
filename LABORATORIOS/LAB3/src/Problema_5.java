import java.util.Scanner;
public class Problema_5 {

	public static void main(String[] args) {
		Scanner data = new Scanner( System.in );
		double a,b,c,t,t2,tr;
		
		System.out.println("Introduzca la venta 1");
		a=data.nextDouble();
		System.out.println("Introduzca la venta 2");
		b=data.nextDouble();
		System.out.println("Introduzca la venta 3");
		c=data.nextDouble();
		
		t=a+b+c;
		t2=t*0.10;
		tr=t2+t;
		
		System.out.println("El salario del trabajador este mes es de: "+tr + " dolares");
		
		
		
		
		
		
		

	}

}
