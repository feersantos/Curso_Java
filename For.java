package Fixacao1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
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
