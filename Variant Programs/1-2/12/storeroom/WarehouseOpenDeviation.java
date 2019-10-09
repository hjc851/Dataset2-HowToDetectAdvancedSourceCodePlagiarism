package storeroom;

public class WarehouseOpenDeviation extends Exception {

  public WarehouseOpenDeviation() {
    super();
  }

  public WarehouseOpenDeviation(String address) {
    super(address);
  }
}
