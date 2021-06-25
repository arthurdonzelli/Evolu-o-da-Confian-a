/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolucao.da.confiança;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class Desconfiado {   

  public void jogar() {
    System.out.println("Seu adversário é o Desconfiado");

    Scanner entrada = new Scanner(System.in);
    App app = new App();
    Regras regras = new Regras();
    app.flag_npc = true;
    app.flag_player = true;

    for (app.rodadas = 0; app.rodadas < 8; ++app.rodadas) {
      System.out.println(
        "Digite 1 para inserir uma moeda e 2 para não inserir uma moeda"
      );
      int inserir = entrada.nextInt();

      //#region\\

      switch (inserir) {
        case 1:
          if (app.flag_npc == false) {
            System.out.println("Seu adversário não inseriu uma moeda");
            regras.regras(app.flag_player, app.flag_npc);
          } else {
            System.out.println("Seu adversário inseriu uma moeda");
            regras.regras(app.flag_player, app.flag_npc);
          }
          break;
        case 2:
          app.flag_npc = false;
          System.out.println("Seu adversário não inseriu uma moeda");
          regras.regras(app.flag_player, app.flag_npc);

          break;
      }
      //#endregion

    }
  }
}

