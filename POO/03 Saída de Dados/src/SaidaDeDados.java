import javax.swing.JOptionPane;

public class SaidaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Imprime na tela sem pular de linha");
		System.out.print(". Continua na mesma linha\n");
		System.out.println("Imprime pulando uma linha");
		//
		System.out.printf("-%s-\n", "Luiz Gustavo");
		System.out.printf("#%4d #\n", 123);
		
		JOptionPane.showMessageDialog(null, "Hello World!");
		System.out.println("String %s, inteiro %d, ponto flutuante %f");

	}

}
