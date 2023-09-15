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
        
    float a1, a2;
    float a3;
                
    a1 = 3.0f;
    a2 = 2.5f;
    a3 = 3.5f;
    
    Aluno aluno; //chamando o metodo
    aluno = new Aluno();  
    
    aluno.a1 = 3.0f;
    aluno.a2 = 2.5f;
    aluno.a3 = 3.5f;
    
    System.out.println("Média = " + aluno.mediaFinal());
    System.out.println("Resultado = " + aluno.resultado());

    
}
    }





/* METODO
package javaapplication1;


public class Aluno {
    
    float a1, a2;
    float a3;
    
    final float MEDIA = 6.0f; //quando é regra de negócio, coloca em maiusculo
    
    //valores iniciais
    {
        a1 = a2 = 0.0f;
        a3 = 0.0f;
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
       
}



*/
