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
public class ProjetoPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Programa Principal
        //Criação dos Objetos
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        //Criando os Nomes
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        
        //Criando as Idades
        p1.setIdade(29);
        p2.setIdade(18);
        p3.setIdade(33);
        p4.setIdade(30);
        
        //Criando os Sexos
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");
        
        //Criando os Cursos
        p2.setCurso("Informática");
        
        //Criando os Salários
        p3.setSalario(2500.75f);
        
        
        //Criando os Setores
        p4.setSetor("Estoque");
        
        //Criando os Aumentos
        p3.receberAum(550.20f);
        
        //Cancelando as Matrículas
        p2.cancelarMatr(11111);
        
        //Mundando de Trabalho
        p4.mudarTrabalho();
        
        //Comandos com erros
        //p1.receberAum(550.20f);
        //p2.mudarTrabalho();
        //p4.cancelarMatr();
       
        
        //Mostrando o resultado
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
                
        
        
        
    }
    
}
