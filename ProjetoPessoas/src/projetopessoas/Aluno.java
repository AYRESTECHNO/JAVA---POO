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
public class Aluno extends Pessoa{ //Herança para Diferença ou Herança Completa
    //Atributos
    private int matr;
    private String curso;
    
    //Métodos Públicos
    public void cancelarMatr(int mat){
        System.out.println("Matrícula será Cancelada!");
    }
    
       
    //Métodos Especiais
    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
   
    
  

    
    
    
}
