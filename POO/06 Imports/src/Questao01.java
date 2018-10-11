import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite o 1° número: ");
		int n1 = s.nextInt();
		
		System.out.print("Digite o 2/ número: ");
		int n2 = s.nextInt();
		
		int soma = n1 + n2;
		System.out.println("A soma é " + soma);
		System.out.printf("A soma é %d", soma);

	}

}
