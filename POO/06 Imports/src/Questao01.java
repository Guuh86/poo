import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite o 1� n�mero: ");
		int n1 = s.nextInt();
		
		System.out.print("Digite o 2/ n�mero: ");
		int n2 = s.nextInt();
		
		int soma = n1 + n2;
		System.out.println("A soma � " + soma);
		System.out.printf("A soma � %d", soma);

	}

}
