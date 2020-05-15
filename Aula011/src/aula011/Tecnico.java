/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula011;

/**
 *
 * @author JM
 */
public class Tecnico extends Aluno {
    //Atributos
    private int registroProfissional;
    
    
    //Métodos Públicos
    //@sobrepor
    public void pagarMesnalidade(){
        
    }
    
    
    
    //Métodos Especiais
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
    
}
