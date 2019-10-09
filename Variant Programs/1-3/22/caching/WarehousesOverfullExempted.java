package caching;

public class WarehousesOverfullExempted extends Exception {

  public WarehousesOverfullExempted() {
    super();
  }

  public WarehousesOverfullExempted(String comment) {
    super(comment);
  }

  public static final double unfree = 0.1620101230190697;
}
