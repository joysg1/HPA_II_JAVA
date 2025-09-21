package metodos;
import java.util.Scanner;

public class prob1 {

	public static void main(String[] args) {
		
		int est;
		Scanner data = new Scanner(System.in);
		System.out.println("Ingrese el numero de estudiantes: ");
		est=data.nextInt();
		
		nest(est);
		
		
		

	}
	
	
	public static void nest(int a) {
		int i,n1,n2,n3,n4, prom;
		char cal;
		StringBuffer nom;
		
		Scanner data = new Scanner(System.in);
		for(i=0; i<a; i++) {
			nom=null;
			n1=0;
			n2=0;
			n3=0;
			n4=0;
			prom=0;
			System.out.println("Estudiante # "+(i+1));
			System.out.println("Ingrese el nombre del estudiante: ");
			nom.toString();
			nom=data.nextLine();
			
			
			data.nextLine();
			
			System.out.println("Ingrese la nota 1: ");
			n1=data.nextInt();
			System.out.println("Ingrese la nota 2: ");
			n2=data.nextInt();
			System.out.println("Ingrese la nota 3: ");
			n3=data.nextInt();
			System.out.println("Ingrese la nota 4: ");
			n4=data.nextInt();
			prom=(n1+n2+n3+n4)/4;
			if(prom>=0 && prom<=60)
				cal='F';
			else if(prom>=61 && prom<=70)
				cal='D';
			else if(prom>=71 && prom<=80)
				cal='C';
			else if(prom>=81 && prom<=90)
				cal='B';
			else
				cal='A';
			System.out.println("Nombre del estudiante: "+nom);
			
			System.out.println("Promedio: "+prom);
			System.out.println("Calificacion: "+cal);
			System.out.println("");
			
			
			
			
			
			
					
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
