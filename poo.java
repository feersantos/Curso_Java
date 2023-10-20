/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_poo;

/**
 *
 * @author 00293125
 */
public class Carro {
    
    private int kmInicial;
    private int kmFinal;
    private float litros;
    
    //Construtor - valores iniciais
    public Carro(){
        kmInicial = kmFinal = 0;
        litros = 0.0f;
    }
    
    //Métodos - logica da solução
    public int distancia()
    {
        return getKmFinal() - getKmInicial();
    }
    
    public float consumo(){
        return distancia()/getLitros();
    }
    
    //metodo padrão de saida
    @Override
    public String toString(){
        String saida = "Distância (km) = " + distancia();
        saida += "\nConsumo (km/L): " + consumo();
        return saida;
    }
    
    //private iny kmInicial, kmFinal;
    //private float litros;

    /**
     * @return the kmInicial
     */
    public int getKmInicial() {
        return kmInicial;
    }

    /**
     * @param kmInicial the kmInicial to set
     */
    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    /**
     * @return the kmFinal
     */
    public int getKmFinal() {
        return kmFinal;
    }

    /**
     * @param kmFinal the kmFinal to set
     */
    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    /**
     * @return the litros
     */
    public float getLitros() {
        return litros;
    }

    /**
     * @param litros the litros to set
     */
    public void setLitros(float litros) {
        this.litros = litros;
    }

    
}

/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_poo;

/**
 *
 * @author 00293125
 */
public class KmCarro {
    
    public static void main(String[] args){
        
        Carro carro = new Carro();
        
        carro.setKmFinal(2700);
        carro.setKmInicial(2200);
        carro.setLitros(47);
        
        System.out.println(carro);
        
    }
    
}
*/
