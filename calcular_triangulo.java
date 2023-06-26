package Application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y; // chamada do outro programa
		y = new Triangle(); //objeto (instancias da classe) tipo composta
		x = new Triangle(); //new: cria nova instancia do tipo "triangle = publica"
		
	System.out.println("Digite três números no triângulo X: ");
	
	x.a = sc.nextDouble(); //declaração de a,b e c conforme o outrou programa
	x.b = sc.nextDouble();	
	x.c = sc.nextDouble();
	
	System.out.println("Digite três números no triângulo Y: ");
	
	y.a = sc.nextDouble();
	y.b = sc.nextDouble();
	
	y.c = sc.nextDouble();
	
	double p = (x.a + x.b + x.c) / 2.0;
	double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
	
	p = (y.a + y.b + y.c) / 2.0;
	double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
	
	System.out.printf("Triângulo X area: %.4f%n", areaX);
	System.out.printf("Triângulo Y area: %.4f%n", areaY);
	
	if(areaX > areaY) {
		System.out.println("Largura da área: X");
	} else {
		System.out.println("Largura da área: Y");
	}
	
	sc.close();
	
	}
}

//////////////////////////////////////////////////////////////////////////*
PROGRAMA DA CLASSE COM TRÊS ATRIBUTOS

package entities;

public class Triangle {

	//classes
	public double a;
	public double b;
	public double c;
	
}
*////////////////////////////////////////////////////////////////////////////




