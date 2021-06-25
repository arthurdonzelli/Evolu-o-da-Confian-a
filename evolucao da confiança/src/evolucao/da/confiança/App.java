/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolucao.da.confiança;

/**
 *
 * @author T-Gamer
 */


 import java.util.Random;
 import java.util.Scanner;

public class App {

  boolean flag_player;
  boolean flag_npc;
  int player_moedas = 1;
  int npc_moedas = 1;
  int rodadas = 0;

  public static void main(String[] args) {
    App app = new App();
    Detetive detetive = new Detetive();
    Desconfiado desconfiado = new Desconfiado();

    System.out.println("Bem-Vindo a Evolução da Confiança do Posser");
    Random random = new Random();
    int adversario = random.nextInt(2);

    
      if (adversario == 0) {
        detetive.jogar();
      }

      if (adversario == 1) {
          desconfiado.jogar();
        
      }
    
  }
}

