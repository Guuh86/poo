import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de dias: ");
		int dia = s.nextInt();
		System.out.print("Digite a quantidade de horas: ");
		int hora = s.nextInt();
		System.out.print("Digite a quantidade de minutos: ");
		int min = s.nextInt();
		System.out.print("Digite a quantidade de segundos: ");
        int seg = s.nextInt();
        
        int x1 = dia * 86400;
        int x2 = hora * 3600;
        int x3 = min * 60;
        
        int total = (x1 + x2 + x3 + seg);
        
        System.out.println("O total em segundos é: " + total);
       
        
        
        
        
	}

}
