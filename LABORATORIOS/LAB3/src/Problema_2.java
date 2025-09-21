import java.util.Scanner;
public class Problema_2 {

	public static void main(String[] args) {
		Scanner data = new Scanner( System.in );
		float a,b,c,an1,an2,an3,an4;
		System.out.println("Introduzca el cateto opuesto: ");
		a=data.nextFloat();
		System.out.println("Introduzca el cateto adyacente: ");
		b=data.nextFloat();
		c=(float)Math.sqrt(a*a+b*b);
		System.out.println("La hipotenusa del triangulo es: "+ c);
		an1=(float)Math.atan(b/a);
		an2=(float)Math.atan(a/b);
		an3=(float)Math.toDegrees(an1);
		an4=(float)Math.toDegrees(an2);
		System.out.println("El angulo 1 es: "+ an3);
		
		System.out.println("El angulo 2 es: "+an4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
