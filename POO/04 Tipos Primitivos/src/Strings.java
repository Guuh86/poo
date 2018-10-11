import javax.swing.JOptionPane;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
		s = "Texto";
		System.out.println("String: " + s);
		
		String nome = "Luiz Gustavo";
		System.out.println("String: " + nome);
		
		String obj = new String("Objeto");
		
		System.out.println("String: " + obj);
		
		
		
		String name = "Luiz Gustavo";
		
		System.out.println(nome == name);
		
		String obj2 = new String("Luiz Gustavo");
		
		System.out.println(nome == obj2);
		
		System.out.println(nome.equals(obj2));
		
		JOptionPane.showMessageDialog(null, 12345);
		
		System.out.println("Luiz" + "Gustavo"); 
	}

}
