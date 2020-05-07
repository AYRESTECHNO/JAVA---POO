/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author JM
 */
public class Caneta {
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   /*protected*/ private boolean tampada;  
    
   public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
   }
    
   public void rabiscar(){
        if(tampada == true){
            System.out.println("ERRO! Não Posso Rabiscar!!!");
        } else {
            System.out.println("Estou Rabiscando!!!");
        }
   }
    
   /*private*/ public void tampar(){
        this.tampada = true;
   }
   
   /*private*/ public void destampar(){
        this.tampada = false;
   }
        
}


