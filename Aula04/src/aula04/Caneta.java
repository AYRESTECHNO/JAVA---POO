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
public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tamapada;
    
     //Criação dos Getters, Setters e do Construtor  Manualmente 
    /*public Caneta(){ // Este é o Método Construtor
        this.tampar();
        this.cor = "Azul";
    }
    
    public Caneta(String m, String c, float p){ // Este é o Método Construtor
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
        
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void tampar(){
        this.tamapada = true;
    }
    
    public void destampar(){
        this.tamapada = false;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tamapada);
    }*/
    
    //Construção dos Getters, Setters e Construtor automaticamente - No meu computador as teclas de atalho são Alt + Insert, nos demais são CTRL + I
    
    public Caneta(String modelo, float ponta, String cor) { //CONSTRUTOR
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }
    
    //Getters e Setters  - Gerados de forma automática.
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTamapada() {
        return tamapada;
    }

    public void setTamapada(boolean tamapada) {
        this.tamapada = tamapada;
    }

   
     
    //Criação do status foi manualmente. 
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tamapada);
    }
    
    
    
}
