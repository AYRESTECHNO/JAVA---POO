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
public class ProjetoLivroTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Criação das Pessoas
        Pessoa[] pe = new Pessoa[2];
        pe[0] = new Pessoa("Poliane Cardoso Duarte", 32, 'F');
        pe[1] = new Pessoa("João Marcos Aires Duarte", 35, 'M');
        
        //Criação dos Livros
        Livro[] li = new Livro[3];
        li[0] = new Livro("Introdução a Lógica de Programação com Algoritmos", "Amélia Silveira", 450, pe[1]);
        li[1] = new Livro("Anatomia - Introdução e Conceitos", "Maria Limeira Costa", 300, pe[0]);
        li[2] = new Livro("Primeiros Socorros - Da Teoria à Prática", "Luiz Menezes Souto", 900, pe[0]);
        
        
        //Operações com o Primeiro Livro
        li[0].abrir();
        li[0].folhear(300);
        li[0].avancarPag();
        System.out.println(li[0].detalhes());
        System.out.println("--------------------------------------------------------------------");
                
        
        //Operações com o Segundo Livro
        li[1].abrir();
        li[1].folhear(215);
        li[1].avancarPag();
        System.out.println(li[1].detalhes());
        System.out.println("--------------------------------------------------------------------");
        
        //Operações com o Terceiro Livro
        li[2].abrir();
        li[2].folhear(750);
        li[2].voltarPag();
        li[2].fechar();
        System.out.println(li[2].detalhes());
        System.out.println("--------------------------------------------------------------------");
        
    }
    
}
