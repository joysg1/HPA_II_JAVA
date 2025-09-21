import java.util.Scanner;

public class prog_5 {

	public static void main(String[] args) {
		String pal;
		Scanner data=new Scanner(System.in);
		
		System.out.println("Introduzca la cadena: ");
		pal=data.nextLine();
		
		int l=pal.length();
		
		int i;
		int j=0;
		
		for(i=1; i<l; i++) {
			if(pal.charAt(i)=='a' || pal.charAt(i)=='e'|| pal.charAt(i)=='i' || pal.charAt(i)=='o' || pal.charAt(i)=='u') {
			j=j+1;	
			
			}
			}
			
		System.out.println("La palabra "+pal +" tiene "+ j + " vocales.");
			
		

	}

}
