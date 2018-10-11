import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite um valor em metros: ");
	    float m = s.nextInt();
		
	    float converter = m / 1000;
		
		System.out.println(m + " metros em milimetros é: " + converter);

	}

}
