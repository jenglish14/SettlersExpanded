package catan.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by josh on 12/14/2016.
 */
public class HexPiece implements IHexPiece {

  private static final int NUM_CORNERS = 8;
  private static final int NUM_EDGES = 8;
  private List<HexCorner> hexCorners = new ArrayList<>(NUM_CORNERS);
  private List<HexEdge> hexEdges = new ArrayList<>(NUM_EDGES);

  private HexResource resourceType;
  private int probabilityNum;

  //constructor
  public HexPiece() {
    //code here
  }

  @Override
  public boolean isCornerEmpty(int corner) {
    if (corner < 0 || corner > NUM_CORNERS) {
      throw new IllegalArgumentException("Corner argument out of bounds.");
    }

    if (!this.hexCorners.get(corner).isOccupied()) {
      return true;
    }

    return false;
  }

  @Override
  public boolean isEdgeEmpty(int edge) {
    if (edge < 0 || edge > NUM_EDGES) {
      throw new IllegalArgumentException("Edge arguement out of bounds.");
    }

    if (!this.hexEdges.get(edge).isOccupied()) {
      return true;
    }

    return false;
  }

  @Override
  public void setResourceType(HexResource resourceType) {
    this.resourceType = resourceType;
  }

}
