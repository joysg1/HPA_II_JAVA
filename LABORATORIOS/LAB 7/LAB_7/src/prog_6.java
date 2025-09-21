import java.util.Scanner;
public class prog_6 {

	public static void main(String[] args) {
		String pal;
		Scanner data=new Scanner(System.in);
		
		System.out.println("Ingrese una palabra: ");
		pal=data.nextLine();
		rev(pal);
		

	}
	
	
	public static void rev(String a) {
		int i;
		String palinv="";
		int l=a.length()-1;
		System.out.println();
		
		for(i=l; i>=0; i--) {
			palinv= palinv +a.charAt(i);
			
		}
		
		System.out.println("La palabra invertida es: "+palinv);
		
		
		
		
		
		
		
	}

}
