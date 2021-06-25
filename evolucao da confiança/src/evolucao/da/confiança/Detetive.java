
package evolucao.da.confiança;

import java.util.Scanner;
/*Comportamento: Colocar moeda, não colocar, colocar, colocar. Dependendo da jogada do player na 5º rodada, o detetive
muda seu compartamento para "sempre rouba" ou "olho por olho"
*/
public class Detetive { 
    
    Scanner entrada = new Scanner(System.in);
    
    public void jogar(){ 
        
        int player_moedas = 1;
        int bot_moedas = 1;
        int contagem_repeticao = 0;
        boolean bot_inseriu_moeda = true; //usada para alterar o comportamento do bot, no 2º laço vira false, depois volta a ser true.
        boolean jogador_roubou = false; //necessário saber a jogada do jogador na 5º jogada para saber o comportamento do detetive a seguir
        boolean ultima_jogada_roubou = true; //ultima jogada do player, variavel usada no comportamento olho por olho
        
        for(int jogadas = 0; jogadas <5; ++jogadas){ //5 repetiçoes pois depois o -for- muda o comportamento e é necessário fazer outro
            System.out.println("Digite 1 para inserir uma moeda ou 2 para não inserir.");
            int jogada = entrada.nextInt();
        
            if (jogada == 1){
                if (contagem_repeticao == 4){ //ultima passada do laço
                    jogador_roubou = false; 
                    ultima_jogada_roubou = false;
                }
                
                System.out.println("Você colocou a moeda");
                if (bot_inseriu_moeda == true){
                    System.out.println("Adversário inseriu a moeda");
                    player_moedas = player_moedas +2;
                    bot_moedas = bot_moedas +2;
                    System.out.println("Você e seu adversário ganharam 2 moedas");
                    System.out.println("Você possui " + player_moedas+ " moedas");
                    System.out.println("O adversário possui " + bot_moedas+ " moedas");
                    System.out.println(" ");
                }
                
                if (bot_inseriu_moeda == false){
                    System.out.println("Adversário não inseriu a moeda");
                    player_moedas = player_moedas -1;
                    bot_moedas = bot_moedas +3;
                    System.out.println("Você perdeu uma moeda e seu adversário ganhou 3");
                    System.out.println("Você possui " + player_moedas+ " moedas");
                    System.out.println("O adversário possui " + bot_moedas+ " moedas");
                    System.out.println(" ");
                }
            }
        
            if (jogada == 2){
                if (contagem_repeticao == 4){
                     jogador_roubou = true;
                     ultima_jogada_roubou = true;
                }
                
                System.out.println("Você não colocou a moeda");
                if (bot_inseriu_moeda == true){
                    System.out.println("Adversário inseriu a moeda");
                    player_moedas = player_moedas +3;
                    bot_moedas = bot_moedas -1;
                    System.out.println("Você ganhou 3 moedas e seu adversário perdeu 1");
                    System.out.println("Você possui " + player_moedas+ " moedas");
                    System.out.println("O adversário possui " + bot_moedas+ " moedas");
                    System.out.println(" ");
                }
                
                if (bot_inseriu_moeda == false){
                    System.out.println("Adversário não inseriu a moeda");
                    System.out.println("Ninguem ganhou moedas");
                    System.out.println("Você possui " + player_moedas+ " moedas");
                    System.out.println("O adversário possui " + bot_moedas+ " moedas");
                    System.out.println(" ");
                }    
            }
            
            contagem_repeticao = contagem_repeticao + 1;
            if (contagem_repeticao == 1){
                bot_inseriu_moeda = false;
            }
            
            if (contagem_repeticao != 1){
                bot_inseriu_moeda = true;
            }                                 
        }
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        if (jogador_roubou == true){ //como roubei na 5º jogada, comportamento muda para olho por olho (bot copia sua ultima jogada)
            for(int jogadas = 0; jogadas <3; ++jogadas){ //3 jogadas para, com as 5 do -for- anterior, fechar as 8 (pq eu quero que seja 8 :P)
                System.out.println("Digite 1 para inserir uma moeda ou 2 para não inserir.");
                int jogada = entrada.nextInt();
        
                if (jogada == 1){
                    System.out.println("Você colocou a moeda");                    
                    if (ultima_jogada_roubou == true){ //if usado para que o bot copie minha ultima jogada
                        bot_inseriu_moeda = false;
                    }
                    
                    if (ultima_jogada_roubou == false){ //if usado para que o bot copie minha ultima jogada
                        bot_inseriu_moeda = true;
                    }
                    
                    if (bot_inseriu_moeda == true){
                        System.out.println("Adversário inseriu a moeda");
                        player_moedas = player_moedas +2;
                        bot_moedas = bot_moedas +2;
                        System.out.println("Você e seu adversário ganharam 2 moedas");
                        System.out.println("Você possui " + player_moedas+ " moedas");
                        System.out.println("O adversário possui " + bot_moedas+ " moedas");
                        System.out.println(" ");
                    }
                    
                    if (bot_inseriu_moeda == false){
                        System.out.println("Adversário não inseriu a moeda");
                        player_moedas = player_moedas -1;
                        bot_moedas = bot_moedas +3;
                        System.out.println("Você perdeu 1 moeda e seu adversário ganhou 3");
                        System.out.println("Você possui " + player_moedas+ " moedas");
                        System.out.println("O adversário possui " + bot_moedas+ " moedas");
                        System.out.println(" ");
                    }
                    ultima_jogada_roubou = false; // como selecionei "1" eu insiro a moeda, entao mudo a variavel para ficar de acordo
                }
        
                if (jogada == 2){
                    System.out.println("Você não colocou a moeda");                   
                    if (ultima_jogada_roubou == true){
                        bot_inseriu_moeda = false;
                    }
                    
                    if (ultima_jogada_roubou == false){
                        bot_inseriu_moeda = true;
                    }
                    
                    if (bot_inseriu_moeda == true){
                        System.out.println("Adversário inseriu a moeda");
                        player_moedas = player_moedas +3;
                        bot_moedas = bot_moedas -1;
                        System.out.println("Você ganhou 3 moedas e seu adversário perdeu 1");
                        System.out.println("Você possui " + player_moedas+ " moedas");
                        System.out.println("O adversário possui " + bot_moedas+ " moedas");
                        System.out.println(" ");
                    }
                    
                    if (bot_inseriu_moeda == false){
                        System.out.println("Adversário não inseriu a moeda");
                        System.out.println("Ninguém ganhou moedas");
                        System.out.println("Você possui " + player_moedas+ " moedas");
                        System.out.println("O adversário possui " + bot_moedas+ " moedas");
                        System.out.println(" ");
                    }    
                ultima_jogada_roubou = true; // como selecionei "2" eu não insiro a moeda, entao mudo a variavel para ficar de acordo
                }
            }                                                    
        }
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        if (jogador_roubou == false){ //como não roubei na 5º jogada, comportamento muda para sempre rouba
            for(int jogadas = 0; jogadas <3; ++jogadas){
                System.out.println("Digite 1 para inserir uma moeda ou 2 para não inserir.");
                int jogada = entrada.nextInt();
        
                if (jogada == 1){
                    System.out.println("Você colocou a moeda");
                    System.out.println("Adversário não inseriu a moeda");
                    player_moedas = player_moedas -1;
                    bot_moedas = bot_moedas +3;
                    System.out.println("Você perdeu 1 moeda e seu adversário ganhou 3");
                    System.out.println("Você possui " + player_moedas+ " moedas");
                    System.out.println("O adversário possui " + bot_moedas+ " moedas");
                    System.out.println(" ");
                }
        
                if (jogada == 2){
                    System.out.println("Você não colocou a moeda");
                    System.out.println("Adversário não inseriu a moeda");
                    System.out.println("Ninguém ganhou moedas");
                    System.out.println("Você possui " + player_moedas+ " moedas");
                    System.out.println("O adversário possui " + bot_moedas+ " moedas");
                    System.out.println("");
                }
            }
        }
        System.out.println("Acabou! Moedas do adversário:"+bot_moedas+". Suas moedas:"+player_moedas);    
        if (bot_moedas > player_moedas){
            System.out.println("Metaforado! O Detetive venceu.");
        }
    
        if (player_moedas > bot_moedas){
            System.out.println("Sem pistas! Hoje não foi o dia do Detetive, você ganhou!");
        }
        
        if (player_moedas == bot_moedas){
            System.out.println("Deu empate!");
        }
    }
}
    

