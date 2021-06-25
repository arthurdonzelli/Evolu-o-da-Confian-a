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
public class Regras {

  App app = new App();

  public void regras(boolean player, boolean npc) { 
    if (player == true && npc == true) {
      app.npc_moedas = app.npc_moedas + 2;
      app.player_moedas = app.player_moedas + 2;
      System.out.println("Você possui " + app.player_moedas + " moedas");
              System.out.println(
                "O adversário possui " + app.npc_moedas + " moedas"
              );
              System.out.println(" ");
    } else if (player == true && npc == false) {
      app.npc_moedas = app.npc_moedas -1;
      app.player_moedas = app.player_moedas +3;
      System.out.println("Você possui " + app.player_moedas + " moedas");
              System.out.println(
                "O adversário possui " + app.npc_moedas + " moedas"
              );
              System.out.println(" ");
    } else if (player == false && npc == true) {
      app.npc_moedas = app.npc_moedas - 1;
      app.player_moedas = app.player_moedas + 3;
      System.out.println("Você possui " + app.player_moedas + " moedas");
              System.out.println(
                "O adversário possui " + app.npc_moedas + " moedas"
              );
              System.out.println(" ");
    }
  }
}
