package construtores.estoque;

public class Estoque{
	private String nome;
	private int quantAtual;
	private int quantMinima;

	public Estoque(String nome, int quantAtual, int quantMinima) {
		this.nome = nome;
		this.quantAtual = quantAtual;
		this.quantMinima = quantMinima;
	}
	
	public Estoque() {
		
	}
	
	public void repor(int qtd) {
		quantAtual = quantAtual + qtd;
	}
	
	public void darBaixa(int qtd) {
		quantAtual = quantAtual - qtd;
	}
	
	public void mudarNome(String nome) {
		this.nome = nome;
	}
	
	public void mudarQuantAtual(int quantAtual) {
		if(quantAtual < 0) {
			this.quantAtual = 0;
		}else {
			this.quantAtual = quantAtual;
		}
	}
	
}