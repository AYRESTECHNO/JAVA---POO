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
public class ProjetoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciando os Objetos
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];

        
        //Criação dos Objetos               
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10  de HTML5");
        
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
                      
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] =  new Visualizacao (g[0], v[2]); //Jubileu assiste HTML5
        vis[0].avaliar();
        vis[1] =  new Visualizacao (g[0], v[1]); //Jubileu assiste PHP
        vis[0].avaliar(87.0f);
        
        //Operações com os Objetos 
        System.out.println(vis[0].toString());
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println(vis[1].toString());
        
        
        /*System.out.println("VÍDEOS\n-------------------------------------------------------------------------------------------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n-------------------------------------------------------------------------------------------------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
        
        
        
        
    }
    
}
