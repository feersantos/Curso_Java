package Fixacao1;

import java.util.Locale;
import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números inteiros: ");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3){
			System.out.println("O maior número é: " + n1);
		} else if (n2 > n3){
			System.out.println("O maior número é: " + n2);
		} else {
			System.out.println("O maior número é: " + n3);
		}
		
		sc.close();
	}

}
