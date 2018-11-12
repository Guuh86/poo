
public class LojaArray {
	private Loja[] shopping;
	private int quant;
	private int capacidade;
	
	public LojaArray() {
		shopping = new Loja[10];
	}
	
	public LojaArray(int quant) {
		shopping = new Loja[quant];
	}
	
	public boolean insere(Loja l) {
		if(quant < shopping.length) {
			shopping[quant] = l;
			quant++;
			return true;
		}
		return false;
	}
	
	/*
	 * private boolean estaCheio() {
		return capacidade == shopping.length;
	}
	*/
	
	public boolean remove(Loja loja) {
		int pos = -1;
		for(int i = 0; i < quant; i++) {
			if(shopping.equals(shopping[i])) {
				pos = i;
				break;
			}
		}
		
		if(pos != 1) {
			for(int i = pos; i < quant; i++) {
				shopping[i] = shopping[i + 1];
			}
			shopping[quant - 1] = null;
			quant--;
			return true;
		}
		return false;
	}
	
	
	public Loja[] retornaLoja() {
		Loja novo[] = new Loja[quant];
		
		for(int i = 0; i < quant; i++) {
			novo[i] = shopping[i];
		}
		return novo;
		
	}
	
	public Loja[] buscaLoja() {
		Loja x[] = new Loja[quant];
		
		for(int i = 0; i < quant; i++) {
			x[i] = shopping[i];
		}
		return x;
	}
	
	public Loja pesquisar(String nome) {
		for (int i = 0; i < quant; i++) {
			if(nome == shopping[i].getNome()) {
				return shopping[i];
			}
		}
		return null;
	}

}
