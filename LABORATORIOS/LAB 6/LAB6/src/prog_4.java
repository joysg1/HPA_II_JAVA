import java.util.Scanner;
public class prog_4 {

	public static void main(String[] args) {
		Scanner data= new Scanner(System.in);
		
		int dia=0;
		int mes=0;
		
		do{
		System.out.println("Ingrese el mes de nacimiento 1-12 ");
		mes=data.nextInt();
		}while(mes<1 || mes>12);
		
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 ){
			
			do{
			System.out.println("Ingrese el dia de nacimiento: ");
			dia=data.nextInt();
				
					
				
			}while(dia<1 || dia>31);
			
			
				
				
			
		}
		
		
		else if(mes==4 || mes==6 || mes==9 || mes==11) {
			
			
			do {
				System.out.println("Ingrese el dia de nacimiento: ");
				dia=data.nextInt();
			
			
			
			
			}while(dia<1 || dia>30);
			
			
		}
		
		
		else if(mes==2) {
			
			
			
			do {
				System.out.println("Ingrese el dia de nacimiento: ");
				dia=data.nextInt();
			
			
				
			
			
			}while(dia<1 || dia>28);
			
		}
			
		signo(dia,mes);
		

	}
	
	
	
	public static void signo(int a, int b) {
		
		switch(b) {
		
		case 1: 
			if(a>=1 && a<=19)
				System.out.println("Capricornio");
			else 
				System.out.println("Acuario");
			break;
		case 2:
			if(a>=1 && a<=19)
				System.out.println("Acuario");
			else
				System.out.println("Piscis");
			
			break;
		case 3:	
			if(a>=1 && a<=20)
				System.out.println("Piscis");
			else
				System.out.println("Aries");
			break;
			
		case 4:
			if(a>=1 && a<=20)
				System.out.println("Aries");
			else
				System.out.println("Tauro");
			break;
			
			
		case 5:
			if(a>=1 && a<=20)
				System.out.println("Tauro");
			else
				System.out.println("Geminis");
			break;
			
		case 6:
			if(a>=1 && a<=21)
				System.out.println("Geminis");
			else
				System.out.println("Cancer");
			
			break;
			
			
		case 7:
			if(a>=1 && a<=22)
				System.out.println("Cancer");
			else
				System.out.println("Leo");
			
			break;
			
			
		case 8:
			if(a>=1 && a<=23)
				System.out.println("Leo");
			
			else
				System.out.println("Virgo");
			
			break;
			
			
			
		case 9:	
			if(a>=1 && a<=23)
				System.out.println("Virgo");
			else
				System.out.println("Libra");
			
			break;
			
			
			
			
		case 10:
			if(a>=1 && a<=22)
				System.out.println("Libra");
			else
				System.out.println("Escorpio");
			
			break;
			
			
			
		case 11:
			if(a>=1 && a<=22)
				System.out.println("Escorpio");
			else
				System.out.println("Sagitario");
			
			
			break;
			
			
			
		case 12:
			if(a>=1 && a<=21)
				System.out.println("Sagitario");
			else
				System.out.println("Capricornio");
			break;
		
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
