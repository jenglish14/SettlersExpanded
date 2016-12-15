package catan.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by josh on 12/15/2016.
 */
public class HexPieceTest {

  @Test
  public void testCornersAndEdgesEmptyAfterConstruction() {
    HexPiece piece = new HexPiece();
    int numCorners = piece.getNumCorners();
    for (int i = 0; i < numCorners; i++) {
      assertEquals(true, piece.isCornerEmpty(i));
    }
    int numEdges = piece.getNumEdges();
    for (int i = 0; i < numEdges; i++) {
      assertEquals(true, piece.isEdgeEmpty(i));
    }
  }

  @Test
  public void testIsCornerValid() {
    HexPiece piece = new HexPiece();
    int numCorners = piece.getNumCorners();
    //test to assert every corner is valid after construction
    for (int i = 0; i < numCorners; i++) {
      assertEquals(true, piece.isCornerValid(i));
    }
  }

  @Test
  public void testSetResourceType() {
    HexPiece piece = new HexPiece();
    piece.setResourceType(HexResource.BRICK);
    assertEquals(HexResource.BRICK, piece.getResourceType());
  }

}
