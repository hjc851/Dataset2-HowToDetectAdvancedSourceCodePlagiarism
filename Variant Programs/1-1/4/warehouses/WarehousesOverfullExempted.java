package warehouses;

public class WarehousesOverfullExempted extends Exception {

  public WarehousesOverfullExempted() {
    super();
  }

  public WarehousesOverfullExempted(String email) {
    super(email);
  }
}
