import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a distancia da viagem em KM: ");
		double distancia = s.nextDouble();
		System.out.println("Digite a velocidade m�dia da viagem: ");
		double velocidade = s.nextDouble();
		
		double tempo = distancia / velocidade;
		
		System.out.println("O tempo de viagem ser� de: " + tempo + " hora(s)");

	}

}
