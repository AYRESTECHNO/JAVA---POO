/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivroteste;

/**
 *
 * @author JM
 */
public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private char sexo;
    
    
    //Métodos Públicos
    public void fazerAniver(){
        this.idade++;
    }
    
    //Métodos Especiais

    public Pessoa(String nome, int idade, char sexo) { //CONSTRUTOR
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
        //Getters e Setters

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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
        
    
}
