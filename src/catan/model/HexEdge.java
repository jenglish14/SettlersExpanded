package catan.model;

/**
 * Created by josh on 12/15/2016.
 */
public class HexEdge {

  private boolean occupied;

  public void HexEdge() {
    this.occupied = false;
  }

  public void occupy() {
    this.occupied = true;
  }

  public boolean isOccupied() {
    return occupied;
  }

}
