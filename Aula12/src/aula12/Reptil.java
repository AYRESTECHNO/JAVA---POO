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
public class Reptil extends Animal {
    //Atributos
    private String corEscama;
    
    //Métodos Públicos
    @Override
    public void locomover() {
        System.out.println("Rastejando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil!");
    }
    
    //Métodos Especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
