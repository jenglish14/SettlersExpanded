package catan.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by josh on 12/14/2016.
 */
public class CatanModel implements ICatanModel {

  private GameBoard gameBoard;
  private List<Player> players;
  private int numPlayers;

  public CatanModel() {
    this.gameBoard = new GameBoard();
    this.players = new ArrayList<>();
    for (Player p : Player.values()) {
      this.players.add(p);
    }
  }

  @Override
  public void setNumPlayers(int numPlayers) {
    this.numPlayers = numPlayers;
  }

  @Override
  public void printPlayers() {
    for (int i = 0; i < players.size(); i++) {
      System.out.println(players.get(i).toString());
    }
  }

}
