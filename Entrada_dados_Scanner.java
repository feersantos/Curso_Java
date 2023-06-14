package Fixacao1;

import java.util.Scanner; 

public class scanner1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
				
		x = sc.next(); //textos sem espaços
		y = sc.nextInt(); //com números inteiros
		z = sc.nextDouble(); //com ponto fluante
		
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		System.out.println("Você digitou: " + z);
		
		sc.close(); //quando não precisar mais (tipo um dbclosearea)
				
	}

}
