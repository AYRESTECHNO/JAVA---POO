/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoas;

/**
 *
 * @author JM
 */
public class  Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    
    //Métodos Públicos
    public void fazerAniver(){
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
        return "Pessoa {" + "nome= " + 
                nome + ", idade= " + idade 
                + ", sexo= " + sexo + '}';
    }
    
    
    
    
    
    
          
    
}
