package encapsulamento.pessoa;

public class Pessoa {
	
	
	
	private String nome;
	String nomePublico;
	private String endereco;
	private int idade;

	
	public Pessoa() {
		
	 }
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	 
	public int getIdade() {
		return idade;
	}
	
	public String toString() {
		return "Nome: " + nome + ", " + "Endereco: " + endereco + ", "
				+ "Idade: " + idade;
	}
}
