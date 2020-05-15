package ultraemojicombat;

/**
 *
 * @author JM
 */
public class UltraEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador l[] = new Lutador[6];
        //Primeiro Lutador
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
                
        //Segundo Lutador
        l[1] = new Lutador("PutScript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
               
        //Terceiro Lutador
        l[2] = new Lutador("SnapShadown", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
               
        //Quarto Lutador
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
             
        //Quinto Lutador
        l[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
       
        
        //Sexto Lutador
        l[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
     
       // Utiização da agregação
       Luta UEC01 = new Luta();
       UEC01.marcarLuta(l[3], l[2]);
       UEC01.Lutar();
       l[3].status();
       l[2].status();
       
       
       
       
    
    }
    
}
