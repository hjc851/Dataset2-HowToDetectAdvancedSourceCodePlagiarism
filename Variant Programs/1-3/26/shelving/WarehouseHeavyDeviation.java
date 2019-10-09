package shelving;

public class WarehouseHeavyDeviation extends Exception {

  public WarehouseHeavyDeviation() {
    super();
  }

  public WarehouseHeavyDeviation(String substance) {
    super(substance);
  }
}
