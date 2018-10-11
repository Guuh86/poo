import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite o valor da mercadoria: ");
		double mercadoria = s.nextDouble();
		System.out.print("Digite a porcentagem de desconto: ");
		double porcentagem = s.nextDouble();
		
		double desconto = (mercadoria * porcentagem) / 100;
		double total = mercadoria - desconto;
		
		System.out.println("O valor do desconto é de: " + desconto);
		System.out.println("O valor total a pagar é de: " + total);

	}

}
