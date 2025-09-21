import java.util.Scanner;
public class Problema_4 {

	public static void main(String[] args) {
		Scanner data = new Scanner( System.in );
		double p1,p2,p3,po1,po2,s,por,pt,pot,port,st,not;
		System.out.println("EVALUACION DE LOS PARCIALES");
		System.out.println("Introduzca la nota del parcial #1: ");
		p1=data.nextDouble();
		System.out.println("Introduzca la nota del parcial #2: ");
		p2=data.nextDouble();
		System.out.println("Introduzca la nota del parcial #3: ");
		p3=data.nextDouble();
		System.out.println("EVALUACION DE LOS PROYECTOS");
		System.out.println("Introduzca la nota del proyecto #1: ");
		po1=data.nextDouble();
		System.out.println("Introduzca la nota del proyecto #2 ");
		po2=data.nextDouble();
		System.out.println("EVALUACION DEL PORTAFOLIO");
		System.out.println("Introduzca la nota del portafolio: ");
		por=data.nextDouble();
		System.out.println("EVALUACION DEL SEMESTRAL");
		System.out.println("Introduzca la nota del semestral: ");
		s=data.nextDouble();
		pt=((p1+p2+p3)/3)*0.33;
		pot=((po1+po2)/2)*0.20;
		port=(por)*0.07;
		st=(s)*0.40;
		System.out.println("RESULTADOS FINALES");
		System.out.println("Parciales: "+pt +" %");
		System.out.println("Proyectos "+pot +" %");
		System.out.println("Portafolio "+port +" %");
		System.out.println("Semestral "+st+" %");
		not=pt+pot+port+st;
		System.out.println("Porcentaje obtenido: "+not +" %");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
