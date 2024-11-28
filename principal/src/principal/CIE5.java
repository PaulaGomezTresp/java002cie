package principal;

import java.util.Scanner;

public class CIE5 {
	public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	int numero1=0;
	int suma=0;
	int vueltas=0;
	int media=0;
	
	do {
		System.out.println("Dame una nota");
		numero1=scanner.nextInt();
		if (numero1<0) {
			suma=suma-numero1;
			vueltas=vueltas-1;
		}
		suma=suma+numero1;
		vueltas=vueltas+1;
	}while (numero1<-2 || numero1>0);
	System.out.println("Notas guardadas");
	
	System.out.println("La suma de sus notas es:"+suma);	
	

	media=suma/(vueltas);
	System.out.println("La media de sus notas es:"+media);

	
	scanner.close();
}}
