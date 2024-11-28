package principal;

import java.util.Scanner;

public class CIE3 {
	public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	int numero1=0;
	
		do {
			System.out.println("Dame una nota");
			numero1 = scanner.nextInt();
			System.out.println("Gracias");
		} while (numero1>0);
		System.out.println("Fin");
		

	
	scanner.close();
}}
