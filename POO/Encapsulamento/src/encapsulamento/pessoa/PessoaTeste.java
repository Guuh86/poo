package encapsulamento.pessoa;

public class PessoaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa();
		//p1.nomePublico = "Antonio";
		//p1.nome = "Antonio";
		
		//set --> Modifica
		p1.setNome("Luiz Gustavo");
		p1.setEndereco("Rua X, Número 0, Bairro Y");
		p1.setIdade(22);
		// get --> Acessa o atributo
		System.out.println("Nome: " + p1.getNome());
		System.out.println(p1.toString());

	}

}
