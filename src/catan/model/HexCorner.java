package catan.model;

/**
 * Created by josh on 12/15/2016.
 */
public class HexCorner {

  private boolean occupied;

  public void HexCorner() {
    this.occupied = false;
  }

  public void occupy() {
    this.occupied = true;
  }

  public boolean isOccupied() {
    return occupied;
  }

}
