
package evolucao.da.confiança;

import java.util.Scanner;


public class SempreRouba { //NUNCA vai colocar a moeda
    Scanner entrada = new Scanner(System.in);

    
    public void jogar(){
        
        int player_moedas = 1;
        int bot_moedas = 1;
        
        for (int jogadas = 0; jogadas < 8; ++jogadas){ //quantidade de jogadas (8)
        
            System.out.println("Digite 1 para inserir uma moeda ou 2 para não inserir.");
            int jogada = entrada.nextInt();
        
            if (jogada == 1){
                System.out.println("Você colocou a moeda.");
                System.out.println("Adversário não inseriu a moeda.");
                player_moedas = player_moedas -1;
                bot_moedas = bot_moedas +3;
                System.out.println("Você possui " + player_moedas+ " moedas.");
                System.out.println("O adversário possui " + bot_moedas+ " moedas.");
                System.out.println(" ");
            }
        
            if (jogada == 2){
                System.out.println("Você não colocou a moeda.");
                System.out.println("Adversário não inseriu a moeda.");
                System.out.println("Você possui " + player_moedas+ " moedas.");
                System.out.println("O adversário possui " + bot_moedas+ " moedas.");
                System.out.println("");
            }
           
        
        }
        System.out.println("Acabou! Moedas do adversário:"+bot_moedas+". Suas moedas:"+player_moedas);
        if (bot_moedas > player_moedas){
            System.out.println("Moscou parceiro, o ladrãozinho passo a mão nos teus cash!");
        }
    
        if (player_moedas == bot_moedas){
            System.out.println("Deu empate!");
        }
    }
}
