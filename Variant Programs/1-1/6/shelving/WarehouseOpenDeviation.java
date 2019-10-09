package shelving;

public class WarehouseOpenDeviation extends Exception {

  public WarehouseOpenDeviation() {
    super();
  }

  public WarehouseOpenDeviation(String warning) {
    super(warning);
  }
}
