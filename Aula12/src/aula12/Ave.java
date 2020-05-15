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
public class Ave extends Animal{
    //Atributos
    private String corPena;
    
    //Métodos Públicos
    @Override
    public void locomover() {
        System.out.println("Voando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave!");
    }
    
    public void fazerNinho(){
        System.out.println("Construiu Ninho!");
    }
    
    //Métodos Especiais

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
    
}
