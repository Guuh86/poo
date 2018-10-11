package exercicios;

public class ClienteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c = new Cliente();
		c.setId(1);
		c.setNome("Luiz");
		c.setFone("(12)345678912");
		c.setRenda(950.00);
		System.out.println(c.toString());

	}

}
