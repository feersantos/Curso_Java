package Prod;

import java.util.*;

public class Mercado {
	
	public static Scanner sc;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		sc = new Scanner(System.in);
		
		List<Produtos>listaProduto = new ArrayList<>();
		
		int opcao;
		
		
		do {
		System.out.print("|---------------------Menu---------------------|\n");
		System.out.print("|----------------------------------------------|\n");
		System.out.print("| Opção 1 - Verificar produtos 		 |\n");
		System.out.print("| Opção 2 - Cadastar novo produto		 |\n");
		System.out.print("| Opção 3 - Pesquisar produto			 |\n");
		System.out.print("| Opção 0 - Sair				 |\n");
		System.out.print("|----------------------------------------------|\n");
		System.out.print("\nDigite uma opção: ");
		
		opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.print("\nOPÇÃO SELECIONADA: 1 - Verificar produtos \n");
			listaProduto.addAll(listaItem());
				for(Produtos p : listaProduto) { //percoore cada item cadastrado na lista e armazena no p do tipo produto
				System.out.println("\nProduto: " + p.nomeProd);
				System.out.println("Valor: " + p.precoProd);
			}
		}else if (opcao == 2) {
			System.out.print("\nOPÇÃO SELECIONADA: 2 - Cadastrar novo produto \n");
			listaProduto.add(cadastrarNovoProd());
		}else if (opcao == 3) {
			System.out.print("\nOPÇÃO SELECIONADA: 3 - Pesquisar produto \n");
		    System.out.print("Digite o nome do produto a ser pesquisado: ");
		    String pesquisar = sc.next();

		    boolean buscaProd = false;
		    
		    if(!buscaProd) {
		    	for(Produtos p : listaItem()) { //verificia se o produto não foi encontrado na listaitem()
		    		if(p.nomeProd.equalsIgnoreCase(pesquisar)) { //compara o nome do produto com o que foi digitado no "pesquisar"
		    			System.out.println("\nProduto: " + p.nomeProd);
		    			System.out.println("Valor: " + p.precoProd);
		    			buscaProd = true; 
		    			break; //encerra o loop
		    		}
		    	}
		    }
		    
		    if(!buscaProd) {
		    	System.out.println("Produto não encontrado!");
		    }
		    
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
	



/*==================================LISTA DE PRODUTOS==================================*/
	public static List<Produtos> listaItem() {

		List<Produtos> listaItem = new ArrayList<>();
		
		Produtos item1 = new Produtos();
		item1.nomeProd = "Mouse";
		item1.precoProd = 94.99;
		listaItem.add(item1);
		
		Produtos item2 = new Produtos();
		item2.nomeProd = "Notebook I7";
		item2.precoProd = 7599.99;
		listaItem.add(item2);
		
		Produtos item3 = new Produtos();
		item3.nomeProd = "Notebook I3";
		item3.precoProd = 2549.99;
		listaItem.add(item3);
		
		Produtos item4 = new Produtos();
		item4.nomeProd = "Filtro de 4 linhas";
		item4.precoProd = 30.00;
		listaItem.add(item4);
		
		Produtos item5 = new Produtos();
		item5.nomeProd = "Conector RJ45 Ethernet";
		item5.precoProd = 3.49;
		listaItem.add(item5);
		
		Produtos item6 = new Produtos();
		item6.nomeProd = "Cabo HDMI";
		item6.precoProd = 20.00;
		listaItem.add(item6);
		
		return listaItem;
	}

	

/*==================================CADASTRAR PRODUTOS==================================*/
	public static Produtos cadastrarNovoProd() {
		
		Produtos prodMercado = new Produtos();
		
		//Produtos
		System.out.print("Digite o nome do produto: ");
		prodMercado.nomeProd = sc.next();
		
		//Valor
		System.out.print("Valor do produto: ");
		prodMercado.precoProd = sc.nextDouble();
		
		System.out.print("\nProduto cadastrado\n");
		
		
		return prodMercado;
	}
}







/* ---------------------- OUTRA CLASSE ----------------------

	String nomeProd;
	
	double precoProd;
	
	double qtdProd;
	
	/*public double total() {
		return precoProd * qtdProd;
	}*/
	
	public Produtos() {
		
	}

	public Produtos(String nomeProd, double precoProd) {
		this.nomeProd = nomeProd;
		this.precoProd = precoProd;
	}

	public String getNomeProd() {
		return nomeProd;
	}
	
	public double getPrecoProd() {
		return precoProd;
	}
	

}

*/
