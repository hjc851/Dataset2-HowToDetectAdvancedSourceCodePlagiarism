package store;

public class WarehouseOpenDeviation extends java.lang.Exception {
  public static final double reduceUnfree = 0.7939197219808202;

  public WarehouseOpenDeviation(String note) {
    super(note);
  }

  public WarehouseOpenDeviation() {
    super();
  }
}
