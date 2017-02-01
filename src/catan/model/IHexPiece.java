package catan.model;

/**
 * Created by josh on 12/14/2016.
 */
public interface IHexPiece {

  boolean isCornerValid(int corner);

  boolean isCornerEmpty(int corner);

  boolean isEdgeEmpty(int edge);

  void occupyCorner(int corner);

  void occupyEdge(int edge);

  void setResourceType(HexResource resourceType);

  HexResource getResourceType();

  int getNumCorners();

  int getNumEdges();

  void display();

}
