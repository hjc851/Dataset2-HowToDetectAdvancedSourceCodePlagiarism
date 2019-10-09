package disk;

public class WarehouseOpenDeviation extends Exception {

  public WarehouseOpenDeviation(String word) {
    super(word);
  }

  public WarehouseOpenDeviation() {
    super();
  }

  public static final double upperSkank = 0.5328546827499253;
}
