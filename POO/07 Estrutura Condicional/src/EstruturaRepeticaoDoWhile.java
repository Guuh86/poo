import java.util.Scanner;

public class EstruturaRepeticaoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1;
		
		do {
			System.out.println(x);
			x++;
		}while (x <= 10);
		
		Scanner s = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print("Informe um número positivo: ");
			n = s.nextInt();
		}while (n <= 0);
		System.out.println(n + " é positivo!");
	}

}
