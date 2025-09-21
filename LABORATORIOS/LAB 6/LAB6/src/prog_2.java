import java.util.Scanner;

public class prog_2 {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		int x1,x2;
		
		
		do {
		System.out.println("Ingrese el valor de N para f(N): ");
		x1=data.nextInt();
		System.out.println("Ingrese el valor de N para g(N) ");
		x2=data.nextInt();
		}while(x1<x2 || x1==x2);
		
		op(x1);
		op2(x2);
		
		
		

	}
	
	
	public static void op(int a){
		
		int r;
		
		r=20*a*a +100;
		System.out.println("Valor f(N): "+r);
		
		
		
				
		
		
		
		
	}
	
	
	
	public static void op2(int b) {
		
		int r2;
		
		r2=(b*b*b) +2*b +17;
		
		System.out.println("Valor g(N): "+r2);
		
		
		
		
	}

}
