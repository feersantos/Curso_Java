package Prod;

import java.util.*;

public class Mercado {
	
	public static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		
		int opcao;
		
		do {
		System.out.print("|---------------------Menu---------------------|\n");
		System.out.print("|----------------------------------------------|\n");
		System.out.print("| Opção 1 - Verificar produtos 				         |\n");
		System.out.print("| Opção 2 - Cadastar novo produto				       |\n");
		System.out.print("| Opção 0 - Sair				 				               |\n");
		System.out.print("|----------------------------------------------|\n");
		System.out.print("\nDigite uma opção: ");
		
		opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.print("\nOPÇÃO SELECIONADA: 1 - Verificar produtos \n");
			Produtos.itens();
		}else if (opcao == 2) {
			System.out.print("\nOPÇÃO SELECIONADA: 2 - Cadastrar novo produto \n");
			List<Produtos> listaProduto = new ArrayList<>();
			listaProduto.add(cadastrarNovoProd());			
		}else if (opcao == 0) {
			System.out.print("\nOPÇÃO SELECIONADA: 0 - Sair \n");
		}else {
			System.out.print("\nOPÇÃO SELECIONADA INVÁLIDA \n");
		}
		
		if (opcao != 0) {
			System.out.print("\nPressione Enter para voltar ao menu \n");
			sc.nextLine(); //Lê a quebra de linha
			sc.nextLine(); //Lê a entrada do usuário (Enter)
		}
		
		}while(opcao != 0); 
		
		sc.close();
		
			}
	
	public static Produtos cadastrarNovoProd() {
		
		Produtos prodMercado = new Produtos();
		
		System.out.print("Digite o nome do produto: 4) ");
		prodMercado.nomeProd = sc.next();
		
		System.out.print("Valor do produto: ");
		prodMercado.precoProd = sc.nextDouble();
		
		System.out.print("\nProduto cadastrado\n");
		
		return prodMercado;
	}
}

/* ---------------------- OUTRA CLASSE ----------------------
package Prod;

public class Produtos {

	public String nomeProd;
	
	public double precoProd;
	
	public double qtdProd;
	
	public double total() {
		return precoProd * qtdProd;
	}

	public static void itens() {
		System.out.print("|----------------------------------------------|\n");
		System.out.print("| 1) Ssd 254gb 	| R$: 150.00 				           |\n");
		System.out.print("| 2) Notebook i3 	| R$: 3550.00				         |\n");
		System.out.print("| 3) Mouse 		| R$: 110.00 				             |\n");
		System.out.print("|----------------------------------------------|\n");
	}
}

*/
