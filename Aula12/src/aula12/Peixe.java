/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author JM
 */
public class Peixe extends Animal {
    //Atributos
    private String corEscama;
    
    //Métodos Públicos

    @Override
    public void locomover() {
        System.out.println("Nadando!");        
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz Som!");
    }
    
    public void soltarBolha(){
        System.out.println("Soltou Bolha!");
    }
    
    //Métodos Especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

   
}
