package expolimorfismo;

public class ExPolimorfismo {

    public static void main(String[] args) {
        
        Classe1 c1 = new Classe1();
        c1.exibir();
        
        Classe2 c2 = new Classe2();
        c2.exibir();
        System.out.println(c2.mostrar());
        
    }
    
}

/* CLASSE1
package expolimorfismo;

public class Classe1 implements InterfaceTeste {

    @Override
    public void exibir() {
      System.out.println("A classe diz AAAA");
    }
}
*/

/* CLASSE2
package expolimorfismo;

public class Classe2 
        implements InterfaceTeste, NovaInterface{

    @Override
    public void exibir() {
       System.out.println("A Classe diz BBBB");
    }

    @Override
    public int mostrar() {
      return NUMERO;
    }
}
*/  INTERFACETESTE
package expolimorfismo;

//numa interface não escrevemos nada
public interface InterfaceTeste {
    
    public void exibir();
    
}
/*

/* NOVAINTERFACE

package expolimorfismo;

public interface NovaInterface {
    
    int NUMERO = 3545; //constante
    
    public int mostrar();
}
*/
