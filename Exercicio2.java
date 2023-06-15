package Fixacao1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		/* 01. Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números
		 * com uma mensagem explicativa, conforme os exemplos.
		 * Entrada¹: 10 + 30 Soma = 40 / Entrada²: -30 + 10 Soma = -20 / Entrada³ = 0 - 0 Soma = 0.
		*/

		Scanner ab = new Scanner(System.in);
		
		int a, b;
		int soma;
		
		a = ab.nextInt();
		b = ab.nextInt();
		
		soma = a + b;
		
		System.out.println("Soma = " + soma);

		ab.close();
	}

}
