import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ler um int");
		int i = s.nextInt();
		System.out.println("Inteiro lido: " + i);
		
		System.out.println("Ler um longo");
		long l = s.nextLong();
		System.out.println("Longo: " + l);
		
		System.out.println("Ler um ponto flutuante");
		float f = s.nextFloat();
		System.out.println("Ponto flutuante: " + f);
		
		System.out.println("Ler um double");
		double d = s.nextDouble();
		System.out.println("Double: " + d);
		
		System.out.println("Ler uma string");
		String s1 = s.next();
		System.out.println("String: " + s1);
		s.nextLine();
		s1 = s.nextLine();
		System.out.println("String: " + s1);
		
		
	

	}

}
