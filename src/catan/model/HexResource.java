package catan.model;

/**
 * Created by josh on 12/15/2016.
 */
public enum HexResource {

  OCEAN,
  WHEAT,
  BRICK,
  SHEEP,
  LOGS,
  DESERT;

  @Override
  public String toString() {
    switch(this) {
      case OCEAN:
        return "O";
      case WHEAT:
        return "W";
      case BRICK:
        return "B";
      case SHEEP:
        return "S";
      case LOGS:
        return "L";
      case DESERT:
        return "D";
      default:
        throw new IllegalArgumentException("Impossible Enum");
    }
  }

}
