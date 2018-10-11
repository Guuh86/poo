package exercicios;

public class Cliente {
	private int Id;
	private String nome;
	private String fone;
	private Double renda;

	public Cliente() {

	}

	public Cliente(String nome, String fone, Double renda) {

	}

	public void setId(int Id) {
		this.Id = Id;

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public int getId() {
		return Id;
	}

	public String getNome() {
		return nome;
	}

	public String getFone() {
		return fone;
	}

	public Double getRenda() {
		return renda;
	}

	public String toString() {
		return "ID: " + Id + "\n" + "Nome: " + nome + "\n" + "Fone: " + fone + "\n" + "Renda: " + renda;
	}

}
