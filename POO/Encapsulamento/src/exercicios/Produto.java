package exercicios;

public class Produto {
	private String nome;
	private Double precoCusto;
	private Double precoVenda;
	private Double margemLucro;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPrecoCusto(Double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	public void setMargemLucro(Double margemLucro) {
		this.margemLucro = margemLucro;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Double getPrecoCusto() {
		return precoCusto;
	}
	
	public Double getPrecoVenda() {
		return precoVenda;
	}
	
	public Double getMargemLucro() {
		return margemLucro;
	}
	
	public String toString() {
		return "Nome: " + nome + "Preço Custo: " + precoCusto + "Preço Venda: "
				+ precoVenda + "Margem Lucro: " + margemLucro;
	}
	
}
