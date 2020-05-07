package aula05;

/**
 *
 * @author JM
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
        System.out.println("------------------------------------------------------");
        System.out.println("================== Seja Bem Vindo!====================");
        
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(123456);
        conta1.setDono("Jubileu");
        conta1.abrirConta("CC");  
        conta1.depositar(100);
        conta1.sacar(150);
        conta1.fecharConta();
        
        conta1.estadoAtual();
        
        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(654321);
        conta2.setDono("Creuza");
        conta2.abrirConta("CP");
        conta2.depositar(500);
        conta2.sacar(100);
        
        conta2.estadoAtual();
        
        System.out.println("=================== Volte Sempre!=====================");
        System.out.println("------------------------------------------------------");
        
       
        
    }
    
}
