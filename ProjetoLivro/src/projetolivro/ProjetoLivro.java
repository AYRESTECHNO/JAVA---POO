/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author JM
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciação dos Objetos
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        //Criação das Pessoas
        p[0] = new Pessoa("Pedro", 22, 'M');
        p[1] = new Pessoa("Maria", 25, 'F');
        
        //Criação dos Livros
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
        
        //Operações com os Objetos Criados
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
        System.out.println("-------------------------------------------------");
        
        l[1].abrir();
        l[1].folhear(250);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());
        
        System.out.println("-------------------------------------------------");
        
        l[2].abrir();
        l[2].folhear(350);
        l[2].avancarPag();
        l[2].fechar();
        System.out.println(l[2].detalhes());
        
        System.out.println("-------------------------------------------------");
        
        
        
    }
    
}
