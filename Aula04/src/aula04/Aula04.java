/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author JM
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Caneta c1 = new Caneta();
        c1.setModelo("BIC");
        //c1.modelo = "BIC";
        
        c1.setPonta(0.5f);
        //c1.ponta = 0.5f;
        
        c1.status();
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        */
        
        Caneta c1 = new Caneta("NIC", 0.4f, "Amarelo");
        c1.status();
        
        Caneta c2 = new Caneta("BIC", 1.5f, "Laranja");
        c2.status();
        
    }
    
}
