/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author JM
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Criação ou Instanciando os Objetos
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        //Operações com os Objetos
        //Mamíferos
       /* System.out.println("-------------------------------------");
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        System.out.println("-------------------------------------");
        //Réptil
        r.setPeso(8.5f);
        r.setCorEscama("Verde");
        r.alimentar();
        r.locomover();
        r.emitirSom();
        System.out.println("-------------------------------------");
        //Peixe
        p.setPeso(4.2f);
        p.setCorEscama("Amarela");
        p.alimentar();
        p.locomover();
        p.emitirSom();
        System.out.println("-------------------------------------");
        //Ave
        a.setPeso(1.4f);
        a.setCorPena("Azul");
        a.alimentar();
        a.locomover();
        a.emitirSom();
        System.out.println("-------------------------------------");
        */
        
        //Criação ou Instanciação dos Objetos das Classes Filhas
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();
        
        //Operações com os Objetos das Classes Filhas
        System.out.println("-------------------------------------");
        //Canguru
        c.setPeso(55.4f);
        c.setCorPelo("Marrom");
        c.alimentar();
        c.locomover();
        c.emitirSom();
        System.out.println("-------------------------------------");
        //Cachorro
        k.setPeso(1.4f);
        k.setCorPelo("Marrom");
        k.alimentar();
        k.locomover();
        k.emitirSom();
        System.out.println("-------------------------------------");
        //Cobra
        j.setPeso(1.4f);
        j.setCorEscama("Vermelho");
        j.alimentar();
        j.locomover();
        j.emitirSom();
        System.out.println("-------------------------------------");
        //Tartaruga
        t.setPeso(150.45f);
        t.setCorEscama("Verde");
        t.alimentar();
        t.locomover();
        t.emitirSom();
        System.out.println("-------------------------------------");
        //Goldfish
        g.setPeso(5.3f);
        g.setCorEscama("Amarelo");
        g.alimentar();
        g.locomover();
        g.emitirSom();
        System.out.println("-------------------------------------");
        //Arara
        e.setPeso(3.5f);
        e.setCorPena("Azul");
        e.alimentar();
        e.locomover();
        e.emitirSom();
        System.out.println("-------------------------------------");
        
    }
    
}
