package depot;

public class WarehouseOpenDeviation extends Exception {

  public WarehouseOpenDeviation() {
    super();
  }

  public WarehouseOpenDeviation(String statement) {
    super(statement);
  }
}
