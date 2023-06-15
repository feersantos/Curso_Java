package Fixacao1;

import java.util.Locale;
import java.util.Scanner; 

public class scanner1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		char a;
				
		x = sc.next(); //textos sem espaços
		y = sc.nextInt(); //com números inteiros
		z = sc.nextDouble(); //com ponto fluante
		a = sc.next().charAt(0); // ler um caracter
		
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		System.out.printf("Você digitou: %.2f\n", z);
		System.out.println("Você digitou: " + a);
		
		System.out.println("Dados digitados:"); //digitar dados na mesma linha
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close(); //quando não precisar mais (tipo um dbclosearea)
				
	}

}
