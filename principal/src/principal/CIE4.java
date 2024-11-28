package principal;

import java.util.Scanner;

public class CIE4 {
	public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	int numero1=0;
	
		do {
			System.out.println("Dame una nota");
			numero1 = scanner.nextInt();
			System.out.println("Gracias");
			if (numero1<0) {
				System.out.println("El número tiene que ser mayor que 0");
			}
			if (numero1>10) {
				System.out.println("El número ha de ser menor que 10");	
			}
			
		} while (numero1<0 || numero1>10);
		System.out.println("Fin");
		

	
	scanner.close();
}}
