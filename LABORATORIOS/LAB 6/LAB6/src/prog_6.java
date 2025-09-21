import java.util.Scanner;
public class prog_6 {

	public static void main(String[] args) {
		Scanner data= new Scanner(System.in);
		
		
		int num;
		
		
		
		do{
		System.out.println("Ingrese el numero: ");
		num=data.nextInt();
		}while(num<0);
		factor(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public static void factor(int a) {
		int i;
		long fact=1;
        for(i=a; i>0; i--) {
			
			fact=fact*i;
			
			
			
		}
        System.out.println("El factorial de "+a +" es: "+fact);
		
		
		
		
		
		
		
	}

}
