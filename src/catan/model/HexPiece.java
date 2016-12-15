package catan.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by josh on 12/14/2016.
 */
public class HexPiece implements IHexPiece {

  private static final int NUM_CORNERS = 6;
  private static final int NUM_EDGES = 6;
  private List<HexCorner> hexCorners = new ArrayList<>(NUM_CORNERS);
  private List<HexEdge> hexEdges = new ArrayList<>(NUM_EDGES);

  private HexResource resourceType;
  private int probabilityNum;

  //constructor
  public HexPiece() {
    //setup corners
    for (int i = 0; i < NUM_CORNERS; i++) {
      this.hexCorners.add(new HexCorner());
    }
    //setup edges
    for (int i = 0; i < NUM_EDGES; i++) {
      this.hexEdges.add(new HexEdge());
    }
  }

  @Override
  public boolean isCornerValid(int corner) {
    if (corner < 0 || corner >= NUM_CORNERS) {
      throw new IllegalArgumentException("Corner argument out of bounds.");
    }

    switch (corner) {
      case 0:
        return this.isCornerEmpty(NUM_CORNERS - 1) && this.isCornerEmpty(corner) &&
                this.isCornerEmpty(corner + 1);
      case NUM_CORNERS - 1:
        return this.isCornerEmpty(corner - 1) && this.isCornerEmpty(corner) &&
                this.isCornerEmpty(0);
      default:
        return this.isCornerEmpty(corner - 1) && this.isCornerEmpty(corner) &&
                this.isCornerEmpty(corner + 1);
    }

  }

  @Override
  public boolean isCornerEmpty(int corner) {
    if (corner < 0 || corner >= NUM_CORNERS) {
      throw new IllegalArgumentException("Corner argument out of bounds.");
    }

    return !this.hexCorners.get(corner).isOccupied();
  }

  @Override
  public boolean isEdgeEmpty(int edge) {
    if (edge < 0 || edge > NUM_EDGES) {
      throw new IllegalArgumentException("Edge argument out of bounds.");
    }

    if (!this.hexEdges.get(edge).isOccupied()) {
      return true;
    }

    return false;
  }

  @Override
  public void occupyCorner(int corner) {
    if (!this.isCornerValid(corner)) {
      throw new IllegalArgumentException("Cannot Occupy Corner, Invalid Placement.");
    }

    if (!this.isCornerEmpty(corner)) {
      throw new IllegalArgumentException("Corner is already occupied.");
    }

    this.hexCorners.get(corner).occupy();
  }

  @Override
  public void occupyEdge(int edge) {
    if (!this.isEdgeEmpty(edge)) {
      throw new IllegalArgumentException("Edge is already occupied.");
    }

    this.hexEdges.get(edge).occupy();

  }

  @Override
  public void setResourceType(HexResource resourceType) {
    this.resourceType = resourceType;
  }

  @Override
  public HexResource getResourceType() {
    return this.resourceType;
  }

  @Override
  public int getNumCorners() {
    return this.NUM_CORNERS;
  }

  @Override
  public int getNumEdges() {
    return this.NUM_EDGES;
  }
}
