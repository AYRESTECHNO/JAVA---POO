/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

/**
 *
 * @author JM
 */
public class Pessoa {
    //Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;
    
    //Métodos Públicos
    public void ganharExp(){
        
    }
    
    
    //Métodos Especiais
    

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

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

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "Nome= " + nome + ", Idade= " + idade 
                + ", Sexo= " + sexo + ", Experiência= " + experiencia + '}';
    }
    
    
    
}
