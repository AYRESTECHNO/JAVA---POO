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
public class Bolsista extends Aluno {
    //Atributos
    private float bolsa;
    
    
    
    
    //Métodos Públicos
    public void renovarBolsa(){
        System.out.println("Renovando a Bolsa do Aluno " + this.nome);
        
    }
    
    @Override //No JAVA é o Sobrepor
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Pagamento Facilitado!");
    }
    
    
    

    //Métodos Especiais
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
    
}
