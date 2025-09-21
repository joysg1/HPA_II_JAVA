import java.util.Scanner;
import java.util.Arrays;

public class prog_4 {

	public static void main(String[] args) {
		Integer a[]= new Integer [10];
		int i;
		Scanner data= new Scanner(System.in);
		
		for(i=0; i<10; i++) {
			System.out.println("Introduzca el numero #"+(i+1)+":");
			a[i]=data.nextInt();
			
			
					
		}
		ord(a);
		
	}

	
	public static void ord(Integer b[]) {
		Arrays.sort(b);
		System.out.println();
		System.out.println("Vector Ordenado: ");
		for(int n:b) {
			System.out.print(n+ " ");
			
		}
		
		
		
	}
	
	
}
