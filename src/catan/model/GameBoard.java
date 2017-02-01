package catan.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by josh on 12/14/2016.
 */
public class GameBoard implements IGameBoard {

  private List<HexPiece> hexPieces;
  private int numResourceTiles;

  //constructor
  public GameBoard() {
    this.hexPieces = new ArrayList<>();
  }


  //utilize builder pattern to construct GameBoard with several optional arguments
  public static final class GameBoardBuilder {

    IGameBoard toBuild;

    public GameBoardBuilder() {
      this.toBuild = new GameBoard();
    }

    //default construction of standard board
    public IGameBoard build() {
      return this.toBuild;
    }
  }
}
