package principal1;

public class CIEForm {

	public static void main(String[] args) {
		
		int [] lista= new int [] {2,20,10};
		System.out.println(lista[0]);
		System.out.println(lista[1]);
		System.out.println(lista[2]);
		
		System.out.println("*****************");
	
	 for (int i=0;i<lista.length;i++) {
		 System.out.print(i+"-->");
		 System.out.println(lista[i]);
	 }
}}