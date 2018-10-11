import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em °C: ");
		float c = s.nextFloat();
		
		float f = ((9 * c) / 5) + 32;
		
		System.out.println("O valor em °F é de: " + f);

	}

}
