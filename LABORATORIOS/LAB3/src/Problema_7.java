import java.util.Scanner;
public class Problema_7 {

	public static void main(String[] args) {
		Scanner data = new Scanner( System.in );
		double a,b;
		System.out.println("Ingrese la cantidad de km/h ");
		a=data.nextDouble();
		b=a*0.277778;
		System.out.println(a+" km/h equivalen a "+ b +" m/s");
		

	}

}
