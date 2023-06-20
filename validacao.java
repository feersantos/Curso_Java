package Fixacao1;

import java.util.Scanner;

public class exfic {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		 int n;
		 int in = 0;
		 int out = 0;
					 
	        do {
	            System.out.print("Digite um valor: ");
	            while (!sc.hasNextInt()) {
	                System.out.println("Erro: digite um valor válido.");
	                sc.next(); // Descarta o valor inválido
	            }
	            n = sc.nextInt();
	        } while (n <= 0);
		

		for(int i=0; i<n; i++) {
			
				if(n >= 10 && n <= 20) {
					in = in + 1;
				}
				else {
					out = out + 1;
				}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}
}
