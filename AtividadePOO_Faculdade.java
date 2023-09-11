package Universidade;

import java.util.*;

public class NotaAluno {

	public static void main(String[] args) {

				Locale.setDefault(Locale.US);
		    	Scanner nt = new Scanner(System.in);
		    	
		    	InfoAluno infoAluno = new InfoAluno();

		        System.out.println("Digite as notas: ");
		        double a1 = nt.nextDouble();
		        double a2 = nt.nextDouble();
		        double a3 = nt.nextDouble();
		        double a4 = nt.nextDouble();
		        
		        //cria o array para passar pelos valores resultNota
		        double[] resultNota = InfoAluno.validaNota(a1, a2, a3, a4);

            //passa pelos 3 maiores notas
		        System.out.println("Notas Obtidas: " + resultNota[0] + ", " + resultNota[1] + ", " + resultNota[2]);

            //apresenta o valor da média de acordo com as notas obtidas
		        double media = InfoAluno.media(resultNota);
		        System.out.println("Média: " + media);

            //apresenta a situação do aluno  
		        String status = InfoAluno.situacao(media);
		        System.out.println("Situação: " + status);
	}
}

/*
package Universidade;

import java.util.*;

public class InfoAluno {

	
	static double a1;
	static double a2;
	static double a3;
	static double a4;


	public static String situacao(double media) {
		if(media < 6) {
			return "Reprovado!";
		}else {
			return "Aprovado!";
		}
	}
	
	public static double[] validaNota(double a1, double a2, double a3, double a4) {
		double[] notas = {a1, a2, a3, a4};
        Arrays.sort(notas); // Ordena as notas em ordem crescente

        // Os três maiores valores estarão nas posições 1, 2 e 3 do array após a ordenação
        double[] resultNota = {notas[3], notas[2], notas[1]}; 

        return resultNota;
	}

	public static double media(double[] resultNota) {
		double soma = 0;
		for(double nota : resultNota) {
			soma += nota;
		}
		
		return soma/3;
	}
	
	public static class Resultado {
        private double media;
        private double maior1;
        private double maior2;
        private double maior3;

        public Resultado(double media, double maior1, double maior2, double maior3) {
            this.media = media;
            this.maior1 = maior1;
            this.maior2 = maior2;
            this.maior3 = maior3;
        }

        public double getMedia() {
            return media;
        }

        public double getMaior1() {
            return maior1;
        }

        public double getMaior2() {
            return maior2;
        }

        public double getMaior3() {
            return maior3;
        }
    }

}

*/
