package garage;

public class WarehouseOpenDeviation extends Exception {

  public WarehouseOpenDeviation() {
    super();
  }

  public WarehouseOpenDeviation(String letter) {
    super(letter);
  }
}
