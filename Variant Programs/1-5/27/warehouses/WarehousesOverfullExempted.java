package warehouses;

public class WarehousesOverfullExempted extends Exception {

  public WarehousesOverfullExempted() {
    super();
  }

  public WarehousesOverfullExempted(String warning) {
    super(warning);
  }
}
