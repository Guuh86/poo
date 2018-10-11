package construtores.estoque;

public class EstoqueTeste {

	public static void main(String[] args) {
		Estoque estoque1 = new Estoque("Impressora Jato de Tinta", 13, 16);
		Estoque estoque2 = new Estoque("Monitor LCD 17 Polegadas", 13, 6);
		Estoque estoque3 = new Estoque("Mouse Ótico", 6, 2);
		
		estoque1.darBaixa(5);
		estoque2.repor(7);
		estoque3.darBaixa(4);
		
		//System.out.println("Estoque 01: " + estoque1.precisaRepor());
		//System.out.println("Estoque 02: " + estoque2.precisaRepor());
		//System.out.println("Estoque 03: " + estoque2.precisaRepor());
		
		if(estoque1.precisaRepor()) {
			System.out.println("Estoque 01 precisa ser reposto");
		}else {
			System.out.println("Estoque 01 não precisa ser reposto");
		}
		
		if(estoque2.precisaRepor()) {
			System.out.println("Estoque 02 precisa ser reposto");
		}else {
			System.out.println("Estoque 02 não precisa ser reposto");
		}
		
		if(estoque3.precisaRepor()) {
			System.out.println("Estoque 03 precisa ser reposto");
		}else {
			System.out.println("Estoque 03 não precisa ser reposto");
		}
		
		System.out.println(estoque1.descricao());
		System.out.println(estoque2.descricao());
		System.out.println(estoque3.descricao());
		

	}

}
