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
public abstract class Pessoa {
    //Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    
    //Métodos Públicos
    public final void fazerAniv(){ 
        this.idade++;
    
        
    }
    
    
    //Métodos Especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Dados {" + "nome = " + nome + ", idade  " + idade + " anos" + ", sexo = " + sexo + '}';
    }
    
    
    
    
    
}
