package Banc;

import java.util.*;
import Banc.InfoBanco;

public class Banco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		InfoBanco InfoBanco;
		
		//INFORMAR O NUMERO DA CONTA
		System.out.print("Informe o número da conta: ");
		int numConta = sc.nextInt();
		
		//INFORMAR O NOME DO DONO DA CONTA
		System.out.print("Informe o nome: ");
		sc.nextLine(); //consumir a quebra de linha
		String nome = sc.nextLine();
		
		//OPÇÃO PARA REALIZAR O DEPOSITO
		System.out.print("Deseja realizar o deposito? [s/n]");
		char resposta = sc.next().charAt(0);
		
		//VALIDAÇÃO DO DEPOSITO
		if(resposta == 's') {
			System.out.print("Digite o valor do deposito: ");
			double depositoInicial = sc.nextDouble();
			InfoBanco = new InfoBanco(numConta, nome, depositoInicial);
		}else {
			InfoBanco = new InfoBanco(numConta, nome); //se não for realizar o deposito
		}
		
		System.out.println("\nDados da conta: ");
		System.out.println(InfoBanco);
		
		//DEPOSITAR VALOR
		System.out.print("\nDigite o valor a ser depositado: ");
		double valorDepositado = sc.nextDouble();
		InfoBanco.deposito(valorDepositado);
		
		//DADOS ATUALIZADOS APÓS O DEPOSITO
		System.out.print("Dados atualizados na conta: ");
		System.out.println(InfoBanco);
		
		//SACAR VALOR
		System.out.print("\nDigite o valor a ser sacado: ");
		double valorSaque = sc.nextDouble();
		InfoBanco.saque(valorSaque);
		
		//DADOS ATUALIZADOS APÓS O SAQUE
		System.out.print("Dados atualizados na conta: ");
		System.out.println(InfoBanco);
		
		sc.close();
	}

}
/*CLASSE ------------------------------------------------------------------------------------------------------------
  package Banc;

public class InfoBanco {
	
	//atributos
	private int numConta;
	private String nome;
	private double saldoConta;
	
	public InfoBanco(int numConta, String nome) { //construtores com 2 argumentos
		this.numConta = numConta;
		this.nome = nome;
	}
	
	public InfoBanco(int numConta, String nome, double depositoInicial) { //construtores com 3 argumentos
		this.numConta = numConta;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public int getNumConta() { // obs.: não tem setNumConta pq o número da comta não pode ser alterado
		return numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public void deposito(double quantidade) {
		saldoConta += quantidade;
	}
	
	public void saque(double quantidade) {
		saldoConta -= quantidade + 5.0 ; //5.0 taxa
	}
	
	public String toString() {
		return "Número da Conta "
				+ numConta
				+ ", Nome: "
				+ nome
				+", Saldo da Conta R$: "
				+ String.format("%.2f", saldoConta);
	}
}
*/
