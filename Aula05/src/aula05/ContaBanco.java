package aula05;

/**
 *
 * @author JM
 */
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // Métodos Especiais
    public ContaBanco(){ // CONSTRUTOR
        this.saldo = 0;
        //this.setSaldo(0);
        this.status = false;
        //this.setStatus(false);
        
    }
    
    //Mostrar o Estado Atual
    public void estadoAtual(){
        System.out.println("------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono(a): " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("------------------------------------------");
        System.out.println("");
    }
        
    // Métodos - Procedimentos, Funções e Operações
    // Abrir Conta
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t)){
            //this.saldo = 50f;
            this.setSaldo(50);
        }else if("CP".equals(t)){
            //this.saldo = 150f;
            this.setSaldo(150);
            
        }
        
        System.out.println("Conta Aberta com Sucesso!");
    }
    
    //Fechar Conta
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada, porque ainda tem Dinheiro!");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada, pois tem Débito!");
        }else{
            this.setStatus(false);
            System.out.println("Conta Fechada com Sucesso!");
        }
    }
    
    //Depositar Valor
    public void depositar(float v){
        if(this.getStatus() == true){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito Realizado com Sucesso! Na Conta de " + this.getDono());
        }else{
            System.out.println("Impossível Depositar em uma Conta Fechada!");
        }
    }
    
    //Sacar Valor
    public void sacar(float v){
        if(this.getStatus() == true){
            if(this.getSaldo() >= v){
                //this.saldo = this.saldo - v;
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque Realizado com Sucesso! Na Conta de " + this.getDono());
            }else {
                System.out.println("Saldo Insuficiente para Saque!");
            }
        }else{
            System.out.println("Impossível Sacar de uma Conta Fechada!");
        }
    }
    
    //Pagar Mensal
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade Paga com Sucesso! Por " + this.getDono());
        }else{
            System.out.println("Impossível Pagar uma Conta Fechada!");
        }
            
    }
        
    // Métodos Getters e Setters

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
        
    
}
