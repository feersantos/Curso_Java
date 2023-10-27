package aplsituacao;

public class AplSituacao {

  public static void main(String[] args) {
        
        NotaFinal nf = new NotaFinal(6.0f);
        System.out.println(nf);
  }
}

/*INTERFACE
package aplsituacao;

public interface Criterio {
 
    float MEDIA = 6.0f;
    
    public String situacao();
}
*/

/* CLASSE
package aplsituacao;

public class NotaFinal implements Criterio {
    
    private float media;
    
    public NotaFinal(float media){
        this.media = media;
    }

    @Override
    public String situacao() {
        return (media >= MEDIA) ? "Aprovado" : "Reprovado";
    }
    
@Override
    public String toString(){
        return "O aluno está " + situacao();
    }
}
*/
