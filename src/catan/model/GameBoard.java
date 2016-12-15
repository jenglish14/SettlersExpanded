package catan.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by josh on 12/14/2016.
 */
public class GameBoard implements IGameBoard {

  private List<HexPiece> hexPieces;

  //constructor
  public GameBoard() {
    this.hexPieces = new ArrayList<>();
  }
}
