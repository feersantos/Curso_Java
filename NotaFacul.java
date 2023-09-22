
package javaapplication1;

/**
 *
 * @author 00293125
 */
import java.util.*;

public class NotaFacul {
    
    //Entada: atributos / variaveis
    //Processo: métodos / lógica de programação
    //Saída: Métodos ou exibição dos resultados
    
    public static void main(String[] args){ 
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("A1: ");
        float a1 = sc.nextFloat();
        System.out.print("A2: ");
        float a2 = sc.nextFloat(); 
        System.out.print("A3: ");  
        float a3 = sc.nextFloat();
              
    a1 = 3.0f;
    a2 = 2.5f;
    a3 = 3.5f;
    
    Aluno aluno; //chamando o metodo
    aluno = new Aluno(a1,a2,a3);  
    
    //aluno.a1 = 3.0f;
    //aluno.a2 = 2.5f;
    //aluno.a3 = 3.5f;
    
    System.out.println(aluno);
    
    
}
    }





/* METODO

package javaapplication1;


public class Aluno {
    
    float a1, a2;
    float a3;
    
    final float MEDIA = 6.0f; //quando é regra de negócio, coloca em maiusculo
    
    //valores iniciais
    public Aluno(){
        a1 = a2 = 0.0f;
        a3 = 0.0f;
    }
    
    public Aluno(float a1, float a2){
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = 0.0f;
    }
    
    
    public Aluno(float a1, float a2, float a3){
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = 0.0f;
    }
    
    //processo
    public float media(){
        return a1 + a2;
    }
    
    public float maiorNota(){
        return (a1 > a2) ? a1 : a2; //if
    }
    
    public float mediaFinal(){
        return (media() > MEDIA) ? media() : a3 + maiorNota();
    }
    
    String resultado(){
        if(media() < MEDIA){
            if(a3 >= 0.0f)
                return (mediaFinal() < MEDIA)?"Reprovado" : "Aprovado";
          return "Exame";
    } else 
          return "Aprovado";
    }
       
    @Override
    public String toString(){
       String saida = "BOLETIM";
       saida += "\nA1 = " + a1;
       saida += "\nA2 = " + a2;
       if(a3 > 0.0f)
           saida += "\nA3 = " + a3;
       saida += "\nMedia = " + media();
       saida += "\nMedia Final = " + mediaFinal();
       saida += "\nSituação do aluno = " + resultado();
       return saida;
    }
}
*/
