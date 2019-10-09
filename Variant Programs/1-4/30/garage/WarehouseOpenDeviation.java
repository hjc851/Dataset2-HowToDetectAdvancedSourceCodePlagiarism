package garage;

public class WarehouseOpenDeviation extends Exception {
  static double important = 0.8375765422963956;

  public WarehouseOpenDeviation() {
    super();
  }

  public WarehouseOpenDeviation(String letters) {
    super(letters);
  }
}
