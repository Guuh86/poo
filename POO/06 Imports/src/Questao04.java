import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite o seu sal�rio: ");
		double salario = s.nextDouble();
		
		System.out.print("Digite a porcentagem de aumento: ");
		double porcentagem = s.nextDouble();
		
		double aumento = (salario * porcentagem) / 100;
		double total = aumento + salario;
		
		System.out.println("O seu aumento � de: " + aumento);
		System.out.println("Seu novo sal�rio ser�: " + total);
		
	}


}
