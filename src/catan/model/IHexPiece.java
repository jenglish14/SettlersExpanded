package catan.model;

/**
 * Created by josh on 12/14/2016.
 */
public interface IHexPiece {

  boolean isCornerEmpty(int corner);

  boolean isEdgeEmpty(int edge);

  void setResourceType(HexResource resourceType);

}
