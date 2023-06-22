package Fixacao1;

import java.util.Scanner;
//import java.util.Locale;

public class exfic {

	public static void main(String[] args) {
	
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 int n;
		 int in = 0;
		 int out = 0;
					 
	     System.out.print("Digite um valor: ");
	     	while (!sc.hasNextInt()) {
	                System.out.println("Erro: digite um valor válido.");
	                sc.next(); // Descarta o valor inválido
	        }
	        n = sc.nextInt();
	        n = Math.abs(n);
	        
	        for(int i=0; i<n; i++) {
			
				if(n >= 10 && n <= 20) {
					in ++;
				}
				else {
					out ++;
				}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
}
	
