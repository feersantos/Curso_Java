package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		//int y = 32;
		double x = 10.35784;
		
		//casas decimais
		System.out.println(x);
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		
		
		//alterar para vírgula
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n", x);
		System.out.println("RESULTADO = " + x +  " METROS"); //juntando textos
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		/*System.out.println(y);
		System.out.println("Bom dia!");*/

	}

}
