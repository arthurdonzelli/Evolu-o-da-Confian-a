
package evolucao.da.confiança;

import java.util.Scanner;


public class EvolucaoDaConfiança {

   
    public static void main(String[] args){
        
        Detetive Detetive = new Detetive();    
        SempreRouba SempreRouba = new SempreRouba();   
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Olá, essa é a lista de adversários. Digite o respectivo número de com quem deseja jogar!");
        System.out.println("1- Sou ladrão e vacilão");
        System.out.println("2- Ora ora ora, agora tudo faz sentido.");
        int adversario = entrada.nextInt();
        
        if (adversario == 1){
            SempreRouba.jogar();
        }
        
        if (adversario == 2){
            Detetive.jogar();
        } 
        
        
    }
    
}
