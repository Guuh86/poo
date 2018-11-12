import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		LojaArray x = new LojaArray(10);
		Loja loja;
		
		for(;;) {
			System.out.println("----MENU----");
			System.out.println("1. Inserir");
			System.out.println("2. Remover");
			System.out.println("3. Listar");
			System.out.println("4. Pesquisar lojas");
			System.out.println("0. Finalizar");
			
			int y = s.nextInt();
			
			switch (y) {
			
			case 1:
				System.out.println("Código: ");
				long codigo = s.nextLong();
				System.out.println("Nome: ");
				String nome = s.next();
				System.out.println("Tipo: ");
				String tipo = s.next();
				System.out.println("Propietário: ");
				String propietario = s.next();
				
				loja = new Loja(codigo, nome, tipo, propietario);
				
				if(x.insere(loja)) {
					System.out.println("Loja cadastrada!");
				}else {
					System.out.println("Loja não cadastrada!");
				}
				
				break;
				
			case 2:
				System.out.print("Digite o código da loja: ");
				long codLoja = s.nextLong();
				
				loja = new Loja();
				loja.setCodigo(codLoja);
				
				if (x.remove(loja)) {
					System.out.println("Loja removida");
				}else {
					System.out.println("Não foi possível remover a loja");
				}
				
				break;
			
			case 3:
                Loja lojas[] = x.retornaLoja();
				
				if (lojas.length > 0) {
					for (Loja x1 : lojas) {
						System.out.println(x1);
					}
				}else {
					System.out.println("Não há lojas cadastradas");
				}
				
				break;
			
			case 4:
				System.out.println("Digite o nome da loja: ");
				String lojPesq = s.next();
				
				loja = x.pesquisar(lojPesq);
				
				if(loja != null) {
					System.out.println(loja);
				}else {
					System.out.println("Loja não cadastrada");
				}
				
			    break;
			
			case 0:
				System.out.println("Aplicação finalizada...");
				System.exit(0);
				
				break;

			default:
				System.out.println("A opção escolhida é inválida!!");
				
				break;
				
				
				
				
			}
		}
	}
}


