import javax.swing.plaf.synth.SynthSeparatorUI;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Caractere
		
		char c;
		c = 'a';
		System.out.println("Caractere: " + c);
		c = 123;
		System.out.println("Caracatere: " + c);
		
		// Tipos num�ricos
		// Tipos inteiros
		
		byte b;
		b = 1;
		System.out.println("Byte: " + b);
		b++;
		System.out.println("Byte: " + b);
		
		short s; // 2 bytes
		s = -32000;
		System.out.println("Short: " + s);
		s = 32000;
		System.out.println("Short: " + s);
		
		int i; // 4 bytes
		i = 2000000;
		System.out.println("Inteiro: " + i);
		
		long l; // 8 bytes
		l = 123412345678986754L;
		System.out.println("Inteiro longo: " + l);
		
		//Pontos flutuantes
		
		float f; // 4 bytes
		f = 123.45F;
		System.out.println("Float: " + f);
		
		double d; // 8 bytes
		d = 1234345.98765;
		System.out.println("Dupla precis�o: " + d);
		
		double nc;
		nc = 1.12E12;
		System.out.println("Nota��o cient�fica: " + nc);
		nc = 1.2E-12;
		System.out.println("nota��o cient�fica: " + nc);
		
		// L�gico
		
		boolean logico;
		logico = true;
		System.out.println("Booleano: " + logico);
		logico = false;
		System.out.println("Booleano: " + logico);

	}

}
